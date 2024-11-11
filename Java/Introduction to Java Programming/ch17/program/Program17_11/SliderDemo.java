import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo extends JFrame {
  private JSlider jsldHort =
    new JSlider(JSlider.HORIZONTAL);
  private JSlider jsldVert = 
    new JSlider(JSlider.VERTICAL);

  private MessagePanel messagePanel =
    new MessagePanel("Welcome to Java");

  public static void main(String[] args) {
    SliderDemo frame = new SliderDemo();
    frame.pack();
    frame.setTitle("SliderDemo");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public SliderDemo() {
    setLayout(new BorderLayout(5, 5));
    add(messagePanel, BorderLayout.CENTER);
    add(jsldHort, BorderLayout.SOUTH);
    add(jsldVert, BorderLayout.EAST);

    jsldHort.setMaximum(50);
    jsldHort.setPaintLabels(true);
    jsldHort.setPaintTicks(true);
    jsldHort.setMajorTickSpacing(10);
    jsldHort.setMinorTickSpacing(1);
    jsldHort.setPaintTrack(false);
    jsldVert.setInverted(true);
    jsldVert.setMaximum(10);
    jsldVert.setPaintLabels(true);
    jsldVert.setPaintTicks(true);
    jsldVert.setMajorTickSpacing(10);
    jsldVert.setMinorTickSpacing(1);

    jsldHort.addChangeListener(new ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        double value = jsldHort.getValue();
        double maximumValue = jsldHort.getMaximum();
        double newX = (value * messagePanel.getWidth() / maximumValue);
        messagePanel.setXCoordinate((int)newX);
      }
    });
    jsldVert.addChangeListener(new ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        double value = jsldVert.getValue();
        double maximumValue = jsldVert.getMaximum();
        double newY = (value * messagePanel.getHeight() / maximumValue);
        messagePanel.setYCoordinate((int)newY);
      }
    });
  }
}