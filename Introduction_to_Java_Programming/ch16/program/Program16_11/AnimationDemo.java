import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnimationDemo extends JFrame {
  public AnimationDemo() {
    add(new MovingMessagePanel("message moving?"));
  }

  public static void main(String[] args) {
    AnimationDemo frame = new AnimationDemo();
    frame.setSize(280, 100);
    frame.setTitle("AnimationDemo");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  static class MovingMessagePanel extends JPanel {
    private String message = "Welcome to Java";
    private int xCoordinate = 0;
    private int yCoordinate = 20;

    public MovingMessagePanel(String message) {
      this.message = message;

      Timer timer = new Timer(1000, new TimerListener());
      timer.start();
    }

    protected void paintComponent(Graphics g) {
      super.paintComponent(g);

      if (xCoordinate > getWidth()) {
        xCoordinate = -20;
      }
      xCoordinate += 5;
      g.drawString(message, xCoordinate, yCoordinate);
    }

    class TimerListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
        repaint();
      }
    }
  }
}
  
