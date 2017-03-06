import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseMessageDemoA extends JFrame {
  public MouseMessageDemoA() {
    MovableMessagePanel p = new MovableMessagePanel();

    setLayout(new BorderLayout());
    add(p);
  }

  public static void main(String[] args) {
    MouseMessageDemoA frame = new MouseMessageDemoA();
    frame.setSize(200, 100);
    frame.setTitle("Exercise16_8");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  static class MovableMessagePanel extends JPanel {
    private int x = 20;
    private int y = 20;

    public MovableMessagePanel() {
      addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          x = e.getX();
          y = e.getY();
          
          repaint();
        }
      });
    }

    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawString("(" + x + ", " + y + ")", x, y);
    }
  }
}