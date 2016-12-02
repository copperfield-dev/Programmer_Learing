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
  private JPanel panelSlider = new JPanel(new GridLayout(3, 1));
  private JSlider jsldRed = 
    new JSlider(JSlider.HORIZONTAL);
  private JSlider jsldGreen =
    new JSlider(JSlider.HORIZONTAL);
  private JSlider jsldBlue =
    new JSlider(JSlider.HORIZONTAL);
  
  public static void main(String[] args) {
    Demo frame = new Demo();
    frame.setTitle("Exercise17_16");
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
    panelSlider.setBorder(new LineBorder(Color.BLACK));
    jsldRed.setMaximum(255);
    jsldRed.setPaintTicks(true);
    jsldRed.setMajorTickSpacing(20);
    jsldRed.setMinorTickSpacing(5);
    jsldRed.setPaintTrack(false);
    jsldGreen.setMaximum(255);
    jsldGreen.setPaintTicks(true);
    jsldGreen.setMajorTickSpacing(20);
    jsldGreen.setMinorTickSpacing(5);
    jsldGreen.setPaintTrack(false);
    jsldBlue.setMaximum(255);
    jsldBlue.setPaintTicks(true);
    jsldBlue.setMajorTickSpacing(20);
    jsldBlue.setMinorTickSpacing(5);
    jsldBlue.setPaintTrack(false);
    panelSlider.add(jsldRed);
    panelSlider.add(jsldGreen);
    panelSlider.add(jsldBlue);
    panel.setBorder(new TitledBorder("Choose colors"));
    panel.add(panelLabel, BorderLayout.WEST);
    panel.add(panelSlider, BorderLayout.CENTER);
    add(panel);

    jsldRed.addChangeListener(new ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        redValue = jsldRed.getValue();
        Color color = new Color(redValue, greenValue, blueValue);
        jlblColor.setForeground(color);
      }
    }); 

    jsldGreen.addChangeListener(new ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        greenValue = jsldGreen.getValue();
        Color color = new Color(redValue, greenValue, blueValue);
        jlblColor.setForeground(color);
      }
    }); 

    jsldBlue.addChangeListener(new ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        redValue = jsldBlue.getValue();
        Color color = new Color(redValue, greenValue, blueValue);
        jlblColor.setForeground(color);
      }
    }); 
  }
}