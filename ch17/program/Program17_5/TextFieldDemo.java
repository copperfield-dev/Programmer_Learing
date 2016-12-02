import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextFieldDemo extends RadioButtonDemo {
  private JTextField jtfMessage = new JTextField(10);

  public static void main(String[] args) {
    TextFieldDemo frame = new TextFieldDemo();
    frame.setTitle("TextFieldDemo");
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public TextFieldDemo() {
    JPanel jpTextField = new JPanel();
    jpTextField.setLayout(new BorderLayout(5, 0));
    jpTextField.add(
      new JLabel("Enter a new message"), BorderLayout.WEST);
    jpTextField.add(jtfMessage, BorderLayout.CENTER);
    add(jpTextField, BorderLayout.NORTH);

    jtfMessage.setHorizontalAlignment(JTextField.RIGHT);

    jtfMessage.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.setMessage(jtfMessage.getText());
        jtfMessage.requestFocusInWindow();
      }
    });
  }
}