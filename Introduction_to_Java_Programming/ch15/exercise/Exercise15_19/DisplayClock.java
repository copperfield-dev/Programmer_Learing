import java.awt.*;
import javax.swing.*;

public class DisplayClock extends JFrame {
	public DisplayClock() {
		int hour = (int)(Math.random() * 24);
		int minute = (int)(Math.random() * 60);
		int second = (int)(Math.random() * 60);
		StillClock clock = new StillClock(hour, minute, second);

		clock.setSecondHandVisible(false);
               
		add(clock);
	}
	
    public static void main(String[] args) {
    	DisplayClock frame = new DisplayClock();
    	frame.setTitle("Exercise15.19");
    	frame.setSize(350, 350);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}