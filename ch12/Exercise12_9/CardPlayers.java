import java.awt.*;
import javax.swing.*;

public class CardPlayers extends JFrame {
    public CardPlayers() {
        setLayout(new BorderLayout());

        int random;
        String randomString;
        random = (int)(Math.random() * 54) + 1;
        randomString = Integer.toString(random, 10);
        JLabel jlblLeft = new JLabel(
            new ImageIcon("image/card/" + randomString + ".png"));
        add(jlblLeft, BorderLayout.WEST);

        random = (int)(Math.random() * 54) + 1;
        randomString = Integer.toString(random, 10);
        JLabel jlblCENTER = new JLabel(
            new ImageIcon("image/card/" + randomString + ".png"));
        add(jlblCENTER, BorderLayout.CENTER);

        random = (int)(Math.random() * 54) + 1;
        randomString = Integer.toString(random, 10);
        JLabel jlblRight = new JLabel(
            new ImageIcon("image/card/" + randomString + ".png"));
        add(jlblRight, BorderLayout.EAST);
    }

    public static void main(String[] args) {
    	CardPlayers frame = new CardPlayers();
    	frame.pack();
    	frame.setTitle("Exercise12_9");
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}