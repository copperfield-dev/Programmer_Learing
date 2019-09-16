import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestFLManage extends JFrame {
	public TestFLManage() {
		JPanel panel = new JPanel(new FlowLayout());

    JButton jbtOne = new JButton("Button 1");
    JButton jbtTwo = new JButton("Button 2");
    JButton jbtThree = new JButton("Button 3");
    JButton jbtFour = new JButton("Button 4");
    JButton jbtFive = new JButton("Button 5");
    JButton jbtSix = new JButton("Button 6");
	
    panel.add(jbtOne);
    panel.add(jbtTwo);
    panel.add(jbtThree);
    panel.add(jbtFour);
    panel.add(jbtFive);
    panel.add(jbtSix);

    add(panel);

    jbtOne.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.out.println("Button 1");
        }
      }
    );

    jbtTwo.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.out.println("Button 2");
        }
      }
    );

    jbtThree.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.out.println("Button 3");
        }
      }
    );

    jbtFour.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.out.println("Button 4");
        }
      }
    );

    jbtFive.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.out.println("Button 5");
        }
      }
    );

    jbtSix.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.out.println("Button 6");
        }
      }
    );
  }

  public static void main(String[] args) {
    TestFLManage frame = new TestFLManage();
    frame.setTitle("Exercise16_1");
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}