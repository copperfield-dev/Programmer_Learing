import javax.swing.*;
import java.awt.Graphics;

public class DrawPicture extends JFrame {
	public DrawPicture() {
		add(new NewPanel());
	}

	public static void main(String[] args) {
		DrawPicture frame = new DrawPicture();
		frame.setTitle("Exercise15.17");
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

        g.drawArc(x, getHeight() - radius / 2, 40, 15, 0, 180);
        g.drawLine(x + 20, getHeight() - radius / 2, x + 20, 25);
        g.drawLine(x + 20, 25, x + 150, 25);
        g.drawLine(x + 150, 25, x + 150, 65);
        g.drawArc(x + 150 - 10, 65, 20, 20, 0, 360);
        g.drawLine(x + 150 - 10 + 3, 65 + 20 - 3, x + 150 - 10 - 20, 65 + 20 + 20);
        g.drawLine(x + 150 + 10 - 3, 65 + 20 - 3, x + 150 + 10 + 20, 65 + 20 + 20);
        g.drawLine(x + 150, 85, x + 150, 115);
        g.drawLine(x + 150, 115, x + 150 - 15, 115 + 25);
        g.drawLine(x + 150, 115, x + 150 + 15, 115 + 25); 
	}
}