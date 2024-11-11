// WorldClock.java: Contains an international clock
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.GregorianCalendar;
import java.text.*;

public class WorldClock extends JPanel
  implements ActionListener {
  private Timer timer = new Timer(1000, this);
  private StillClock clock = new StillClock();
  private JLabel jlblDigitTime = new JLabel("", JLabel.CENTER);

  public WorldClock() {
    setLayout(new BorderLayout());
    add(clock, BorderLayout.CENTER);
    add(jlblDigitTime, BorderLayout.SOUTH);
    timer.start();
  }

  public void actionPerformed(ActionEvent e) {
    Calendar calendar = new GregorianCalendar(); 
    clock.setHour(calendar.get(Calendar.HOUR));
    clock.setMinute(calendar.get(Calendar.MINUTE));
    clock.setSecond(calendar.get(Calendar.SECOND));

    // Display digit time on the label
    DateFormat formatter = DateFormat.getDateTimeInstance
      (DateFormat.MEDIUM, DateFormat.LONG, getLocale());
    jlblDigitTime.setText(formatter.format(calendar.getTime()));
  }
}

