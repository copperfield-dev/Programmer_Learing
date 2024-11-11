import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

public class Demo extends JFrame { 
  private JPanel panelTop = new JPanel();
  private JPanel panel1 = new JPanel(new BorderLayout());
  private JPanel panel2 = new JPanel(new BorderLayout());
  private JComboBox jcboFontName = new JComboBox();
  private JComboBox jcboFontSize = new JComboBox();
  // Font name
  private String fontName = "SansSerif";
  // Font style
  private int fontStyle = Font.PLAIN;
  // Font Size
  private int fontSize = 12;

  private MessagePanel messagePanel = new MessagePanel("Java is Cool");
  
  private JPanel panelBottom = new JPanel(new GridLayout(1, 3));
  private JCheckBox jchkCentered = new JCheckBox("Centered");
  private JCheckBox jchkBold = new JCheckBox("Bold");
  private JCheckBox jchkItalic = new JCheckBox("Italic");
 
  public static void main(String[] args) {
    Demo frame = new Demo();
    frame.setTitle("Exercise17_8");
    frame.setSize(600, 300);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public Demo() {
    setLayout(new BorderLayout());
    GraphicsEnvironment e =
      GraphicsEnvironment.getLocalGraphicsEnvironment();
    String[] fontnames = e.getAvailableFontFamilyNames();
    for (int i = 0; i < fontnames.length; i++)
      jcboFontName.addItem(fontnames[i]);
    jcboFontName.setSelectedItem("" + fontName);
    for (int i = 1; i <= 100; i++)
      jcboFontSize.addItem("" + i);
    jcboFontSize.setSelectedItem("" + fontSize);
    panel1.setBorder(new LineBorder(Color.BLACK));
    panel1.add(new JLabel("Font Name"), BorderLayout.WEST);
    panel1.add(jcboFontName, BorderLayout.CENTER);
    panel2.setBorder(new LineBorder(Color.BLACK));
    panel2.add(new JLabel("Font Size"), BorderLayout.WEST);
    panel2.add(jcboFontSize, BorderLayout.CENTER);
    panelTop.add(panel1);
    panelTop.add(panel2);
    add(panelTop, BorderLayout.NORTH);

    messagePanel.setBackground(Color.yellow);
    add(messagePanel, BorderLayout.CENTER);

    panelBottom.add(jchkCentered);
    panelBottom.add(jchkBold);
    panelBottom.add(jchkItalic);
    add(panelBottom, BorderLayout.SOUTH);

    jcboFontName.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        fontName = (String)(jcboFontName.getSelectedItem());
        messagePanel.setFont(new Font(fontName, fontStyle, fontSize));
      } 
    });

    jcboFontSize.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        fontSize = Integer.parseInt(
          (String)(jcboFontSize.getSelectedItem()));
        messagePanel.setFont(new Font(fontName, fontStyle, fontSize));
      }
    });

    jchkCentered.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        messagePanel.setCentered(jchkCentered.isSelected());
      }
    });

    jchkBold.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        fontStyle = Font.PLAIN;

        if (jchkBold.isSelected())
          fontStyle = fontStyle + Font.BOLD;
        messagePanel.setFont(new Font(fontName, fontStyle, fontSize));
      }
    });

    jchkItalic.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        fontStyle = Font.PLAIN;

        if (jchkItalic.isSelected())
          fontStyle = fontStyle + Font.ITALIC;
        messagePanel.setFont(new Font(fontName, fontStyle, fontSize));
      }
    });
  }
}