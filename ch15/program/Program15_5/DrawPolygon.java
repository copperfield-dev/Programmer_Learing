import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Polygon;

public class DrawPolygon extends JFrame {
	public DrawPolygon() {
		setTitle("DrawPolygon");
		add(new PolygonsPanel());
	}

	public static void main(String[] args) {
		DrawPolygon frame = new DrawPolygon();
		frame.setSize(200, 250);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class PolygonsPanel extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

		Polygon polygon = new Polygon();
		polygon.addPoint(xCenter + radius, yCenter);
		polygon.addPoint((int)(xCenter + radius *
			Math.cos(2 * Math.PI / 6)), (int)(yCenter - radius *
			Math.sin(2 * Math.PI / 6)));
		polygon.addPoint((int)(xCenter + radius *
			Math.cos(2 * 2 * Math.PI / 6)), (int)(yCenter - radius *
			Math.sin(2 * 2 * Math.PI / 6)));
		polygon.addPoint((int)(xCenter + radius *
			Math.cos(3 * 2 * Math.PI / 6)), (int)(yCenter - radius *
			Math.sin(3 * 2 * Math.PI / 6)));
		polygon.addPoint((int)(xCenter + radius *
			Math.cos(4 * 2 * Math.PI / 6)), (int)(yCenter - radius *
			Math.sin(4 * 2 * Math.PI / 6)));
		polygon.addPoint((int)(xCenter + radius *
			Math.cos(5 * 2 * Math.PI / 6)), (int)(yCenter - radius *
			Math.sin(5 * 2 * Math.PI / 6)));

		g.drawPolygon(polygon);
	}
}