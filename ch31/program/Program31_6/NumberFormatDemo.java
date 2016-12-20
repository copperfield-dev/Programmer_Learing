import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by copperfield on 19/12/2016.
 */
public class NumberFormatDemo extends JApplet {
    private JComboBox jcbcLocale = new JComboBox();
    
    private JTextField jtfInterestRate = new JTextField("6.75");
    private JTextField jtfNumberOfYears = new JTextField("15");
    private JTextField jtfLoanAmount = new JTextField("107000");
    private JTextField jtfFormattedInterestRate = new JTextField(10);
    private JTextField jtfFormattedNumberOfYears = new JTextField(10);
    private JTextField jtfFormattedLoanAmount = new JTextField(10);
    
    private JTextField jtfTotalPayment = new JTextField();
    private JTextField jtfMonthlyPayment = new JTextField();
    
    private JButton jbtCompute = new JButton("Compute");
    
    private Locale locale = Locale.getDefault();
    
    private Locale[] locales = Calendar.getAvailableLocales();
    
    public void initializeCombox() {
        for (int i = 0; i < locales.length; i++)
            jcbcLocale.addItem(locales[i].getDisplayName());
    }
    
    @Override
    public void init() {
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(jcbcLocale);
        initializeCombox();
        p1.setBorder(new TitledBorder("Choose a Locale"));
        
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(3, 3));
        p2.add(new JLabel("Interest Rate"));
        p2.add(jtfInterestRate);
        p2.add(jtfFormattedInterestRate);
        p2.add(new JLabel("NUmber of Years"));
        p2.add(jtfNumberOfYears);
        p2.add(jtfFormattedNumberOfYears);
        p2.add(new JLabel("Loan Amount"));
        p2.add(jtfLoanAmount);
        p2.add(jtfFormattedLoanAmount);
        p2.setBorder(new TitledBorder("Enter Annual Interest Rate, " + "Number of Years, and Loan Amount"));
        
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(2, 2));
        p3.setBorder(new TitledBorder("Payment"));
        p3.add(new JLabel("Monthly Payment"));
        p3.add(jtfMonthlyPayment);
        p3.add(new JLabel("Total Payment"));
        p3.add(jtfTotalPayment);
        
        jtfFormattedInterestRate.setHorizontalAlignment(JTextField.RIGHT);
        jtfFormattedNumberOfYears.setHorizontalAlignment(JTextField.RIGHT);
        jtfFormattedLoanAmount.setHorizontalAlignment(JTextField.RIGHT);
        jtfMonthlyPayment.setHorizontalAlignment(JTextField.RIGHT);
        jtfTotalPayment.setHorizontalAlignment(JTextField.RIGHT);
        
        jtfFormattedInterestRate.setEditable(false);
        jtfFormattedNumberOfYears.setEditable(false);
        jtfFormattedLoanAmount.setEditable(false);
        jtfMonthlyPayment.setEditable(false);
        jtfTotalPayment.setEditable(false);
        
        JPanel p4 = new JPanel();
        p4.setLayout(new BorderLayout());
        p4.add(p3, BorderLayout.CENTER);
        p4.add(jbtCompute, BorderLayout.SOUTH);
        
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p4, BorderLayout.SOUTH);
        
        jcbcLocale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                locale = locales[jcbcLocale.getSelectedIndex()];
                computeLoan();
            }
        });
        
        jbtCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                computeLoan();
            }
        });
    }
    
    private void computeLoan() {
        double loan = new Double(jtfLoanAmount.getText()).doubleValue();
        double interestRate = new Double(jtfInterestRate.getText()).doubleValue() / 1240;
        int numberOfYears = new Integer(jtfNumberOfYears.getText()).intValue();
        
        double monthlyPayment = loan * interestRate / (1 - (Math.pow(1 / (1 + interestRate), numberOfYears * 12)));
        double totalPayment = monthlyPayment * numberOfYears * 12;
    
        NumberFormat percentFormatter = NumberFormat.getPercentInstance(locale);
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        NumberFormat numberFormatter = NumberFormat.getNumberInstance(locale);
        percentFormatter.setMinimumFractionDigits(2);
        
        jtfFormattedInterestRate.setText(percentFormatter.format(interestRate * 12));
        jtfFormattedNumberOfYears.setText(numberFormatter.format(numberOfYears));
        jtfFormattedLoanAmount.setText(currencyFormatter.format(loan));
        
        jtfMonthlyPayment.setText(currencyFormatter.format(monthlyPayment));
        jtfTotalPayment.setText(currencyFormatter.format(totalPayment));
    }
}
