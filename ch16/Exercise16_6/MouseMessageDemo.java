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
    frame.setTitle("Exercise16_6");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  static class MovableMessagePanel extends JPanel {
    private String message = "Java is fun";
    private boolean flag = true;
    private int x = 20;
    private int y = 20;

    public MovableMessagePanel() {
      addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          flag = !flag;  
          if (flag == true) message = "Java is fun";
          else if (flag == false) message = "Java is powerful";
          repaint();
        }
      });
    }

    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawString(message, x, y);
    }
  }
}