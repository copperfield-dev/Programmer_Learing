import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class FourLabel extends JFrame {
    public static void main(String[] args) {
    	FourLabel frame = new FourLabel();
    	frame.pack();
        frame.setTitle("Exercise12_5");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }

    public FourLabel() {
    	setLayout(new GridLayout(4, 1));

        JLabel jlblOne = new JLabel("Department of Computer Science");
    	JLabel jlblTwo = new JLabel("School of Computing");
        JLabel jlblThree = new JLabel("Armstrong Atlantic State University");
        JLabel jlblFour = new JLabel("Tel:(912)921-6440");
        
        Border lineBorder = new LineBorder(Color.BLACK, 2);
        jlblOne.setBorder(lineBorder);
        jlblTwo.setBorder(lineBorder);
        jlblThree.setBorder(lineBorder);
        jlblFour.setBorder(lineBorder);

    	add(jlblOne);
    	add(jlblTwo);
    	add(jlblThree);
    	add(jlblFour);
    }
}