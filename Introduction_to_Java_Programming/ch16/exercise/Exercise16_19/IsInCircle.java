import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IsInCircle extends JFrame {
  private CirclePanel canvas = new CirclePanel();

	public static void main(String[] args) {
    IsInCircle frame = new IsInCircle();
    frame.setTitle("IsInCircle?");
    frame.setSize(300, 300);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public IsInCircle() {
    this.add(canvas, BorderLayout.CENTER);
  }

  class CirclePanel extends JPanel {
    private int radius = 50;
    private int x;
    private int y;
    private String message;

    public CirclePanel() {
      addMouseMotionListener(new MouseMotionAdapter() {
        public void mouseMoved(MouseEvent e) {
          x = e.getX();
          y = e.getY();
          double distance = Math.pow(Math.pow((x - getWidth() / 2), 2) 
            + Math.pow((y - getHeight() / 2), 2), 0.5);
          if (distance <= radius)
            message = "Mouse point is in the circle";
          else 
            message = "Mouse point is not in the circle";

          repaint();
        }
      });
    }

    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius,
        2 * radius, 2 * radius);
      g.drawString(message, x, y);
    }
  }
}