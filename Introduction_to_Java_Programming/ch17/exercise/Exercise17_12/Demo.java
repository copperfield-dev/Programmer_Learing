import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Demo extends JFrame { 
  private JTextArea jtaMessage = new JTextArea();
  private JPanel panel2 = new JPanel(new GridLayout(1, 3));
  private JCheckBox jchkWrap = new JCheckBox("Wrap");
  private JRadioButton jrbWords = new JRadioButton("Wrap Words");
  private JRadioButton jrbCharacters = new JRadioButton("Wrap Characters");

  public static void main(String[] args) {
    Demo frame = new Demo();
    frame.setTitle("Exercise17_12");
    frame.setSize(400, 300);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public Demo() {
    setLayout(new BorderLayout());

    JScrollPane scrollPane = new JScrollPane(jtaMessage);
    add(scrollPane, BorderLayout.CENTER);

    panel2.setBorder(new TitledBorder("Wrap Options"));
    panel2.add(jchkWrap);
    panel2.add(jrbWords);
    panel2.add(jrbCharacters);
    ButtonGroup group = new ButtonGroup();
    group.add(jrbWords);
    group.add(jrbCharacters);
    add(panel2, BorderLayout.SOUTH);
    
    jchkWrap.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jtaMessage.setLineWrap(jchkWrap.isSelected());

        if (jchkWrap.isSelected()) {
          jrbWords.setEnabled(true);
          jrbCharacters.setEnabled(true);
        }
        else {
          jrbWords.setEnabled(false);
          jrbCharacters.setEnabled(false);
        } 
      }
    }); 

    jrbWords.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jtaMessage.setWrapStyleWord(jchkWrap.isSelected());
        jrbWords.revalidate();
      }
    }); 

    jrbCharacters.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jtaMessage.setWrapStyleWord(!jchkWrap.isSelected());
        jrbCharacters.revalidate();
      }
    });     
  }
}