import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CarDemo extends JFrame {
  public CarDemo() {
    add(new Car());
  }

  public static void main(String[] args) {
    CarDemo frame = new CarDemo();
    frame.setSize(600, 200);
    frame.setTitle("Exercise16_15");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  
}

class Car extends JPanel {
  private int xBase = 0;
  private Timer timer = new Timer(50, new TimerListener());
  
  public Car() {
    timer.start();

    this.setFocusable(true);
  }
  
  class TimerListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      repaint();
    }
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int yBase = getHeight();
    if (xBase > getWidth())
      xBase = -20;
    else
      xBase += 1;

    // Draw two wheels
    g.setColor(Color.BLACK);
    g.fillOval(xBase + 10, yBase - 10, 10, 10);
    g.fillOval(xBase + 30, yBase - 10, 10, 10);

    // Draw the car body
    g.setColor(Color.GREEN);
    g.fillRect(xBase, yBase - 20, 50, 10);

    // Draw the top
    g.setColor(Color.RED);
    Polygon polygon = new Polygon();
    polygon.addPoint(xBase + 10, yBase - 20);
    polygon.addPoint(xBase + 20, yBase - 30);
    polygon.addPoint(xBase + 30, yBase - 30);
    polygon.addPoint(xBase + 40, yBase - 20);
    g.fillPolygon(polygon);
  }
}
  

  
