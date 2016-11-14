import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;

public class SwayBall extends JFrame {
  private PalindromePanel canvas = new PalindromePanel();

  public SwayBall() {
    this.add(canvas, BorderLayout.CENTER);
  }

  public static void main(String[] args) {
    JFrame frame = new SwayBall();
    frame.setTitle("Exercise16_33");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200, 250);
    frame.setVisible(true);
  }

  class PalindromePanel extends JPanel {
    int palindromeRadius = 150;
    int ballRadius = 10;
    int leftAngle = 120;
    int rightAngle = 60;
    int angle = leftAngle; // Start from leftAngle
    int angleDelta = 1; // Swing interval
    int delay = 100;

    Timer timer = new Timer(delay, new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        repaint();
      }
    });

    PalindromePanel() {
      timer.start();
      
      this.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent e) {
          switch (e.getKeyCode()) {
            case KeyEvent.VK_DOWN: delay += 10; break;
            case KeyEvent.VK_UP: delay -= 10; break;
            case KeyEvent.VK_S: timer.stop(); break;
            case KeyEvent.VK_R: timer.start(); break;
          }

          if (delay < 0) delay = 10; // delay cannot be negative
          
          timer.setDelay(delay);
      }});
      
      // Set focus
      setFocusable(true);
    }

    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      
      int x1 = getWidth() / 2;
      int y1 = 20;
      
      if (angle < rightAngle)
        angleDelta = 1; // Swing to the left
      else if (angle > leftAngle)
        angleDelta = -1; // Swing to the right
      
      angle += angleDelta;
      int x = x1 + (int)(palindromeRadius * Math.cos(Math.toRadians(angle)));
      int y = y1 + (int)(palindromeRadius * Math.sin(Math.toRadians(angle)));
      
      g.drawLine(x1, y1, x, y);
      g.fillOval(x1 - 2, y1 - 2, 4, 4);
      g.fillOval(x - ballRadius, y - ballRadius, 2 * ballRadius, 2 * ballRadius);      
    }
  }
}