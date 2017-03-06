import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FutureValueCalculator extends JFrame {
  private JTextField jtfInverstmentAmount = new JTextField();
  private JTextField jtfYears = new JTextField();
  private JTextField jtfAnnualInterestRate = new JTextField();
  private JTextField jtfFutureValue = new JTextField();

  private JButton jbtComputeFutureValue = new JButton("Calculate");

  public FutureValueCalculator() {
    JPanel p1 = new JPanel(new GridLayout(4, 2));
    p1.add(new JLabel("Inverstment Amount"));
    p1.add(jtfInverstmentAmount);
    p1.add(new JLabel("Years"));
    p1.add(jtfYears);
    p1.add(new JLabel("Annual Interest Rate"));
    p1.add(jtfAnnualInterestRate);
    p1.add(new JLabel("Future Value"));
    p1.add(jtfFutureValue);

    JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    p2.add(jbtComputeFutureValue);

    add(p1, BorderLayout.CENTER);
    add(p2, BorderLayout.SOUTH);

    jbtComputeFutureValue.addActionListener(new ButtonListener());
  }

  private class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      int inverstmentAmount = 
        Integer.parseInt(jtfInverstmentAmount.getText());
      int year =
        Integer.parseInt(jtfYears.getText());
      double monthlyInterestRate = 
        Double.parseDouble(jtfAnnualInterestRate.getText()) / 1200;
      
      double futureValue = inverstmentAmount * Math.pow((1 + monthlyInterestRate), (year * 12));

      jtfFutureValue.setText(String.format("%.2f", futureValue));
    }
  }

  public static void main(String[] args) {
    FutureValueCalculator frame = new FutureValueCalculator();
    frame.pack();
    frame.setTitle("Exercise16_5");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}