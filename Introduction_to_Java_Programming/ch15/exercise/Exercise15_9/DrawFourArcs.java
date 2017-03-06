import javax.swing.*;
import java.awt.*;

public class DrawFourArcs extends JFrame {
	public DrawFourArcs() {
		setTitle("Exercise15.9");

		setLayout(new GridLayout(2, 2));
		add(new ArcsPanel());
		add(new ArcsPanel());
		add(new ArcsPanel());
		add(new ArcsPanel());
	}

    public static void main(String[] args) {
        DrawFourArcs frame = new DrawFourArcs();
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);    	
    }
}

class ArcsPanel extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

		int x = xCenter - radius;
		int y = yCenter - radius;

		g.fillArc(x, y, 2 * radius, 2 * radius, 0, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, 90, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, 180, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, 270, 30);
		g.drawOval(x, y, 2 * radius, 2 * radius);
	}
}