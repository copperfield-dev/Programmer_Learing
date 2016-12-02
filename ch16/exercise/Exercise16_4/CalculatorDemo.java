import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorDemo extends JFrame {
  private JTextField jtfNumberOne = new JTextField();
  private JTextField jtfNumberTwo = new JTextField();
  private JTextField jtfResult = new JTextField();

  private JButton jbtAdd = new JButton("Add");
  private JButton jbtSubtract = new JButton("Subtract");
  private JButton jbtMultiply = new JButton("Multiply");
  private JButton jbtDivide = new JButton("Divide");

  public CalculatorDemo() {
    JPanel resultPanel = new JPanel(new GridLayout(1, 6));

    resultPanel.add(new JLabel("Number 1"));
    resultPanel.add(jtfNumberOne);
    resultPanel.add(new JLabel("Number 2"));
    resultPanel.add(jtfNumberTwo);
    resultPanel.add(new JLabel("Result"));
    resultPanel.add(jtfResult);

    JPanel operationPanel = new JPanel();
    operationPanel.add(jbtAdd);
    operationPanel.add(jbtSubtract);
    operationPanel.add(jbtMultiply);
    operationPanel.add(jbtDivide);

    add(resultPanel, BorderLayout.NORTH);
    add(operationPanel, BorderLayout.SOUTH);

    jbtAdd.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          double num1 = 
            Double.parseDouble(jtfNumberOne.getText());
          double num2 =
            Double.parseDouble(jtfNumberTwo.getText());
          double result = num1 + num2;

          jtfResult.setText(String.format("%.2f", result));
        }
      }
    );

    jbtSubtract.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          double num1 = 
            Double.parseDouble(jtfNumberOne.getText());
          double num2 =
            Double.parseDouble(jtfNumberTwo.getText());
          double result = num1 - num2;

          jtfResult.setText(String.format("%.2f", result));
        }
      }
    );

    jbtMultiply.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          double num1 = 
            Double.parseDouble(jtfNumberOne.getText());
          double num2 =
            Double.parseDouble(jtfNumberTwo.getText());
          double result = num1 * num2;

          jtfResult.setText(String.format("%.2f", result));
        }
      }
    );

    jbtDivide.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          double num1 = 
            Double.parseDouble(jtfNumberOne.getText());
          double num2 =
            Double.parseDouble(jtfNumberTwo.getText());
          double result = num1 / num2;

          jtfResult.setText(String.format("%.2f", result));
        }
      }
    );
  }

  public static void main(String[] args) {
    CalculatorDemo frame = new CalculatorDemo();
    frame.pack();
    frame.setTitle("CalculatorDemo");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}