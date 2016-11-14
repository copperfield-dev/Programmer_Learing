import javax.swing.*;
import java.awt.*;


public class DrawCartogram extends JFrame {
	public DrawCartogram() {
		setTitle("Erercise15.14&15.15");
		setLayout(new GridLayout(1, 2));
        double[] data = {20, 10, 30, 40};
        String[] dataName = {"Project -- 20%", "Quizzes -- 10%",
		    "Midtems -- 30%", "Final -- 40%"};
		Histogram histogram = new Histogram();
		histogram.setData(dataName, data);
	    PieChart pieChart = new PieChart();
	    pieChart.setData(dataName, data);
		add(histogram);
		add(pieChart);
	}

	public static void main(String[] args) {
		DrawCartogram frame = new DrawCartogram();
		frame.setSize(1000, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class Histogram extends JPanel {
    Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};
	String[] dataName;
	double[] data;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

        double max = data[0];
		for (int i = 1; i < data.length; i++)
			max = Math.max(max, data[i]);

        int barWidth = (int)((getWidth() - 10.0) / data.length - 10);
        int maxBarHeight = getHeight() - 30;
		g.drawLine(5, getHeight() - 10, getWidth() - 5, getHeight() - 10);
        
        int x = 15;
        for (int i = 0; i < data.length; i++) {
        	g.setColor(colors[i]);
            int newHeight = (int)(maxBarHeight * data[i] / max);
            int y = getHeight() - 10 - newHeight;
            g.fillRect(x, y, barWidth, newHeight);
            g.drawString(dataName[i], x, y - 7);
            x += barWidth + 10; 
        }
	}

	public void setData(String[] dataName, double[] data) {
		this.dataName = dataName;
		this.data = data;
    }
}

class PieChart extends JPanel {
    Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};
	String[] dataName;
	double[] data;	

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;

        int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);
        
        int x = xCenter - radius;
        int y = yCenter - radius;

        int startAngle = 0;
        for (int i = 0; i < data.length; i++) {
        	g.setColor(colors[i]);
        	int angle = (int)(360 * data[i] / 100);
            g.fillArc(x, y, 2 * radius, 2 * radius, startAngle, angle);
            startAngle += angle; 
        }
	}

	public void setData(String[] dataName, double[] data) {
		this.dataName = dataName;
		this.data = data;
    }
}