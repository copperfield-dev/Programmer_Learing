import javax.swing.*;
import java.awt.*;

public class BeanMachine extends JFrame {
	public BeanMachine() {
		add(new BeanMachinePanel());
	}

	public static void main(String[] args) {
		BeanMachine frame = new BeanMachine();
		frame.setTitle("Exercise15.24");
		frame.setSize(400, 550);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class BeanMachinePanel extends JPanel {
    private int numberOfSlots = 8;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int xCoordinate = getWidth() / 2;
        int yCoordinate = (int)(getHeight() * 0.15);

        g.drawLine(xCoordinate - 20, yCoordinate, 
        	xCoordinate - 20, yCoordinate + 40);
        g.drawLine(xCoordinate + 20, yCoordinate,
        	xCoordinate + 20, yCoordinate + 40);
        g.drawLine(xCoordinate - 20, yCoordinate + 40,
            (int)(getWidth() * 0.1), (int)(getHeight() * 0.7));
        g.drawLine(xCoordinate + 20, yCoordinate + 40,
        	(int)(getWidth() * 0.9), (int)(getHeight() * 0.7));
        xCoordinate = (int)(getWidth() * 0.1);
        yCoordinate = (int)(getHeight() * 0.7);
        int interval = (int)(getWidth() * 0.8 / numberOfSlots);
        for (int i = 0; i < numberOfSlots; i++) {
        	g.drawLine(xCoordinate, yCoordinate, xCoordinate, yCoordinate + 60);
        	xCoordinate += interval;
        }
        xCoordinate = (int)(getWidth() * 0.9);
        g.drawLine(xCoordinate, yCoordinate, xCoordinate, yCoordinate + 60);
        	
        xCoordinate = (int)(getWidth() * 0.1);
        yCoordinate = yCoordinate + 60;
        g.drawLine(xCoordinate, yCoordinate, (int)(getWidth() * 0.9), yCoordinate);

        int gap = ((int)(getHeight() * 0.7) - ((int)(getHeight() * 0.15) + 40)) / (numberOfSlots - 2);
        xCoordinate = xCoordinate + interval;
        int xPoint = xCoordinate;
        yCoordinate = yCoordinate - 60;
        g.setColor(Color.BLUE);
        for (int i = 0; i < numberOfSlots - 1; i++) {
        	for (int j = 0; j < numberOfSlots - 1 - i; j++) {
        		g.fillOval(xCoordinate - 5, yCoordinate - 5, 10, 10);
        		xCoordinate += interval;
        	}
        	xCoordinate = xPoint + interval / 2;
        	xPoint = xCoordinate;
        	yCoordinate -= gap;
        }
    }
}