import javax.swing.*;

/**
 * Created by copperfield on 18/11/2016.
 */
public class EventDispatcherThreadDemo extends JApplet {
    public EventDispatcherThreadDemo() {
        add(new JLabel("Hi, it runs from an event dispatch thread"));
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("EventDispatcherThreadDemo");
                frame.add(new EventDispatcherThreadDemo());
                frame.setSize(200, 200);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
