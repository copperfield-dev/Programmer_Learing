import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

public class Demo extends JFrame { 
  private FigurePanel panel1= new FigurePanel();
  private JPanel panel2 = new JPanel(new GridLayout(1, 4));
  private JRadioButton jrbLine = new JRadioButton("Line");
  private JRadioButton jrbRectangle = new JRadioButton("Rectangle");
  private JRadioButton jrbOval = new JRadioButton("Oval");
  private JCheckBox jchkFilled = new JCheckBox("Filled");
  
  public static void main(String[] args) {
    Demo frame = new Demo();
    frame.setTitle("Exercise17_2");
    frame.setSize(400, 300);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public Demo() {
    setLayout(new BorderLayout(2, 1));

    panel1.setBorder(new LineBorder(Color.BLACK));
    add(panel1, BorderLayout.CENTER);

    panel2.setBorder(new LineBorder(Color.BLACK));
    ButtonGroup group = new ButtonGroup();
    group.add(jrbLine);
    group.add(jrbRectangle);
    group.add(jrbOval);
    panel2.add(jrbLine);
    panel2.add(jrbRectangle);
    panel2.add(jrbOval);
    panel2.add(jchkFilled);
    add(panel2, BorderLayout.SOUTH);

    jrbLine.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        panel1.setType(FigurePanel.LINE);
      }
    });

    jrbRectangle.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        panel1.setType(FigurePanel.RECTANGLE);
      }
    });

    jrbOval.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        panel1.setType(FigurePanel.OVAL);
      }
    });

    jchkFilled.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (jchkFilled.isSelected()) {
          panel1.setFilled(true);
        }
        else 
          panel1.setFilled(false);
      }
    });
  }
}