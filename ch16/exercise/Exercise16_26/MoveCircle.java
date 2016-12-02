import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveCircle extends JFrame {
  public MoveCircle() {
		setTitle("Exercise16.26");
		JPanel panel = new CirclePanel();

		add(panel, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		MoveCircle frame = new MoveCircle();
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

  class CirclePanel extends JPanel {
    int radius = 10;
    int xCenter;
    int yCenter;
    int x;
    int y;

    public CirclePanel() {
      xCenter = 200;
      yCenter = 200;
      x = xCenter;
      y = yCenter;

      addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          x = e.getX();
          y = e.getY();
          if (distance(x, y, xCenter, yCenter) <= radius) {
            addMouseMotionListener(new MouseMotionAdapter() {
              public void mouseDragged(MouseEvent t) {
                x = t.getX();
                y = t.getY();
                repaint();
              }
            });
          }
        }
      });  
    }

    protected void paintComponent(Graphics g) {
      super.paintComponent(g);

      g.drawArc(x - radius, y - radius, 2 * radius, 2 * radius, 0, 360);
    }
  }

  public static double distance(
    double x1, double y1, double x2, double y2) {
    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
  }
}

