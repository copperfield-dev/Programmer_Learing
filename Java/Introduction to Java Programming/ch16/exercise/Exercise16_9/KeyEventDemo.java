import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventDemo extends JFrame {
  private KeyboardPanel keyboardPanel = new KeyboardPanel();

  public KeyEventDemo() {
    add(keyboardPanel);

    keyboardPanel.setFocusable(true);
  }

  public static void main(String[] args) {
    KeyEventDemo frame = new KeyEventDemo();
    frame.setSize(500, 300);
    frame.setTitle("Exercise16_9");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  static class KeyboardPanel extends JPanel {
    private int x = 100;
    private int y = 100;
    private int nextX = 100;
    private int nextY = 100;

    public KeyboardPanel() {
      addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent e) {
          switch (e.getKeyCode()) {
            case KeyEvent.VK_DOWN: 
                x = nextX;
                y = nextY; 
                nextY = y + 10; 
                break;
            case KeyEvent.VK_UP: 
                x = nextX;
                y = nextY; 
                nextY = y - 10; 
                break;
            case KeyEvent.VK_LEFT: 
                x = nextX;
                y = nextY;
                nextX = x - 10;
                break;
            case KeyEvent.VK_RIGHT: 
                x = nextX;
                y = nextY;
                nextX = x + 10;
                break;
          }

          repaint();
        }
      });
    }

    protected void paintComponent(Graphics g) {
      //super.paintComponent(g);

      g.drawLine(x, y, nextX, nextY);
    }
  }
}