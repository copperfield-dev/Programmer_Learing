// FanControlPanel.java: Control a fan
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class FanControl extends JPanel {
  private JButton jbtStart, jbtStop, jbtReverse;
  private JScrollBar jscb;
  private Fan fan;

  public FanControl() {
    JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout(1, 3));
    p1.add(jbtStart = new JButton("Start"));
    p1.add(jbtStop = new JButton("Stop"));
    p1.add(jbtReverse = new JButton("Reverse"));
    p1.setBorder(new LineBorder(Color.black, 1));

    setLayout(new BorderLayout());
    add("North", p1);
    add("Center", fan  = new Fan());
    add("South", jscb = new JScrollBar(
      JScrollBar.HORIZONTAL, 100, 100, 0, 800));
    jscb.setMaximum(1000);

    jbtStart.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        start();
      }
    });
    
    jbtStop.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        stop();
      }
    });
    
    jbtReverse.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        reverse();
      }
    });
    
    jscb.addAdjustmentListener(new AdjustmentListener() {
    	public void adjustmentValueChanged(AdjustmentEvent e) {
        fan.setSpeed((jscb.getMaximum() - jscb.getValue())/10);
    	}
    });
  }

  // Start the fan
  public void start() {
    fan.timer.start();
  }

  // Stop the fan
  public void stop() {
    fan.timer.stop();
  }

  // Reverse the fan
  public void reverse() {
    fan.reverse();
  }

  public Dimension getPreferredSize() {
    return new Dimension(200, 200);
  }
}