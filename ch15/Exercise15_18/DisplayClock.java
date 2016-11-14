import java.awt.*;
import javax.swing.*;

public class DisplayClock extends JFrame {
	public DisplayClock() {
		StillClock clock1 = new StillClock(4, 20, 45);
		StillClock clock2 = new StillClock(22, 46, 15);

        setLayout(new BorderLayout(5, 10));
		add(clock1, BorderLayout.WEST);
		add(clock2, BorderLayout.EAST);
	}
	
    public static void main(String[] args) {
    	DisplayClock frame = new DisplayClock();
    	frame.setTitle("Exercise15.18");
    	frame.setSize(450, 350);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}