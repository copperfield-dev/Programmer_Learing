import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BeanMachine extends JFrame {
	public BeanMachine() {
		add(new BeanMachinePanel());
	}

	public static void main(String[] args) {
		BeanMachine frame = new BeanMachine();
		frame.setTitle("Exercise16.22");
		frame.setSize(400, 550);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class BeanMachinePanel extends JPanel {
  private int numberOfSlots = 8;
  private int numberOfBalls = 10;
  private int step = 0;
  private int index;
  private int[] numberOfPerSlot = new int[numberOfSlots];
  private Timer timer = new Timer(400, new TimerListener());
  private int x;
  private int y;
  private int interval;
  private int gap;

  public BeanMachinePanel() {
    timer.start();
    for (int i = 0; i < numberOfSlots; i++) {
      numberOfPerSlot[i] = 0;
    }
  }

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
    interval = (int)(getWidth() * 0.8 / numberOfSlots);
    for (int i = 0; i < numberOfSlots; i++) {
    	g.drawLine(xCoordinate, yCoordinate, xCoordinate, yCoordinate + 60);
    	xCoordinate += interval;
    }
    xCoordinate = (int)(getWidth() * 0.9);
    g.drawLine(xCoordinate, yCoordinate, xCoordinate, yCoordinate + 60);
    	
    xCoordinate = (int)(getWidth() * 0.1);
    yCoordinate = yCoordinate + 60;
    g.drawLine(xCoordinate, yCoordinate, (int)(getWidth() * 0.9), yCoordinate);

    gap = ((int)(getHeight() * 0.7) - ((int)(getHeight() * 0.15) + 40)) / (numberOfSlots - 2);
    xCoordinate = xCoordinate + interval;
    int xPoint = xCoordinate;
    int yPoint = yCoordinate;
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

    xPoint = xCoordinate - interval / 2;
    yPoint = yCoordinate + gap - 12;

    g.setColor(Color.BLACK);
    for (int i = 0; i < numberOfSlots; i++) {
      xCoordinate = (int)(getWidth() * 0.9) - interval / 2 - 3;
      yCoordinate = (int)(getHeight() * 0.7) + 60 + 5;
      xCoordinate = xCoordinate - (numberOfSlots - 1 - i) * interval;
      for (int j = 0; j < numberOfPerSlot[i]; j++) {
        yCoordinate = yCoordinate - 10;
        g.fillOval(xCoordinate - 5, yCoordinate - 5, 10, 10);
      }
    }

    if (step < 1) {
      x = xPoint;
      y = yPoint;
      index = numberOfSlots - 1;
      g.fillOval(x - 5, y - 5, 10, 10);
    }
    else 
      g.fillOval(x - 5, y - 5, 10, 10);
  }

  class TimerListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      if (numberOfBalls > 0) {
        step++;
        if (step < 14) {
          if (step % 2 == 1) {
            double r = Math.random();
            if (r < .50) {
              x -= interval / 2;
              y += gap / 2;
              index--;
              repaint();
            } 
            else if (r < 1.00) {
              x += interval / 2;
              y += gap / 2;
              repaint();
            }
          } 
          else {
            y += gap / 2;
            repaint();
          } 
        }
        else if (step == 14) {
          y = (int)(getHeight() * 0.7);
          y += (60 - numberOfPerSlot[index] * 10);
          y -= 5;
          repaint();
        }
        else {
          step = 0;
          numberOfPerSlot[index]++;
          numberOfBalls--;
          repaint();
        }
      }
      else 
        timer.stop();
    }
  }
}