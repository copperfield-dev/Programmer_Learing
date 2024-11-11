import java.awt.*;
import javax.swing.*;

public class ChessBoard extends JFrame {
	public ChessBoard() {
        add(new ChessPanel(), BorderLayout.CENTER);
	}

	public static void main(String[] args) {
        ChessBoard frame = new ChessBoard();
        frame.setSize(300, 300);
        frame.setTitle("Exercise15_3");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
} 

class ChessPanel extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

        int xCoordinate = (int)(getWidth() * 0.1);
        int yCoordinate = (int)(getHeight() * 0.1);
        int gap = (int)(getWidth() * 0.1);

		for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
                    g.setColor(Color.WHITE);
                    g.fillRect(xCoordinate, yCoordinate, gap, gap);
                    xCoordinate += gap;
                    j++;
                    g.setColor(Color.BLACK);
                    g.fillRect(xCoordinate, yCoordinate, gap, gap);
                    xCoordinate += gap;
                }
            }
            else {
                for (int j = 0; j < 8; j++) {
                    g.setColor(Color.BLACK);
                    g.fillRect(xCoordinate, yCoordinate, gap, gap);
                    xCoordinate += gap;
                    j++;
                    g.setColor(Color.WHITE);
                    g.fillRect(xCoordinate, yCoordinate, gap, gap);
                    xCoordinate += gap;
                }
            }
            xCoordinate = (int)(getWidth() * 0.1);
            yCoordinate += gap;
        }
	}
}