import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnimationDemo extends JFrame {
  public AnimationDemo() {
    add(new ImagePanel());

    Timer timer = new Timer(1000, new TimerListener());
    timer.start();
  }

  public static void main(String[] args) {
    AnimationDemo frame = new AnimationDemo();
    frame.setSize(480, 790);
    frame.setTitle("Exercise16_14");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  class TimerListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      repaint();
    }
  }

  static class ImagePanel extends JPanel {
    private int xCoordinate = 150;
    private int yCoordinate = 500;
    private ImageIcon imageIcon = new ImageIcon("image/china.gif");
    private Image image = imageIcon.getImage();

    protected void paintComponent(Graphics g) {
      super.paintComponent(g);

      if (image != null)
        g.drawImage(image, xCoordinate, yCoordinate, this);
      yCoordinate -= 10;
    }
  }
}
  
