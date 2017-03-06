import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import java.util.*;

public class Demo extends JFrame { 
  private Calendar calendar = new GregorianCalendar();
  private int month = calendar.get(Calendar.MONTH);
  private int year = calendar.get(Calendar.YEAR);
  private JPanel jpTitle = new JPanel(new GridLayout(2, 1));
  private JPanel jpWeek = new JPanel(new GridLayout(1, 7));
  private JPanel jpCalendar = new JPanel(new GridLayout(6, 7));
 
  public static void main(String[] args) {
    Demo frame = new Demo();
    frame.setTitle("Exercise17_17");
    frame.setSize(600, 300);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public Demo() {
    setLayout(new BorderLayout());

    jpTitle.add(new JLabel(month + 1 + "/" + year, JLabel.CENTER));

    jpWeek.add(new JLabel("Sunday", JLabel.CENTER));
    jpWeek.add(new JLabel("Monday", JLabel.CENTER));
    jpWeek.add(new JLabel("Tuesday", JLabel.CENTER));
    jpWeek.add(new JLabel("Wednesday", JLabel.CENTER));
    jpWeek.add(new JLabel("Thursday", JLabel.CENTER));
    jpWeek.add(new JLabel("Friday", JLabel.CENTER));
    jpWeek.add(new JLabel("Saturday", JLabel.CENTER));
    jpWeek.setBorder(new LineBorder(Color.BLACK));
    jpTitle.add(jpWeek);
    add(jpTitle, BorderLayout.NORTH);

    calendar.set(Calendar.YEAR, year);
    calendar.set(Calendar.MONTH, month);
    calendar.set(Calendar.DATE, 1);

    int firstDay = calendar.get(Calendar.DAY_OF_WEEK);
    int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    for (int i = 0; i < firstDay - 1; i++) {
      jpCalendar.add(new JLabel());
    }

    JLabel[] jlblDay = new JLabel[daysInMonth];
    for (int i = 1; i <= daysInMonth; i++) {
      jlblDay[i - 1] = new JLabel(i + "");
      jlblDay[i - 1].setBorder(new LineBorder(Color.BLACK));
      jlblDay[i - 1].setHorizontalAlignment(JLabel.RIGHT);
      jlblDay[i - 1].setVerticalAlignment(JLabel.TOP);
      jpCalendar.add(jlblDay[i - 1]);
    }

    for (int i = 0; i < 42 - daysInMonth - firstDay + 1; i++) {
      jpCalendar.add(new JLabel());
    }
    jpCalendar.setBorder(new EmptyBorder(4, 4, 4, 4));
    add(jpCalendar, BorderLayout.CENTER);
  }
}

    