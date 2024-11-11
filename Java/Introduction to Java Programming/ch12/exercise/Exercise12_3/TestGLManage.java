import javax.swing.*;
import java.awt.*;

public class TestGLManage extends JFrame {
	public TestGLManage() {
		JPanel p1 = new JPanel(new GridLayout(3, 2));
		JPanel p2 = new JPanel(new GridLayout(3, 2));
	
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
		TestGLManage frame = new TestGLManage();
		frame.setTitle("Exercise12_3");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}