import java.awt.event.*;
import javax.swing.JFrame;

public class AdapterDemo extends JFrame {
  public static void main(String[] args) {
    AdapterDemo frame = new AdapterDemo();
    frame.setSize(220, 80);
    frame.setTitle("AdapterDemo");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public AdapterDemo() {
    addWindowListener(new WindowAdapter() {
      public void windowActivated(WindowEvent event) {
        System.out.println("Window activated");
      }
    });
  }
}
