import java.awt.*;
import javax.swing.*;

public class TriangleNumber extends JFrame {
	public TriangleNumber() {
		add(new NewPanel());
	}
	
    public static void main(String[] args) {
    	TriangleNumber frame = new TriangleNumber();
    	frame.setTitle("Exercise15.5");
    	frame.setSize(350, 350);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}

class NewPanel extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		String temp; 

		int height = getHeight();

		for (int i = 1; i <= 1 + (height - 15) / 25; i++) {
			for (int j = 1; j <= i; j++) {
				temp = Integer.toString(j);
				g.drawString(temp + " ", 15 + (j - 1) * 25, 35 + (i - 1) * 25);
			}
		}
	}
}