import java.awt.*;
import javax.swing.*;

public class ChessboardOfTictactoe extends JFrame {
    public ChessboardOfTictactoe() {
        add(new ChessPanel()); 
    }

    public static void main(String[] args) {
    	ChessboardOfTictactoe frame = new ChessboardOfTictactoe();
    	frame.setTitle("Exercise15.7");
    	frame.setSize(300, 300);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}

class ChessPanel extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

        int xCoordinate = 0;
        int yCoordinate = 0;
        int gap = (int)(getWidth() / 3);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int random = (int)(Math.random() * 3);
                if (random == 0) {
                	g.drawLine((int)(xCoordinate + gap * 0.1), (int)(yCoordinate + gap * 0.1), 
                		(int)(xCoordinate + gap - gap * 0.1), (int)(yCoordinate + gap - gap * 0.1));
                    g.drawLine((int)(xCoordinate + gap - gap * 0.1), (int)(yCoordinate + gap * 0.1), 
                    	(int)(xCoordinate + gap * 0.1), (int)(yCoordinate + gap - gap * 0.1));
                }
                else if (random == 1) 
                	g.drawOval((int)(xCoordinate + gap * 0.1), (int)(yCoordinate + gap * 0.1), 
                		(int)(gap * 0.8), (int)(gap * 0.8));
                xCoordinate += gap;
			}
			xCoordinate = 0;
			yCoordinate += gap;
        }
	}
}