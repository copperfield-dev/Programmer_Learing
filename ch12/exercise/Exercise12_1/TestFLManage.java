import javax.swing.*;
import java.awt.*;

public class TestFLManage extends JFrame {
	public TestFLManage() {
		JPanel p1 = new JPanel(new FlowLayout());
		JPanel p2 = new JPanel(new FlowLayout());
	
        for (int i = 1; i <= 3; i++) {
        	p1.add(new JButton("Button " + i));
        }

        for (int i = 4; i <= 6; i++) {
        	p2.add(new JButton("Button" + i));
        }

        setLayout(new FlowLayout());
        add(p1);
        add(p2);
	}

	public static void main(String[] args) {
		TestFLManage frame = new TestFLManage();
		frame.setTitle("Exercise12_1");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}