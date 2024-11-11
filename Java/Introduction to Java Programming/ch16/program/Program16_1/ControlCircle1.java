import javax.swing.*;
import java.awt.*;

public class ControlCircle1 extends JFrame {
    private JButton jbtEnlarge = new JButton("Enlarge");
    private JButton jbtShrink = new JButton("Shrink");
    private CirclePanel canvas = new CirclePanel();

    public ControlCircle1() {
        JPanel panel = new JPanel();
        panel.add(jbtEnlarge);
        panel.add(jbtShrink);

        this.add(canvas, BorderLayout.CENTER);
        this.add(panel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        JFrame frame = new ControlCircle1();
        frame.setTitle("ControlCircle1");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}    

class CirclePanel extends JPanel {
	private int radius = 5;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius,
			2 * radius, 2 * radius);
	}
}