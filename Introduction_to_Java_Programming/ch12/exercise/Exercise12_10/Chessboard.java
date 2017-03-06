import java.awt.*;
import javax.swing.*;

public class Chessboard extends JFrame {
    public Chessboard() {
        setLayout(new GridLayout(9, 9));

        JButton[][] buttons = new JButton[8][8];

        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
                    buttons[i][j] = new JButton();
                    buttons[i][j].setBackground(Color.WHITE);
                    add(buttons[i][j]);
                    j++;
                    buttons[i][j] = new JButton();
                    buttons[i][j].setBackground(Color.BLACK);
                    add(buttons[i][j]);
                }
            }
            else {
                for (int j = 0; j < 8; j++) {
                    buttons[i][j] = new JButton();
                    buttons[i][j].setBackground(Color.BLACK);
                    add(buttons[i][j]);
                    j++;
                    buttons[i][j] = new JButton();
                    buttons[i][j].setBackground(Color.WHITE);
                    add(buttons[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Chessboard frame = new Chessboard();
        frame.setSize(200, 200);
        frame.setTitle("Exercise12_10");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}