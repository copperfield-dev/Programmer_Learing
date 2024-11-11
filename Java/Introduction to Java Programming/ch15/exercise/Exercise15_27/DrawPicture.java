import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class DrawPicture extends JFrame {
    public DrawPicture() throws Exception {
    	File file = new File("graphics.txt");

		Scanner input = new Scanner(file);

		int numberOfPoint = Integer.parseInt(input.nextLine());
		int[][] points = new int[numberOfPoint][2];
		ArrayList[] lists = new ArrayList[numberOfPoint];

		for (int i = 0; i < numberOfPoint; i++) {
			String[] tokens = input.nextLine().split("[\\s+]");
			points[i][0] = Integer.parseInt(tokens[1]);
			points[i][1] = Integer.parseInt(tokens[2]);

			lists[i] = new ArrayList();
			for (int j = 3; j < tokens.length; j++)
				lists[i].add(Integer.parseInt(tokens[j]));
		}

    	add(new PointGraphicsPanel(points, lists));
    }

	public static void main(String[] args) throws Exception {
		DrawPicture frame = new DrawPicture();
		frame.setTitle("Exercise15.27");
		frame.setSize(500, 450);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class PointGraphicsPanel extends JPanel {
    int[][] points;
    ArrayList[] lists;

    public PointGraphicsPanel(int[][] points, ArrayList[] lists) {
    	this.points = points;
    	this.lists = lists;
    }

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (int i = 0; i < points.length; i++) {
			g.fillOval(points[i][0] - 8, points[i][1] - 8, 16, 16);
			g.drawString(i + "", points[i][0] - 12, points[i][1] - 12);
		}

		for (int i = 0; i < lists.length; i++) {
			for (int j = 0; j < lists[i].size(); j++) {
				int v = (Integer)lists[i].get(j);
				g.drawLine(points[i][0], points[i][1],
					points[v][0], points[v][1]);
			}
		}
	}
}