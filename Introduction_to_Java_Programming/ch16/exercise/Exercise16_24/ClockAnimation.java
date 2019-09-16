import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class ClockAnimation extends JFrame {
  private JButton jbtStart = new JButton("Start");
  private JButton jbtStop = new JButton("Stop");
  private StillClock clock = new StillClock();
  private Timer timer = new Timer(1000, new TimerListener());
  
  public ClockAnimation() {
    JPanel panel = new JPanel();
    panel.add(jbtStart);
    panel.add(jbtStop);

    this.add(clock, BorderLayout.CENTER);
    this.add(panel, BorderLayout.SOUTH);

    jbtStart.addActionListener(new StartListener());
    jbtStop.addActionListener(new StopListener());

    timer.start();
  }

  private class TimerListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      clock.setCurrentTime();
      clock.repaint();
    }
  }

  public static void main(String[] args) {
    JFrame frame = new ClockAnimation();
    frame.setSize(200, 300);
    frame.setTitle("ClockAnimation");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  class StartListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      timer.start();
    }
  }

  class StopListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      timer.stop();
    }
  }
}