import javax.swing.*;
import java.awt.Graphics;

public class DrawCuboid extends JFrame {
    public DrawCuboid() {
	    add(new NewPanel());
    }

    public static void main(String[] args) {
	DrawCuboid frame = new DrawCuboid();
	frame.setTitle("Exercise15.23");
	frame.setSize(300, 200);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
    }
}

class NewPanel extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

        int x = xCenter - radius;
        int y = yCenter - radius;

        g.drawLine(x + 25, y, x + 25 + 100, y);
        g.drawLine(x + 10, y + 25, x + 10 + 100, y + 25);
        g.drawLine(x + 25, y, x + 10, y + 25);
        g.drawLine(x + 25 + 100, y, x + 10 + 100, y + 25);

        g.drawLine(x + 10, y + 25, x + 10, y + 25 + 50);
        g.drawLine(x + 25, y, x + 25, y + 50);
        g.drawLine(x + 10 + 100, y + 25, x + 10 + 100, y + 25 + 50);
        g.drawLine(x + 25 + 100, y, x + 25 + 100, y + 50);

        g.drawLine(x + 10, y + 25 + 50, x + 25, y + 50); 
        g.drawLine(x + 25, y + 50, x + 25 + 100, y + 50);
        g.drawLine(x + 25 + 100, y + 50, x + 10 + 100, y + 25 + 50);
        g.drawLine(x + 10 + 100, y + 25 + 50, x + 10, y + 25 + 50);
    }
}