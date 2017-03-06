import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonDemo extends CheckBoxDemo {
  private JRadioButton jrbRed, jrbGreen, jrbBlue;

  public static void main(String[] args) {
    RadioButtonDemo frame = new RadioButtonDemo();
    frame.setTitle("RadioButtonDemo");
    frame.setSize(500, 200);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public RadioButtonDemo() {
    JPanel jpRadioButtons = new JPanel();
    jpRadioButtons.setLayout(new GridLayout(3, 1));
    jpRadioButtons.add(jrbRed = new JRadioButton("Red"));
    jpRadioButtons.add(jrbGreen = new JRadioButton("Green"));
    jpRadioButtons.add(jrbBlue = new JRadioButton("Blue"));
    add(jpRadioButtons, BorderLayout.WEST);

    ButtonGroup group = new ButtonGroup();
    group.add(jrbRed);
    group.add(jrbGreen);
    group.add(jrbBlue);

    jrbRed.setMnemonic('E');
    jrbGreen.setMnemonic('G');
    jrbBlue.setMnemonic('U');

    jrbRed.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.setForeground(Color.red);
      }
    });
    jrbGreen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.setForeground(Color.green);
      }
    });
    jrbBlue.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.setForeground(Color.blue);
      }
    });

    jrbBlue.setSelected(true);
    messagePanel.setForeground(Color.blue);
  }
}