import javax.swing.*;
import java.awt.Graphics;

public class TestPaintLine extends JFrame {
	public TestPaintLine() {
		add(new NewPanel());
	}

	public static void main(String[] args) {
		TestPaintLine frame = new TestPaintLine();
		frame.setTitle("Exercise15.1");
		frame.setSize(200, 100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class NewPanel extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int xCoordinate = getWidth() / 3;
		int yCoordinate = getHeight() / 3;

		g.drawLine(0, yCoordinate, getWidth(), yCoordinate);
		g.drawLine(0, yCoordinate * 2, getWidth(), yCoordinate * 2);

        g.drawLine(xCoordinate, 0, xCoordinate, getHeight());
        g.drawLine(xCoordinate * 2, 0, xCoordinate * 2, getHeight());
	}
}