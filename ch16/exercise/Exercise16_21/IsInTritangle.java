import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IsInTritangle extends JFrame {
  private TritanglePanel tritangle = new TritanglePanel();

	public static void main(String[] args) {
    IsInTritangle frame = new IsInTritangle();
    frame.setTitle("IsInTritangle?");
    frame.setSize(300, 300);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public IsInTritangle() {
    this.add(tritangle, BorderLayout.CENTER);
  }

  class TritanglePanel extends JPanel {
    private int xA = 20;
    private int yA = 20;
    private int xB = 100;
    private int yB = 100;
    private int xC = 140;
    private int yC = 40;

    private Polygon polygon = new Polygon();

    private int x;
    private int y;
    private String message;

    public TritanglePanel() {
      polygon.addPoint(xA, yA);
      polygon.addPoint(xB, yB);
      polygon.addPoint(xC, yC);
      addMouseMotionListener(new MouseMotionAdapter() {
        public void mouseMoved(MouseEvent e) {
          x = e.getX();
          y = e.getY();
          boolean state1, state2, state3;
          double a, b, c;

          a = y - yA;
          b = xA - x;
          c = x * yA - xA * y;
          if ((a * xB + b * yB + c) * (a * xC + b * yC + c) > 0)
            state1 = true;
          else state1 = false;

          a = y - yB;
          b = xB - x;
          c = x * yB - xB * y;
          if ((a * xA + b * yA + c) * (a * xC + b * yC + c) > 0)
            state2 = true;
          else state2 = false;
          
          a = y - yC;
          b = xC - x;
          c = x * yC - xC * y;
          if ((a * xA + b * yA + c) * (a * xB + b * yB + c) > 0)
            state3 = true;
          else state3 = false;

          if (state1 || state2 || state3)
            message = "Mouse point is not in the tritangle";
          else 
            message = "Mouse point is in the tritangle";

          repaint();
        }
      });
    }

    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawPolygon(polygon);
      g.drawString(message, x, y);
    }
	}
}