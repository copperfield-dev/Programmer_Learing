import java.awt.*;
import javax.swing.*;
import java.util.*;

public class StillClock extends JPanel {
	private int hour;
	private int minute;
	private int second;
	protected int xCenter, yCenter;
    protected int clockRadius;
	private boolean hourHandVisible = true;
	private boolean minuteHandVisible = true;
	private boolean secondHandVisible = true;

	public StillClock() {
        setCurrentTime();
        this.hourHandVisible = hourHandVisible;
		this.minuteHandVisible = minuteHandVisible;
		this.secondHandVisible = secondHandVisible;
	}

	public StillClock(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.hourHandVisible = hourHandVisible;
		this.minuteHandVisible = minuteHandVisible;
		this.secondHandVisible = secondHandVisible;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
		repaint();
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
		repaint();
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
		repaint();
	}

	public boolean isHourHandVisible() {
		return hourHandVisible;
	}

	public void setHourHandVisible(boolean hourHandVisible) {
		this.hourHandVisible = hourHandVisible;
		repaint();
	}

	public boolean isMinuteHandVisible() {
		return minuteHandVisible;
	}

	public void setMinuteHandVisible(boolean minuteHandVisible) {
		this.minuteHandVisible = minuteHandVisible;
		repaint();
	}

	public boolean isSecondHandVisible() {
		return secondHandVisible;
	}

	public void setSecondHandVisible(boolean secondHandVisible) {
		this.secondHandVisible = secondHandVisible;
		repaint();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int clockRadius = 
		    (int)(Math.min(getWidth(), getHeight()) * 0.8 * 0.5);
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;

		g.setColor(Color.BLACK);
		g.drawOval(xCenter - clockRadius, yCenter - clockRadius,
			2 * clockRadius, 2 * clockRadius);
		g.drawString("12", xCenter - 5, yCenter - clockRadius + 12);
		g.drawString("9", xCenter - clockRadius + 3, yCenter + 5);
		g.drawString("3", xCenter + clockRadius - 10, yCenter + 3);
		g.drawString("6", xCenter - 3, yCenter + clockRadius - 3);

		int sLength = (int)(clockRadius * 0.8);
		int xSecond = (int)(xCenter + sLength * 
			Math.sin(second * (2 * Math.PI / 60)));
		int ySecond = (int)(yCenter - sLength *
			Math.cos(second * (2 * Math.PI / 60)));
		g.setColor(Color.RED);
		if (isSecondHandVisible())
			g.drawLine(xCenter, yCenter, xSecond, ySecond);

		int mLength = (int)(clockRadius * 0.65);
		int xMinute = (int)(xCenter + mLength *
			Math.sin(minute * (2 * Math.PI / 60)));
		int yMinute = (int)(yCenter - mLength *
			Math.cos(minute * (2 * Math.PI / 60)));
		g.setColor(Color.BLUE);
		if (isMinuteHandVisible())
			g.drawLine(xCenter, yCenter, xMinute, yMinute);

		int hLength = (int)(clockRadius * 0.5);
		int xHour = (int)(xCenter + hLength *
			Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
		int yHour = (int)(yCenter - hLength *
			Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
		g.setColor(Color.GREEN);
		if (isHourHandVisible())
			g.drawLine(xCenter, yCenter, xHour, yHour);

		// Display more details on the clock
		g.setColor(Color.BLACK);
   		for (int i = 0; i < 60; i++) {
      		double percent;

      		if (i % 5 == 0) {
        		percent = 0.9;
      		}
      		else {
        		percent = 0.95;
      		}

      		int xOuter = (int)(xCenter +
                         clockRadius * Math.sin(i * (2 * Math.PI / 60)));
      		int yOuter = (int)(yCenter -
                         clockRadius * Math.cos(i * (2 * Math.PI / 60)));
      		int xInner = (int)(xCenter +
                         percent * clockRadius * Math.sin(i * (2 * Math.PI / 60)));
      		int yInner = (int)(yCenter -
                         percent * clockRadius * Math.cos(i * (2 * Math.PI / 60)));

      		g.drawLine(xOuter, yOuter, xInner, yInner);
    	}
    }
    
    public void setCurrentTime() {
       	Calendar calendar = new GregorianCalendar();

       	this.hour = calendar.get(Calendar.HOUR_OF_DAY);
       	this.minute = calendar.get(Calendar.MINUTE);
       	this.second = calendar.get(Calendar.SECOND);
    }

    public Dimension getPreferredSize() {
    	return new Dimension(200, 200);
    }
}