import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IsInRectangle extends JFrame {
	private RectanglePanel rectangle = new RectanglePanel();

  public static void main(String[] args) {
    IsInRectangle frame = new IsInRectangle();
    frame.setTitle("IsInRectangle?");
    frame.setSize(300, 300);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public IsInRectangle() {
    this.add(rectangle, BorderLayout.CENTER);
  }

  class RectanglePanel extends JPanel {
    private int width = 100;
    private int height = 40;
    private int x;
    private int y;
    private String message;

    public RectanglePanel() {
      addMouseMotionListener(new MouseMotionAdapter() {
        public void mouseMoved(MouseEvent e) {
          x = e.getX();
          y = e.getY();
          double horizontaldistance = Math.abs(x - 100);
          double verticaldistance = Math.abs(y - 60);
          if (horizontaldistance <= width / 2 && verticaldistance <= height / 2)
            message = "Mouse point is in the rectangle";
          else 
            message = "Mouse point is not in the rectangle";

          repaint();
        }
      });
    }

    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawRect(100 - width / 2, 60 - height / 2,
        width, height);
      g.drawString(message, x, y);
    }
  }
}