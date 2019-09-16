import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;  
import javax.swing.border.TitledBorder;

public class Demo extends JFrame { 
  private String horizontal[] = {"LEFT", "CENTER", "RIGHT"};
  private String vertical[] = {"TOP", "CENTER", "BOTTOM"};
  JPanel panel1 = new JPanel();
  ImageIcon icon = new ImageIcon("image/grapes.gif");
  JLabel jlbl = new JLabel("Grapes", icon, SwingConstants.LEFT);
  JPanel panel2 = new JPanel();
  JPanel panelLeft = new JPanel();
  JPanel panelRight = new JPanel();
  JPanel panelLabel1 = new JPanel();
  JPanel panelLabel2 = new JPanel();
  JPanel panelComboBox1 = new JPanel();
  JPanel panelComboBox2 = new JPanel();
  JComboBox jcbLeftHorizontal = new JComboBox(horizontal);
  JComboBox jcbRightHorizontal = new JComboBox(horizontal);
  JComboBox jcbLeftVertical = new JComboBox(vertical);
  JComboBox jcbRightVertical = new JComboBox(vertical);

  public static void main(String[] args) {
    Demo frame = new Demo();
    frame.setTitle("Exercise17_9");
    frame.setSize(600, 280);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public Demo() {
    setLayout(new GridLayout(2, 1));
    
    panel1.setBorder(new LineBorder(Color.BLACK));
    panel1.setLayout(new BorderLayout());
    panel1.add(jlbl, BorderLayout.CENTER);
    add(panel1);

    panel2.setLayout(new GridLayout(1, 2));
    panelLeft.setBorder(new TitledBorder("Horizontal Alignment"));
    panelRight.setBorder(new TitledBorder("Text Position"));

    panelLabel1.setBorder(new LineBorder(Color.BLACK)); 
    panelLabel1.setBorder(new LineBorder(Color.BLACK));
    panelComboBox1.setBorder(new LineBorder(Color.BLACK));
    panelComboBox2.setBorder(new LineBorder(Color.BLACK));

    panelLeft.setLayout(new GridLayout(1, 2));
    panelRight.setLayout(new GridLayout(1, 2));
    panelLabel1.setLayout(new GridLayout(2, 1));
    panelComboBox1.setLayout(new GridLayout(2, 1));
    panelLabel2.setLayout(new GridLayout(2, 1));
    panelComboBox2.setLayout(new GridLayout(2, 1));

    panelLabel1.add(new JLabel("Horizontal"));
    panelLabel1.add(new JLabel("Vertical"));
    panelComboBox1.add(jcbLeftHorizontal);
    panelComboBox1.add(jcbLeftVertical);
    panelLabel2.add(new JLabel("Horizontal"));
    panelLabel2.add(new JLabel("Vertical"));
    panelComboBox2.add(jcbRightHorizontal);
    panelComboBox2.add(jcbRightVertical);

    panelLeft.add(panelLabel1);
    panelLeft.add(panelComboBox1);
    panelRight.add(panelLabel2);
    panelRight.add(panelComboBox2);

    panel2.add(panelLeft);
    panel2.add(panelRight);
    add(panel2);

    jcbLeftHorizontal.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        String selectedItem = (String)jcbLeftHorizontal.getSelectedItem();
        if (selectedItem.equals("LEFT")) {
          jlbl.setHorizontalAlignment(SwingConstants.LEFT);
        }
        else if (selectedItem.equals("CENTER")) {
          jlbl.setHorizontalAlignment(SwingConstants.CENTER);
        }
        else if (selectedItem.equals("RIGHT")) {
          jlbl.setHorizontalAlignment(SwingConstants.RIGHT);
        }
      }
    });

    jcbLeftVertical.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        String selectedItem = (String)jcbLeftVertical.getSelectedItem();
        if (selectedItem.equals("TOP")) {
          jlbl.setVerticalAlignment(SwingConstants.TOP);
        }
        else if (selectedItem.equals("CENTER")) {
          jlbl.setVerticalAlignment(SwingConstants.CENTER);
        }
        else if (selectedItem.equals("BOTTOM")) {
          jlbl.setVerticalAlignment(SwingConstants.BOTTOM);
        }
      }
    });

    jcbRightHorizontal.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        String selectedItem = (String)jcbRightHorizontal.getSelectedItem();
        if (selectedItem.equals("LEFT")) {
          jlbl.setHorizontalTextPosition(SwingConstants.LEFT);
        }
        else if (selectedItem.equals("CENTER")) {
          jlbl.setHorizontalTextPosition(SwingConstants.CENTER);
        }
        else if (selectedItem.equals("RIGHT")) {
          jlbl.setHorizontalTextPosition(SwingConstants.RIGHT);
        }
      }
    });

    jcbRightVertical.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        String selectedItem = (String)jcbRightVertical.getSelectedItem();
        if (selectedItem.equals("TOP")) {
          jlbl.setVerticalTextPosition(SwingConstants.TOP);
        }
        else if (selectedItem.equals("CENTER")) {
          jlbl.setVerticalTextPosition(SwingConstants.CENTER);
        }
        else if (selectedItem.equals("BOTTOM")) {
          jlbl.setVerticalTextPosition(SwingConstants.BOTTOM);
        }
      }
    });
  }
}