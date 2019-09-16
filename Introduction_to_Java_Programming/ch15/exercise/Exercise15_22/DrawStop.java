import javax.swing.*;
import java.awt.*;

public class DrawStop extends JFrame {
	public DrawStop() {
		add(new StopPanel());
	}

	public static void main(String[] args) {
		DrawStop frame = new DrawStop();
		frame.setTitle("Exercise15.22");
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class StopPanel extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

		Polygon polygon = new Polygon();
		
        for (int i = 0; i < 8; i++) {
            polygon.addPoint((int)(xCenter + radius *
                Math.cos(i * 2 * Math.PI / 8 + 2 * Math.PI / 16)), (int)(yCenter - radius *
                Math.sin(i * 2 * Math.PI / 8 + 2 * Math.PI / 16)));
        }

        g.setColor(Color.RED);
		g.fillPolygon(polygon);

        g.setFont(new Font("Arial Balck", Font.BOLD, 50));
		FontMetrics fm = g.getFontMetrics();

		int stringWidth = fm.stringWidth("STOP");
		int stringAscent = fm.getAscent(); 

		int xCoordinate = getWidth() / 2 - stringWidth / 2;
		int yCoordinate = getHeight() / 2 + stringAscent / 2;

        g.setColor(Color.WHITE);
		g.drawString("STOP", xCoordinate, yCoordinate);
	}
}