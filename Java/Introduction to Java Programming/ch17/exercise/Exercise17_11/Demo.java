import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Demo extends JFrame { 
  private JPanel panel1 = new JPanel(new FlowLayout());
  private JTextField jtfMessage = new JTextField();
  private JPanel panel2 = new JPanel(new GridLayout(1, 2));
  private JPanel panelLeft = new JPanel(new GridLayout(1, 3));
  private JPanel panelRight = new JPanel();
  private JRadioButton jrbLeft = new JRadioButton("Left");
  private JRadioButton jrbCenter = new JRadioButton("Center");
  private JRadioButton jrbRight = new JRadioButton("Right");
  private JTextField jtfColumn = new JTextField();

  public static void main(String[] args) {
    Demo frame = new Demo();
    frame.setTitle("Exercise17_11");
    frame.setSize(400, 120);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public Demo() {
    setLayout(new BorderLayout());

    panel1.add(new JLabel("Text Field"));
    jtfMessage.setText("Type any thing");
    panel1.add(jtfMessage);
    add(panel1, BorderLayout.NORTH);

    panel2.setLayout(new GridLayout(1, 2));
    panelLeft.setBorder(new TitledBorder("Horizontal Alignment"));
    panelLeft.add(jrbLeft);
    panelLeft.add(jrbCenter);
    panelLeft.add(jrbRight);

    ButtonGroup group = new ButtonGroup();
    group.add(jrbLeft);
    group.add(jrbCenter);
    group.add(jrbRight);

    panelRight.setLayout(new BorderLayout());
    panelRight.setBorder(BorderFactory.createEtchedBorder());
    panelRight.add(new JLabel("Column Size"), BorderLayout.WEST);
    panelRight.add(jtfColumn, BorderLayout.CENTER);

    panel2.add(panelLeft);
    panel2.add(panelRight);
    add(panel2, BorderLayout.CENTER);
    
    jtfMessage.setHorizontalAlignment(JTextField.CENTER);

    jrbLeft.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jtfMessage.setHorizontalAlignment(JTextField.LEFT);
      }
    }); 

    jrbCenter.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jtfMessage.setHorizontalAlignment(JTextField.CENTER);
      }
    }); 

    jrbRight.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jtfMessage.setHorizontalAlignment(JTextField.RIGHT);
      }
    }); 

    jtfColumn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jtfMessage.setColumns(
          (new Integer(jtfColumn.getText().trim()).intValue()));
        validate();
      }
    });
    
  }
}