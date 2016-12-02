import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

public class Demo extends JFrame { 
  private int redValue, greenValue, blueValue;
  private JLabel jlblColor = new JLabel("Show Colors", JLabel.CENTER);
  private JPanel panel = new JPanel();
  private JPanel panelLabel = new JPanel(new GridLayout(3, 1));
  private JPanel panelScrollBar = new JPanel(new GridLayout(3, 1));
  private JScrollBar jscbRed = 
    new JScrollBar(JScrollBar.HORIZONTAL);
  private JScrollBar jscbGreen =
    new JScrollBar(JScrollBar.HORIZONTAL);
  private JScrollBar jscbBlue =
    new JScrollBar(JScrollBar.HORIZONTAL);
  
  public static void main(String[] args) {
    Demo frame = new Demo();
    frame.setTitle("Exercise17_15");
    frame.setSize(400, 300);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public Demo() {
    setLayout(new GridLayout(2, 1));

    add(jlblColor);

    panel.setLayout(new BorderLayout());
    panelLabel.setBorder(new LineBorder(Color.BLACK));
    panelLabel.add(new JLabel("Red"));
    panelLabel.add(new JLabel("Green"));
    panelLabel.add(new JLabel("Blue"));
    panelScrollBar.setBorder(new LineBorder(Color.BLACK));
    jscbRed.setMaximum(255);
    jscbGreen.setMaximum(255);
    jscbBlue.setMaximum(255);
    panelScrollBar.add(jscbRed);
    panelScrollBar.add(jscbGreen);
    panelScrollBar.add(jscbBlue);
    panel.setBorder(new TitledBorder("Choose colors"));
    panel.add(panelLabel, BorderLayout.WEST);
    panel.add(panelScrollBar, BorderLayout.CENTER);
    add(panel);

    jscbRed.addAdjustmentListener(new AdjustmentListener() {
      public void adjustmentValueChanged(AdjustmentEvent e) {
        redValue = jscbRed.getValue();
        Color color = new Color(redValue, greenValue, blueValue);
        jlblColor.setForeground(color);
      }
    }); 

    jscbGreen.addAdjustmentListener(new AdjustmentListener() {
      public void adjustmentValueChanged(AdjustmentEvent e) {
        greenValue = jscbGreen.getValue();
        Color color = new Color(redValue, greenValue, blueValue);
        jlblColor.setForeground(color);
      }
    }); 

    jscbBlue.addAdjustmentListener(new AdjustmentListener() {
      public void adjustmentValueChanged(AdjustmentEvent e) {
        redValue = jscbBlue.getValue();
        Color color = new Color(redValue, greenValue, blueValue);
        jlblColor.setForeground(color);
      }
    }); 
  }
}