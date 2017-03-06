import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class RandomWalk extends JFrame {
  private JButton jbtStart = new JButton("Start");
  private Timer timer = new Timer(1000, new TimerListener());
  private WalkPanel walkPanel = new WalkPanel();
  private int nWidth = 16;
  private int nHeight = 16;
  private Point[][] lattice = new Point[nWidth + 1][nHeight + 1];
  private boolean isEnd = false;
  private int xCoordinate;
  private int yCoordinate;

  public RandomWalk() {
    JPanel jbtPanel = new JPanel();
    jbtPanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
    jbtPanel.add(jbtStart);

    this.add(walkPanel, BorderLayout.CENTER);
    this.add(jbtPanel, BorderLayout.SOUTH);

    jbtStart.addActionListener(new StartListener());
  }

  private class TimerListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      getNewPoint();
      walkPanel.repaint();
    }
  }

  public static void main(String[] args) {
    JFrame frame = new RandomWalk();
    frame.setSize(400, 200);
    //frame.pack();
    frame.setTitle("RandomWalk");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  class WalkPanel extends JPanel {
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);

      int vGap = getHeight() / nHeight;
      int hGap = getWidth() / nWidth;
      int i;
      int j;

      Graphics2D g2D = (Graphics2D)g;
      g2D.setColor(Color.LIGHT_GRAY);
      float[] arr = {4.0f,2.0f};
      //float[] arr = {5.0f, 3.0f, 2.0f, 3.0f};
      BasicStroke stroke = new BasicStroke(1,
        BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 1.0f, arr, 0); 
      g2D.setStroke(stroke);
      //Line2D.Float line = new Line2D.Float(0, 50, 300, 50);
      for (i = 0; i < nHeight; i++) {
        g2D.draw(new Line2D.Float(0, vGap * i, 
          getWidth(), vGap * i));
      }
      for (j = 0; j < nWidth; j++) {
        g2D.draw(new Line2D.Float(hGap * j, 0,
          hGap * j, getHeight()));
      }
      
      if (isEnd == true) {
        timer.stop();
        return;
      }
      g.setColor(Color.BLACK);
     
      i = (nWidth + 1) / 2;
      j = (nHeight + 1) / 2;
      while (lattice[i][j] != null) {
        Point p = lattice[i][j];
        g.drawLine(i * hGap, j * vGap, p.x * hGap, p.y * vGap);
        i = p.x;
        j = p.y;
      }
      
    }
  }

  void getNewPoint() {
    int i = xCoordinate;
    int j = yCoordinate;

    if (i > 0 && i < nWidth && j > 0 && j < nHeight) {
      if (lattice[i - 1][j] != null && lattice[i + 1][j] != null &&
          lattice[i][j - 1] != null && lattice[i][j + 1] != null) {
        isEnd = true; // Dead end
        return;
      }
      
      double r = Math.random();
      if (r < .25 && lattice[i][j + 1] == null) {
        lattice[i][j] = new Point(i, j + 1); // Right
        j++;
      }
      else if (r < .50 && lattice[i + 1][j] == null) {
        lattice[i][j] = new Point(i + 1, j); // Down
        i++;
      }
      else if (r < .75 && lattice[i][j - 1] == null) {
        lattice[i][j] = new Point(i, j - 1); // Left
        j--;
      }
      else if (r < 1.00 && lattice[i - 1][j] == null) {
        lattice[i][j] = new Point(i - 1, j); // Up
        i--;
      }      
    }

    xCoordinate = i;
    yCoordinate = j;
  }

  class StartListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      int i, j;
      for (i = 0; i < lattice.length; i++)
        for (j = 0; j < lattice.length; j++)
          lattice[i][j] = null;

      i = (nWidth + 1) / 2;
      j = (nHeight + 1) / 2;
      xCoordinate = i;
      yCoordinate = j;
      lattice[i][j] = new Point(i, j);
      timer.start();
    }
  }
}
