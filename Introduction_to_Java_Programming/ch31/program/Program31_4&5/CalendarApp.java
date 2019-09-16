import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by copperfield on 19/12/2016.
 */
public class CalendarApp extends JApplet {
    private CalendarPanel calendarPanel = new CalendarPanel();
    
    private Locale[] locales = Calendar.getAvailableLocales();
    private JComboBox jcboLocale = new JComboBox();
    
    private JButton jbtPrior = new JButton("Prior");
    private JButton jbtNext = new JButton("Next");
    
    public void init() {
        JPanel jpLocale = new JPanel(new FlowLayout());
        jpLocale.setBorder(new TitledBorder("Choose a locale"));
        jpLocale.add(jcboLocale);
        
        for (int i = 0; i < locales.length; i++) {
            jcboLocale.addItem(locales[i].getDisplayName());
        }
        
        JPanel jpButtons = new JPanel(new FlowLayout());
        jpButtons.add(jbtPrior);
        jpButtons.add(jbtNext);
        
        JPanel jpCalendar = new JPanel(new BorderLayout());
        jpCalendar.add(calendarPanel, BorderLayout.CENTER);
        jpCalendar.add(jpButtons, BorderLayout.SOUTH);
        
        add(jpCalendar, BorderLayout.CENTER);
        add(jpLocale, BorderLayout.SOUTH);
        
        jcboLocale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == jcboLocale)
                    calendarPanel.changeLocale(locales[jcboLocale.getSelectedIndex()]);
            }
        });
        
        jbtPrior.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentMonth = calendarPanel.getMonth();
                if (currentMonth == 0)
                    calendarPanel.setYear(calendarPanel.getYear() - 1);
                
                calendarPanel.setMonth(currentMonth - 1);
            }
        });
        
        jbtNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentMonth = calendarPanel.getMonth();
                if (currentMonth == 11)
                    calendarPanel.setYear(calendarPanel.getYear() + 1);
                
                calendarPanel.setMonth(currentMonth + 1);
            }
        });
        
        calendarPanel.changeLocale(locales[jcboLocale.getSelectedIndex()]);
    }
}
