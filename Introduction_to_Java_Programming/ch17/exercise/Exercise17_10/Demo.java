import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Demo extends JFrame {
  private JTextField jtfMessage = new JTextField(15);
  private String[] intervals = { "5", "10", "15", "20", "25", 
                                "30", "35", "40", "45", "50", 
                                "55", "60", "65", "70", "75", 
                                "80", "85", "90", "95", "100"};
  protected MessagePanel messagePanel 
    = new MessagePanel("Welcome to Java");
  private JRadioButton jrbRed, jrbYellow, jrbWhite, jrbGray, jrbGreen;
  private JComboBox jcbo = new JComboBox(intervals);
  private JButton jbtLeft = new JButton("<=");
  private JButton jbtRight = new JButton("=>");

  public static void main(String[] args) {
    Demo frame = new Demo();
    frame.setTitle("Exercise17_10");
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public Demo() {
    setLayout(new BorderLayout());
    JPanel jpRadioButtons = new JPanel();
    jpRadioButtons.setBorder(new javax.swing.border.TitledBorder("North Panel"));
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

    messagePanel.setBackground(Color.white);
    messagePanel.setBorder(new javax.swing.border.TitledBorder("Message Panel"));

    JPanel southPanel = new JPanel();
    southPanel.setBorder(new javax.swing.border.TitledBorder("South Panel"));    
    southPanel.add(jbtLeft);
    southPanel.add(jbtRight);
    southPanel.add(new JLabel("Enter a new message"));
    southPanel.add(jtfMessage);
    southPanel.add(new JLabel("Select an interval"));
    southPanel.add(jcbo);

    jbtLeft.setMnemonic('L');
    jbtRight.setMnemonic('R');

    // jbtLeft.setIcon(new ImageIcon("image/left.gif"));
    // jbtRight.setIcon(new ImageIcon("image/right.gif"));
    // jbtLeft.setText(null);
    // jbtRight.setText(null);

    jbtLeft.setToolTipText("Move message to left");
    jbtRight.setToolTipText("Move message to right");

    add(messagePanel, BorderLayout.CENTER);
    add(southPanel, BorderLayout.SOUTH);

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

    jtfMessage.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.setMessage(jtfMessage.getText());
        jtfMessage.requestFocusInWindow();
      }
    });

    jcbo.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        messagePanel.interval = Integer.parseInt((String)jcbo.getSelectedItem(), 10);
      }
    });

    jrbWhite.setSelected(true);
    messagePanel.setBackground(Color.white);
  }
}