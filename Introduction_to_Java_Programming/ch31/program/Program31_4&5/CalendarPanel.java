import sun.util.resources.cldr.ta.CalendarData_ta_IN;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by copperfield on 18/12/2016.
 */
public class CalendarPanel extends JPanel {
    private JLabel jlblHeader = new JLabel(" ", JLabel.CENTER);
    
    private JLabel[] jlblDay = new JLabel[49];
    
    private Calendar calendar;
    private int month;
    private int year;
    
    private JPanel jpDays = new JPanel(new GridLayout(0, 7));
    
    public CalendarPanel() {
        for (int i = 0; i < 49; i++) {
            jlblDay[i] = new JLabel();
            jlblDay[i].setBorder(new LineBorder(Color.BLACK, 1));
            jlblDay[i].setHorizontalAlignment(JLabel.RIGHT);
            jlblDay[i].setVerticalAlignment(JLabel.TOP);
        }
        
        this.setLayout(new BorderLayout());
        this.add(jlblHeader, BorderLayout.NORTH);
        this.add(jpDays, BorderLayout.CENTER);
        
        calendar = new GregorianCalendar();
        month = calendar.get(Calendar.MONTH);
        year = calendar.get(Calendar.YEAR);
        updateCalendar();
        
        showHeader();
        showDays();
    }
    
    private void showDays() {
        jpDays.removeAll();
        
        showDayNames();
        
        int startingWeekDayOfMonth = calendar.get(Calendar.DAY_OF_WEEK);   // The first weekday in this month
        
        Calendar cloneCalendar = (Calendar)calendar.clone();
        cloneCalendar.add(Calendar.DATE, -1);
        int daysInPrecedingMonth = cloneCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);  // The amount of days in the last month
        
        
        /* Fill the calendar with the days bedore this month */
        for (int i = 0; i < startingWeekDayOfMonth - 1; i++) {
            jlblDay[i + 7].setForeground(Color.LIGHT_GRAY);   // Add 7 because the first 7 labels is for weekday name
            jlblDay[i + 7].setText(daysInPrecedingMonth - startingWeekDayOfMonth + 2 + i + "");
            jpDays.add(jlblDay[i + 7]);
        }
        
        
        /* Display days of this month */
        int dayInCurentMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);    // The amount of days in this month
        for (int i = 1; i <= dayInCurentMonth; i++) {
            jlblDay[i - 2 + startingWeekDayOfMonth + 7].setForeground(Color.BLACK);
            jlblDay[i - 2 + startingWeekDayOfMonth + 7].setText(i + "");
            jpDays.add(jlblDay[i - 2 + startingWeekDayOfMonth + 7]);
        }
        
        
        /* Fill the calendar with the days after this month */
        int j = 1;
        for (int i = dayInCurentMonth - 1 + startingWeekDayOfMonth + 7;
                i % 7 != 0; i++) {
            jlblDay[i].setForeground(Color.LIGHT_GRAY);
            jlblDay[i].setText(j++ + "");
            jpDays.add(jlblDay[i]);
        }
        
        jpDays.repaint();
    }
    
    /* Set week label */
    private void showDayNames() {
        DateFormatSymbols dfs = new DateFormatSymbols(getLocale());
        String dayNames[] = dfs.getWeekdays();
        
        for (int i = 0; i < 7; i++) {
            jlblDay[i].setText(dayNames[i + 1]);
            jlblDay[i].setHorizontalAlignment(JLabel.CENTER);
            jpDays.add(jlblDay[i]);
        }
    }
    
    private void showHeader() {
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy", getLocale());
        String header = sdf.format(calendar.getTime());
        jlblHeader.setText(header);
    }
    
    private void updateCalendar() {
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DATE, 1);
    }
    
    public int getMonth() {
        return month;
    }
    
    public void setMonth(int newMonth) {
        month = newMonth;
        updateCalendar();
        showHeader();
        showDays();
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int newYear) {
        year = newYear;
        updateCalendar();
        showHeader();
        showDays();
    }
    
    public void changeLocale(Locale newLocale) {
        setLocale(newLocale);
        showHeader();
        showDays();
    }
}
