import java.awt.*;
import javax.swing.*;

public class TestMessagePanel extends JFrame {
	public TestMessagePanel() {
	    MessagePanel messagePanel1 = new MessagePanel("Java");
	    MessagePanel messagePanel2 = new MessagePanel("HTML");
	    MessagePanel messagePanel3 = new MessagePanel("Tomcat");
	    MessagePanel messagePanel4 = new MessagePanel("PHP");
	    messagePanel1.setFont(new Font("SansSerif", Font.ITALIC, 20));
	    messagePanel2.setFont(new Font("Courier", Font.ITALIC, 20));
	    messagePanel3.setFont(new Font("Times", Font.ITALIC, 20));
	    messagePanel4.setFont(new Font("Californian FB", Font.ITALIC, 20));

        messagePanel1.setBackground(Color.WHITE);
	    messagePanel2.setBackground(Color.CYAN);
	    messagePanel3.setBackground(Color.WHITE);
	    messagePanel4.setBackground(Color.RED);
	    messagePanel1.setCentered(true);
	    messagePanel2.setCentered(true);
	    messagePanel3.setCentered(true);
	    messagePanel4.setCentered(true);

        JPanel p = new JPanel(new GridLayout(3, 1));
	    
	    
		p.add(messagePanel2);
		p.add(messagePanel3);
		p.add(messagePanel4);

		setLayout(new BorderLayout());
		add(messagePanel1, BorderLayout.CENTER);
		add(p, BorderLayout.EAST);
	}

	public static void main(String[] args) {
		TestMessagePanel frame = new TestMessagePanel();
		frame.setSize(600, 200);
		frame.setTitle("Exercise15.26");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
