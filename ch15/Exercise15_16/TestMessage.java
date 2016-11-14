import javax.swing.*;
import java.awt.*;

public class TestMessage extends JFrame {
	public TestMessage() {
		Message messagePanel = new Message();
		add(messagePanel);
		messagePanel.setBackground(Color.WHITE);
		messagePanel.setFont(new Font("TimesRoman", Font.BOLD, 20));
		
	}

	public static void main(String[] args) {
		TestMessage frame = new TestMessage();
		frame.setSize(300, 150);
		frame.setTitle("Exercise15.16");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class Message extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		FontMetrics fm = g.getFontMetrics();

		int stringAscent = fm.getAscent(); 
		int stringDescent = fm.getDescent();
		int stringLeading = fm.getLeading();
		int stringWidth = fm.stringWidth("Java is fun");
		
		this.setToolTipText("Ascent: " + stringAscent + 
			                        " Descent: " + stringDescent +
			                        " Leading: " + stringLeading +
			                        " string width: " + stringWidth); 

		int xCoordinate = getWidth() / 2 - stringWidth / 2;
		int yCoordinate = getHeight() / 2 + stringAscent / 2;

		g.drawString("Java is fun", xCoordinate, yCoordinate);
	}
}