import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Demo extends JFrame {
  private StillClock clock = new  StillClock();
  private JTextField jtfHour = new JTextField(10);
  private JTextField jtfMinute = new JTextField(10);
  private JTextField jtfSecond = new JTextField(10);

  public static void main(String[] args) {
    Demo frame = new Demo();
    frame.setTitle("Exercise17_7");
    frame.setSize(500, 500);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public Demo() {
    setLayout(new BorderLayout());
    add(clock, BorderLayout.CENTER);

    JPanel panel = new JPanel();
    panel.add(new JLabel("Hour"));
    panel.add(jtfHour);
    panel.add(new JLabel("Minute"));
    panel.add(jtfMinute);
    panel.add(new JLabel("Second"));
    panel.add(jtfSecond);
    add(panel, BorderLayout.SOUTH);

    jtfHour.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String hourString = jtfHour.getText();
        int hour = Integer.parseInt(hourString);
        clock.setHour(hour);
        jtfHour.requestFocusInWindow();
      }
    });

    jtfMinute.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String minuteString = jtfMinute.getText();
        int minute = Integer.parseInt(minuteString);
        clock.setMinute(minute);
        jtfMinute.requestFocusInWindow();
      }
    });

    jtfSecond.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String secondString = jtfSecond.getText();
        int second = Integer.parseInt(secondString);
        clock.setSecond(second);
        jtfSecond.requestFocusInWindow();
      }
    });
  }
}