import javax.swing.*;
import java.awt.*;

public class TestButton extends JFrame {
	public TestButton() {
		setLayout(new GridLayout(1, 2));
		add(new OvalButton("OK"));
		add(new OvalButton("Cancel"));
	}

	public static void main(String[] args) {
		TestButton frame = new TestButton();
		frame.setTitle("Exercise15.2");
		frame.setSize(200, 100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class OvalButton extends JButton {
    public OvalButton(String string) {
    	super(string);
    }

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

        g.drawOval((int)(getWidth() * 0.1), (int)(getHeight() * 0.1), 
        	(int)(getWidth() * 0.8), (int)(getHeight() * 0.8));
	}
}