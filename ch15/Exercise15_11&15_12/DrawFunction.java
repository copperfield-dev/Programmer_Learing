import javax.swing.*;
import java.awt.*;


public class DrawFunction extends JFrame {
	public DrawFunction() {
		setTitle("Erercise15.11&15.12");
		setLayout(new GridLayout(1, 2));
		add(new PolygonsPanel1());
		add(new PolygonsPanel2());
	}

	public static void main(String[] args) {
		DrawFunction frame = new DrawFunction();
		frame.setSize(1000, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class PolygonsPanel1 extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawLine(10, 200, 390, 200);
        g.drawLine(200, 30, 200, 390);

        g.drawLine(390, 200, 370, 190);
        g.drawLine(390, 200, 370, 210);
        g.drawLine(200, 30, 190, 50);
        g.drawLine(200, 30, 210, 50);

        g.drawString("X", 390, 170);
        g.drawString("Y", 220, 40);

        Polygon polygon = new Polygon();
		double scaleFactor = 0.01;
		for (int x = -100; x <= 100; x++) {
			polygon.addPoint(x + 200, 200 - (int)(scaleFactor * x * x));
		}

		g.drawPolyline(polygon.xpoints, polygon.ypoints, polygon.npoints);
	}
}

class PolygonsPanel2 extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawLine(10, 100, 380, 100);
        g.drawLine(200, 30, 200, 190);

        g.drawLine(380, 100, 370, 90);
        g.drawLine(380, 100, 370, 110);
        g.drawLine(200, 30, 190, 40);
        g.drawLine(200, 30, 210, 40);

        g.drawString("X", 360, 80);
        g.drawString("Y", 220, 40);

		Polygon polygon = new Polygon();
        
        for (int x = -100; x <= 100; x++) {
			polygon.addPoint(x + 200, 
				100 - (int)(50 * Math.sin((x / 100.0) * 2 * Math.PI)));
		}

		g.drawPolyline(polygon.xpoints, polygon.ypoints, polygon.npoints);
		g.drawString("-2\u03c0", 95, 115);
        g.drawString("2\u03c0", 305, 115);
        g.drawString("0", 200, 115);
	}
}