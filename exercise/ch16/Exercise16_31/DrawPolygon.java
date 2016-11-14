import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawPolygon extends JFrame {
  private JButton jbtIncrease = new JButton("Increase");
  private JButton jbtDecrease = new JButton("Decrease");
  RegularPolygonPanel polygon = new RegularPolygonPanel(3);

	public DrawPolygon() {
		setTitle("Exercise16.31");
		JPanel panel = new JPanel();
		panel.add(jbtIncrease);
    panel.add(jbtDecrease);

		setLayout(new BorderLayout());
		add(polygon, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);

		jbtIncrease.addActionListener(new IncreaseListener());
		jbtDecrease.addActionListener(new DecreaseListener());
	}

	public static void main(String[] args) {
		DrawPolygon frame = new DrawPolygon();
		frame.setSize(800, 250);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	class IncreaseListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			polygon.numberOfSides++;
			repaint();
		}
	}

	class DecreaseListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (polygon.numberOfSides > 3)
				polygon.numberOfSides--;
			repaint();
		}
	}
}

class RegularPolygonPanel extends JPanel {
  int numberOfSides = 3;

  public RegularPolygonPanel(int numberOfSides) {
  	this.numberOfSides = numberOfSides;
  }

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

		Polygon polygon = new Polygon();

		for (int i = 0; i < numberOfSides; i++) {
      polygon.addPoint((int)(xCenter + radius *
        Math.cos(i * 2 * Math.PI / numberOfSides + 2 * Math.PI / 16)), (int)(yCenter - radius *
        Math.sin(i * 2 * Math.PI / numberOfSides + 2 * Math.PI / 16)));
    }

		g.drawPolygon(polygon);
	}
}