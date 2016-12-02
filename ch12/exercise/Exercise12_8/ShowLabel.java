import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ShowLabel extends JFrame {
    public ShowLabel() {
        setLayout(new GridLayout(2, 3));

        JLabel jlblBlack = new JLabel("black");
        JLabel jlblBlue = new JLabel("blue");
        JLabel jlblCyan = new JLabel("cyan");
        JLabel jlblGreen = new JLabel("green");
        JLabel jlblMagenta = new JLabel("magenata");
        JLabel jlblOrange = new JLabel("orange");

        Border lineBorder = new LineBorder(Color.YELLOW);
        jlblBlack.setBorder(lineBorder);
        jlblBlue.setBorder(lineBorder);
        jlblCyan.setBorder(lineBorder);
        jlblGreen.setBorder(lineBorder);
        jlblMagenta.setBorder(lineBorder);
        jlblOrange.setBorder(lineBorder);

        jlblBlack.setBackground(Color.WHITE);
        jlblBlue.setBackground(Color.WHITE);
        jlblCyan.setBackground(Color.WHITE);
        jlblGreen.setBackground(Color.WHITE);
        jlblMagenta.setBackground(Color.WHITE);
        jlblOrange.setBackground(Color.WHITE);

        jlblBlack.setForeground(Color.BLACK);
        jlblBlue.setForeground(Color.BLUE);
        jlblCyan.setForeground(Color.CYAN);
        jlblGreen.setForeground(Color.GREEN);
        jlblMagenta.setForeground(Color.MAGENTA);
        jlblOrange.setForeground(Color.ORANGE);

        jlblBlack.setToolTipText("black");
        jlblBlue.setToolTipText("blue");
        jlblCyan.setToolTipText("cyan");
        jlblGreen.setToolTipText("green");
        jlblMagenta.setToolTipText("magenata");
        jlblOrange.setToolTipText("orange");

        Font font = new Font("TimesRoman", Font.BOLD, 20);
        jlblBlack.setFont(font);
        jlblBlue.setFont(font);
        jlblCyan.setFont(font);
        jlblGreen.setFont(font);
        jlblMagenta.setFont(font);
        jlblOrange.setFont(font);

        add(jlblBlack);
        add(jlblBlue);
        add(jlblCyan);
        add(jlblGreen);
        add(jlblMagenta);
        add(jlblOrange); 
    }

    public static void main(String[] args) {
    	ShowLabel frame = new ShowLabel();
    	frame.pack();
    	frame.setTitle("Exercise12_8");
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}