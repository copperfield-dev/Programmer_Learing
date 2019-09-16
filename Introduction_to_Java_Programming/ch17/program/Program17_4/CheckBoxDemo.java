import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxDemo extends ButtonDemo {
  private JCheckBox jchkCentered = new JCheckBox("Centered");
  private JCheckBox jchkBold = new JCheckBox("Bold");
  private JCheckBox jchkItalic = new JCheckBox("Italic");

  public static void main(String[] args) {
    CheckBoxDemo frame = new CheckBoxDemo();
    frame.setTitle("CheckBoxDemo");
    frame.setSize(500, 200);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
    
  public CheckBoxDemo() {
    jchkCentered.setMnemonic('C');
    jchkBold.setMnemonic('B');
    jchkItalic.setMnemonic('I');

    JPanel jpCheckBoxes = new JPanel();
    jpCheckBoxes.setLayout(new GridLayout(3, 1));
    jpCheckBoxes.add(jchkCentered);
    jpCheckBoxes.add(jchkBold);
    jpCheckBoxes.add(jchkItalic);
    add(jpCheckBoxes, BorderLayout.EAST);

    jchkCentered.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.setCentered(jchkCentered.isSelected());
      }
    });
    jchkBold.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setNewFont();
      }
    });
    jchkCentered.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setNewFont();
      }
    });
  }

  private void setNewFont() {
    int fontStyle = Font.PLAIN;
    fontStyle += (jchkBold.isSelected() ? Font.BOLD : Font.PLAIN);
    fontStyle += (jchkItalic.isSelected() ? Font.ITALIC : Font.PLAIN);

    Font font = messagePanel.getFont();
    messagePanel.setFont(
      new Font(font.getName(), fontStyle, font.getSize()));
  }
} 

