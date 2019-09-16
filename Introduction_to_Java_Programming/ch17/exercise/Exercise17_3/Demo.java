import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Demo extends JFrame {
  private JRadioButton jrbRed, jrbYellow, jrbGreen;
  private LightPanel jpLight = new  LightPanel();

  public static void main(String[] args) {
    Demo frame = new Demo();
    frame.setTitle("Exercise17_3");
    frame.setSize(400, 500);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public Demo() {
    setLayout(new BorderLayout());
    add(jpLight, BorderLayout.CENTER);

    JPanel jpRadioButtons = new JPanel();
    jpRadioButtons.add(jrbRed = new JRadioButton("Red"));
    jpRadioButtons.add(jrbYellow = new JRadioButton("Yellow"));
    jpRadioButtons.add(jrbGreen = new JRadioButton("Green"));
    add(jpRadioButtons, BorderLayout.SOUTH);

    ButtonGroup group = new ButtonGroup();
    group.add(jrbRed);
    group.add(jrbYellow);
    group.add(jrbGreen);

    jrbRed.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jpLight.light = 2;
        repaint();
      }
    });

    jrbYellow.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jpLight.light = 1;
        repaint();
      }
    });

    jrbGreen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jpLight.light = 0;
        repaint();
      }
    });

    jrbGreen.setSelected(true);
  }

  class LightPanel extends JPanel {
    private int x; 
    private int y; 
    private int light = 0;

    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      x = getWidth() / 2;
      y = getHeight() / 2;

      g.drawRect(x - 20, y - 60, 40, 120);
      if (light == 0) {
        g.drawOval(x - 20, y - 60, 40, 40);
        g.drawOval(x - 20, y - 20, 40, 40);
        g.setColor(Color.GREEN);
        g.fillOval(x - 20, y + 20, 40, 40);
        g.setColor(Color.BLACK);
      }
      if (light == 1) {
        g.drawOval(x - 20, y - 60, 40, 40);
        g.setColor(Color.YELLOW);
        g.fillOval(x - 20, y - 20, 40, 40);
        g.setColor(Color.BLACK);
        g.drawOval(x - 20, y + 20, 40, 40);
      }
      if (light == 2) {
        g.setColor(Color.RED);
        g.fillOval(x - 20, y - 60, 40, 40);
        g.setColor(Color.BLACK);
        g.drawOval(x - 20, y - 20, 40, 40);
        g.drawOval(x - 20, y + 20, 40, 40);
      }
    }
  }
}