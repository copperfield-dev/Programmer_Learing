import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseMessageDemo extends JFrame {
  public MouseMessageDemo() {
    MovableMessagePanel p = new MovableMessagePanel();

    setLayout(new BorderLayout());
    add(p);
  }

  public static void main(String[] args) {
    MouseMessageDemo frame = new MouseMessageDemo();
    frame.setSize(200, 100);
    frame.setTitle("Exercise16_7");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  static class MovableMessagePanel extends JPanel {
    private boolean flag = true;

    public MovableMessagePanel() {
      addMouseListener(new MouseAdapter() {
        public void mousePressed(MouseEvent e) {
          setBackground(Color.BLACK);
          repaint();
        }
      });

      addMouseListener(new MouseAdapter() {
        public void mouseReleased(MouseEvent e) {
          setBackground(Color.WHITE);
          repaint();
        }
      });
    }

    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
    }
  }
}