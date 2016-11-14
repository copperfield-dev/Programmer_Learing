import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ShowIcon extends JFrame {
    private ImageIcon ukIcon = new ImageIcon("image/uk.gif");
    private ImageIcon frIcon = new ImageIcon("image/fr.gif");
    private ImageIcon myIcon = new ImageIcon("image/my.jpg");
    private ImageIcon nwIcon = new ImageIcon("image/norway.gif");

    public ShowIcon() {
        setLayout(new GridLayout(2, 2));

        JLabel jlblUK = new JLabel(ukIcon);
        JLabel jlblFR = new JLabel(frIcon);
        JLabel jlblMY = new JLabel(myIcon);
        JLabel jlblNW = new JLabel(nwIcon);

        Border lineBorder = new LineBorder(Color.BLACK);
        jlblUK.setBorder(lineBorder);
        jlblFR.setBorder(lineBorder);
        jlblMY.setBorder(lineBorder);
        jlblNW.setBorder(lineBorder);

        add(jlblUK);
        add(jlblFR);
        add(jlblNW);
        add(jlblMY);
    }

    public static void main(String[] args) {
    	ShowIcon frame = new ShowIcon();
    	frame.pack();
    	frame.setTitle("Exercise12_6");
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}