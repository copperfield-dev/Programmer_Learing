import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SlideDemo extends JFrame {
  private final static int NUMBER_OF_SLIDES = 25;
  private final static int SHOW_TIME_PER_SLIDE = 1000;

  private int current = 0;
  private JLabel jlbImageLabel = new JLabel();

  public SlideDemo() {
    add(jlbImageLabel);

    jlbImageLabel.setIcon(new ImageIcon("image/slide0.jpg"));
    Timer timer = new Timer(SHOW_TIME_PER_SLIDE, new TimerListener());
    timer.start();
  }

  public static void main(String[] args) {
    SlideDemo frame = new SlideDemo();
    frame.setSize(800, 600);
    frame.setTitle("Exercise16_13");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  class TimerListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      jlbImageLabel.setIcon(new ImageIcon("image/slide" + 
                          current + ".jpg"));
      current = (current + 1) % NUMBER_OF_SLIDES;
    }
  }
}
  
