import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Polygon;

public class DrawOctagon extends JFrame {
    public DrawOctagon() {
    	setTitle("Exercise15.8");
    	add(new PolygonsPanel());
    }

    public static void main(String[] args) {
    	DrawOctagon frame = new DrawOctagon();
    	frame.setSize(200, 250);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}

class PolygonsPanel extends JPanel {
	protected void  paintComponent(Graphics g) {
		super.paintComponent(g);

		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

		Polygon polygon = new Polygon();
		polygon.addPoint(xCenter + radius, yCenter);
		polygon.addPoint((int)(xCenter + radius *
			Math.cos(2 * Math.PI / 8)), (int)(yCenter - radius *
			Math.sin(2 * Math.PI / 8)));
		polygon.addPoint((int)(xCenter + radius *
			Math.cos(2 * 2 * Math.PI / 8)), (int)(yCenter - radius *
			Math.sin(2 * 2 * Math.PI / 8)));
		polygon.addPoint((int)(xCenter + radius *
			Math.cos(3 * 2 * Math.PI / 8)), (int)(yCenter - radius *
			Math.sin(3 * 2 * Math.PI / 8)));
		polygon.addPoint((int)(xCenter + radius *
			Math.cos(4 * 2 * Math.PI / 8)), (int)(yCenter - radius *
			Math.sin(4 * 2 * Math.PI / 8)));
		polygon.addPoint((int)(xCenter + radius *
			Math.cos(5 * 2 * Math.PI / 8)), (int)(yCenter - radius *
			Math.sin(5 * 2 * Math.PI / 8)));
		polygon.addPoint((int)(xCenter + radius *
			Math.cos(6 * 2 * Math.PI / 8)), (int)(yCenter - radius *
			Math.sin(6 * 2 * Math.PI / 8)));
		polygon.addPoint((int)(xCenter + radius *
			Math.cos(7 * 2 * Math.PI / 8)), (int)(yCenter - radius *
			Math.sin(7 * 2 * Math.PI / 8)));

		g.drawPolygon(polygon);
	}
}