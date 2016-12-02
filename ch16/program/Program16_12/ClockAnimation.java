import java.awt.event.*;
import javax.swing.*;

public class ClockAnimation extends JFrame {
  private StillClock clock = new StillClock();

  public ClockAnimation() {
    add(clock);

    Timer timer = new Timer(1000, new TimerListener());
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
    frame.setSize(200, 200);
    frame.setTitle("ClockAnimation");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}