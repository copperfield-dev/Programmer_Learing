import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseMessageDemoB extends JFrame {
  public MouseMessageDemoB() {
    MovableMessagePanel p = new MovableMessagePanel();

    setLayout(new BorderLayout());
    add(p);
  }

  public static void main(String[] args) {
    MouseMessageDemoB frame = new MouseMessageDemoB();
    frame.setSize(200, 100);
    frame.setTitle("Exercise16_8");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  static class MovableMessagePanel extends JPanel {
    private int x = 20;
    private int y = 20;
    private boolean flag = true;

    public MovableMessagePanel() {
      addMouseListener(new MouseAdapter() {
        public void mousePressed(MouseEvent e) {
          x = e.getX();
          y = e.getY();
          flag = true;
          repaint();
        }
      });

      addMouseListener(new MouseAdapter() {
        public void mouseReleased(MouseEvent e) {
          flag = false;
          repaint();
        }
      });
    }

    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      if (flag) {
        g.drawString("(" + x + ", " + y + ")", x, y);
      }
    }
  }
}