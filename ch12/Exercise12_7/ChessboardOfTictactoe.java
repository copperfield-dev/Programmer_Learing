import java.awt.*;
import javax.swing.*;

public class ChessboardOfTictactoe extends JFrame {
    private ImageIcon oIcon = new ImageIcon("image/o.gif");
    private ImageIcon xIcon = new ImageIcon("image/x.gif");

    public ChessboardOfTictactoe() {
        setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            int random = (int)(Math.random() * 3);
            if (random == 0) 
                add(new JLabel());
            else if (random == 1)
                add(new JLabel(oIcon));
            else
                add(new JLabel(xIcon));
        }
    }

    public static void main(String[] args) {
    	ChessboardOfTictactoe frame = new ChessboardOfTictactoe();
    	frame.pack();
    	frame.setTitle("Exercise12_7");
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}