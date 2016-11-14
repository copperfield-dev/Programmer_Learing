import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Demo extends JFrame {
  private JTextField jtfMile = new JTextField();
  private JTextField jtfKilometer = new JTextField();
  
  public static void main(String[] args) {
    Demo frame = new Demo();
    frame.setTitle("Exercise17_6");
    frame.setSize(300, 100);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public Demo() {
    setLayout(new BorderLayout());
    JPanel panel1 = new JPanel();
    panel1.setLayout(new GridLayout(2, 1));
    panel1.add(new JLabel("Mile"));
    panel1.add(new JLabel("Kilometer"));
    add(panel1, BorderLayout.WEST);

    JPanel panel2 = new JPanel();
    panel2.setLayout(new GridLayout(2, 1));
    jtfMile.setHorizontalAlignment(JTextField.RIGHT);
    jtfKilometer.setHorizontalAlignment(JTextField.RIGHT);
    panel2.add(jtfMile);
    panel2.add(jtfKilometer);
    add(panel2, BorderLayout.CENTER);

    jtfMile.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String mileString = jtfMile.getText();
        Double mile = Double.parseDouble(mileString);
        Double kilometer = mile * 1.602307322544464;
        String kilometerString = String.valueOf(kilometer);
        jtfKilometer.setText(kilometerString);
        jtfMile.requestFocusInWindow();
      }
    });

    jtfKilometer.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String kilometerString = jtfKilometer.getText();
        Double kilometer = Double.parseDouble(kilometerString);
        Double mile = kilometer / 1.602307322544464;
        String mileString = String.valueOf(mile);
        jtfMile.setText(mileString);
        jtfKilometer.requestFocusInWindow();
      }
    });
  }
}