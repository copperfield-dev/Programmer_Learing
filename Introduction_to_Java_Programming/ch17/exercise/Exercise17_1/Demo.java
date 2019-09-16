import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Demo extends JFrame {
  protected MessagePanel messagePanel 
    = new MessagePanel("Welcome to Java");
  private JRadioButton jrbRed, jrbYellow, jrbWhite, jrbGray, jrbGreen;
  private JButton jbtLeft = new JButton("<=");
  private JButton jbtRight = new JButton("=>");

  public static void main(String[] args) {
    Demo frame = new Demo();
    frame.setTitle("Exercise17_1");
    frame.setSize(500, 200);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public Demo() {
    messagePanel.setBackground(Color.white);

    setLayout(new BorderLayout());
    JPanel jpRadioButtons = new JPanel();
    jpRadioButtons.setBorder(new javax.swing.border.TitledBorder("Select Message Panel Background"));
    jpRadioButtons.add(jrbRed = new JRadioButton("Red"));
    jpRadioButtons.add(jrbYellow = new JRadioButton("Yellow"));
    jpRadioButtons.add(jrbWhite = new JRadioButton("White"));
    jpRadioButtons.add(jrbGray = new JRadioButton("Gray"));
    jpRadioButtons.add(jrbGreen = new JRadioButton("Green"));
    add(jpRadioButtons, BorderLayout.NORTH);

    ButtonGroup group = new ButtonGroup();
    group.add(jrbRed);
    group.add(jrbYellow);
    group.add(jrbWhite);
    group.add(jrbGray);
    group.add(jrbGreen);

    JPanel jpButtons = new JPanel();
    jpButtons.add(jbtLeft);
    jpButtons.add(jbtRight);

    jbtLeft.setMnemonic('L');
    jbtRight.setMnemonic('R');

    // jbtLeft.setIcon(new ImageIcon("image/left.gif"));
    // jbtRight.setIcon(new ImageIcon("image/right.gif"));
    // jbtLeft.setText(null);
    // jbtRight.setText(null);

    jbtLeft.setToolTipText("Move message to left");
    jbtRight.setToolTipText("Move message to right");

    add(messagePanel, BorderLayout.CENTER);
    add(jpButtons, BorderLayout.SOUTH);

    jrbRed.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.setBackground(Color.red);
      }
    });

    jrbYellow.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.setBackground(Color.yellow);
      }
    });

    jrbWhite.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.setBackground(Color.white);
      }
    });

    jrbGray.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.setBackground(Color.gray);
      }
    });

    jrbGreen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.setBackground(Color.green);
      }
    });

    jbtLeft.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.moveLeft();
      }
    });
    jbtRight.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.moveRight();
      }
    });

    jrbWhite.setSelected(true);
    messagePanel.setBackground(Color.white);
  }
}