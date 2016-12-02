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
    frame.setSize(300, 300);
    frame.setTitle("KeyEventDemo");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  static class KeyboardPanel extends JPanel {
    private int x = 100;
    private int y = 100;
    private String str = "";

    public KeyboardPanel() {
      addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent e) {
          switch (e.getKeyCode()) {
            case KeyEvent.VK_DOWN: y += 10; break;
            case KeyEvent.VK_UP: y -= 10; break;
            case KeyEvent.VK_LEFT: x -= 10; break;
            case KeyEvent.VK_RIGHT: x += 10; break;
            default: str += e.getKeyChar();
          }

          if (e.getKeyCode() == KeyEvent.VK_ENTER)
            repaint();
        }
      });
    }

    protected void paintComponent(Graphics g) {
      super.paintComponent(g);

      g.setFont(new Font("TimesRoman", Font.PLAIN, 24));
      g.drawString(String.valueOf(str), x, y);
    }
  }
}