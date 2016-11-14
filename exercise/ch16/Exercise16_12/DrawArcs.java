import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class DrawArcs extends JFrame {
  private ArcsPanel panel = new ArcsPanel();

	public DrawArcs() {
		setTitle("Exercise16_12");
		add(panel);

		Timer timer = new Timer(1000, new TimerListener());
		timer.start();
	}

	private class TimerListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
      panel.speed += 2;
      repaint();
    }
	}

  public static void main(String[] args) {
    DrawArcs frame = new DrawArcs();
    frame.setSize(250, 300);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);    	
  }
}

class ArcsPanel extends JPanel {
  public int speed = 0;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

		int x = xCenter - radius;
		int y = yCenter - radius;

		g.fillArc(x, y, 2 * radius, 2 * radius, 0 - speed, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, 90 - speed, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, 180 - speed, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, 270 - speed, 30);
	}
}