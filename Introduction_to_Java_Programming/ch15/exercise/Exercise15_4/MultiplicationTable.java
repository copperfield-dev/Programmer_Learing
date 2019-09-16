import java.awt.*;
import javax.swing.*;

public class MultiplicationTable extends JFrame {
	public MultiplicationTable() {
		add(new NewPanel());
	}
	
    public static void main(String[] args) {
    	MultiplicationTable frame = new MultiplicationTable();
    	frame.setTitle("Exercise15.4");
    	frame.setSize(350, 350);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}

class NewPanel extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Multiplication Table", 50, 25);
		String temp; 
		for (int i = 1; i < 10; i++) {
			temp = Integer.toString(i);
			g.drawString(temp + "  ", 50 + (i - 1) * 25, 50);
			g.drawString(temp, 15, 75 + (i - 1) * 25);
		}

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				temp = Integer.toString(i * j);
				g.drawString(temp + " ", 50 + (i - 1) * 25, 75 + (j - 1) * 25);
			}
		}

		g.drawLine(35, 60, 280, 60);
		g.drawLine(35, 60, 35, 280);
		g.drawLine(35, 280, 280, 280);
		g.drawLine(280, 60, 280, 280);
	}
}