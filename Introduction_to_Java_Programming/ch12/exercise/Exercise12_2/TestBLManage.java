import javax.swing.*;
import java.awt.*;

public class TestBLManage extends JFrame {
	public TestBLManage() {
		JPanel p1 = new JPanel(new FlowLayout());
		JPanel p2 = new JPanel(new FlowLayout());
	
        for (int i = 1; i <= 3; i++) {
        	p1.add(new JButton("Button" + i));
        }

        for (int i = 4; i <= 6; i++) {
        	p2.add(new JButton("Button" + i));
        }

        setLayout(new BorderLayout());
        add(p1, BorderLayout.SOUTH);
        add(p2, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		TestBLManage frame = new TestBLManage();
		frame.setTitle("Exercise12_2");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}