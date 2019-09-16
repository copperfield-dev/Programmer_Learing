import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

public class Demo extends JFrame { 
  private Loan loan = new Loan();
  private JPanel panel= new JPanel();
  private JTextField jtfLoanAmount = new JTextField();
  private JTextField jtfNumberOfYears = new JTextField();
  private JButton jbtShowTable = new JButton("Show Table");
  private JTextArea jtaTable = new JTextArea();

  public static void main(String[] args) {
    Demo frame = new Demo();
    frame.setTitle("Exercise17_13");
    frame.setSize(400, 300);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public Demo() {
    setLayout(new BorderLayout());

    panel.setBorder(new LineBorder(Color.BLACK));
    panel.add(new JLabel("Loan Amount"));
    jtfLoanAmount.setText("10000");
    jtfLoanAmount.setHorizontalAlignment(JTextField.LEFT);
    panel.add(jtfLoanAmount);
    panel.add(new JLabel("Number of Years"));
    jtfNumberOfYears.setText("5");
    jtfNumberOfYears.setHorizontalAlignment(JTextField.LEFT);
    panel.add(jtfNumberOfYears);
    panel.add(jbtShowTable);
    add(panel, BorderLayout.NORTH);

    JScrollPane scrollPane = new JScrollPane(jtaTable);
    add(scrollPane, BorderLayout.CENTER);

    jbtShowTable.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        double loanAmount = Double.parseDouble((String)jtfLoanAmount.getText());
        loan.setLoanAmount(loanAmount);
        int numberOfYears = Integer.parseInt((String)jtfNumberOfYears.getText());
        loan.setNumberOfYears(numberOfYears);
        jtaTable.setText("Interest Rate\tMonthly Payment\tTotal Payment\n");
      
        for (double rate = 5; rate <= 8; rate += 1 / 8.0) {
          loan.setAnnualInterestRate(rate);
          jtaTable.append(rate + "\t" +
            (int)(loan.getMonthlyPayment() * 100) / 100.0 +
            "\t\t" + (int)(loan.getTotalPayment() * 100) / 100.0 + "\n");
        }
      }
    });
  }
}

    