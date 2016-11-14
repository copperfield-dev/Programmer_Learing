import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HandEyeCoordination extends JFrame {
  public HandEyeCoordination() {
		setTitle("Exercise16.27");
		JPanel panel = new CirclePanel();

		add(panel, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		HandEyeCoordination frame = new HandEyeCoordination();
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

  class CirclePanel extends JPanel {
    private int radius = 10;
    private int xCenter;
    private int yCenter;
    private int x;
    private int y;
    private long count = 0;

    private long startTime = System.currentTimeMillis();

    public CirclePanel() {
      addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          x = e.getX();
          y = e.getY();
          if (distance(x, y, xCenter, yCenter) <= radius) {
            repaint();
          }
        }
      });  
    }

    protected void paintComponent(Graphics g) {
      super.paintComponent(g);

      if (count >= 20) {
        long endTime = System.currentTimeMillis();
        g.drawString("Time spent: " + (endTime - startTime) + 
          " milliseconds", 20, 20);
      } else {
        count++; // Increase the count

        xCenter = (int) (getWidth() * Math.random());
        yCenter = (int) (getHeight() * Math.random());

        g.setColor(new Color((int) (Math.random() * 128),
            (int) (Math.random() * 128), (int) (Math.random() * 128)));
        g.fillOval(xCenter - radius, yCenter - radius, 2 * radius, 2 * radius);
      }
    }
  }

  public static double distance(
    double x1, double y1, double x2, double y2) {
    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
  }
}

