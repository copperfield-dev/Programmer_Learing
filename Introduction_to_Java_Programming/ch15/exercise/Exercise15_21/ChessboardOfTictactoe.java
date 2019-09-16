import java.awt.*;
import javax.swing.*;

public class ChessboardOfTictactoe extends JFrame {
    public ChessboardOfTictactoe() {
        setLayout(new GridLayout(3, 3));
        
        for (int i = 0; i < 9; i++)
            add(new ImagePanel());
    }

    public static void main(String[] args) {
    	ChessboardOfTictactoe frame = new ChessboardOfTictactoe();
    	frame.setSize(300, 300);
    	frame.setTitle("Exercise15.21");
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}

class ImagePanel extends JPanel {
    private ImageIcon oIcon = new ImageIcon("image/o.gif");
    private ImageIcon xIcon = new ImageIcon("image/x.gif");
    private Image image1 = oIcon.getImage();
    private Image image2 = xIcon.getImage();

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int random = (int)(Math.random() * 3);
        if (random == 0) 
            g.drawImage(image1, 0, 0, getWidth(), getHeight(), this);
        else if (random == 1)
            g.drawImage(image2, 0, 0, getWidth(), getHeight(), this);
    }
}