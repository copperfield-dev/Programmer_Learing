import javax.swing.*;
import java.awt.Graphics;

public class DrawCylinder extends JFrame {
	public DrawCylinder() {
		add(new NewPanel());
	}

	public static void main(String[] args) {
		DrawCylinder frame = new DrawCylinder();
		frame.setTitle("Exercise15.10");
		frame.setSize(400, 350);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class NewPanel extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

        int x = xCenter - radius;
        int y = yCenter - radius;

        g.drawArc(x, y, 2 * radius, radius / 2, 0, 360);
        g.drawLine(x, y + radius / 2 / 2, x, y + radius + 25);
        g.drawLine(x + 2 * radius, y + radius / 2 / 2, x + 2 * radius, y + radius + 25);
        g.drawArc(x, y + radius + 25 - radius / 2 / 2, 2 * radius, radius / 2, 0, 30);
        g.drawArc(x, y + radius + 25 - radius / 2 / 2, 2 * radius, radius / 2, 60, 15);
        g.drawArc(x, y + radius + 25 - radius / 2 / 2, 2 * radius, radius / 2, 90, 15);
        g.drawArc(x, y + radius + 25 - radius / 2 / 2, 2 * radius, radius / 2, 120, 15);
        g.drawArc(x, y + radius + 25 - radius / 2 / 2, 2 * radius, radius / 2, 160, 200);
	}
}