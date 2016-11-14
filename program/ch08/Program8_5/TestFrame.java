import javax.swing.JFrame;

public class TestFrame {
	public static void main(String[] args) {
		JFrame framel = new JFrame();
		framel.setTitle("Window 1");
		framel.setSize(200, 150);
		framel.setLocation(200, 100);
		framel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framel.setVisible(true);

		JFrame frame2 = new JFrame();
		frame2.setTitle("Window 2");
		frame2.setSize(200, 150);
		frame2.setLocation(410, 100);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setVisible(true);
    }
}