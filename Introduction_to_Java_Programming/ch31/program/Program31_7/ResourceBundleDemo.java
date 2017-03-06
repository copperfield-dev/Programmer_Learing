import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by copperfield on 21/12/2016.
 */
public class ResourceBundleDemo extends JApplet {
    private JComboBox jcbcLocale = new JComboBox();
    private ResourceBundle res = ResourceBundle.getBundle("MyResource");
    
    private JLabel jlblInterestRate = new JLabel(res.getString("Annual_Interest_Rate"));
    private JLabel jlblNumberOfYears = new JLabel(res.getString("Number_Of_Years"));
    private JLabel jlblLoanAmount = new JLabel(res.getString("Loan_Amount"));
    private JLabel jlblMonthlyPayment = new JLabel(res.getString("Monthly_Payment"));
    private JLabel jlblTotalPayment = new JLabel(res.getString("Total_Payment"));
    
    private TitledBorder comboBoxTitle = new TitledBorder(res.getString("Choose_a_Locale"));
    private TitledBorder inputTitle = new TitledBorder(res.getString("Enter_Interest_Rate"));
    private TitledBorder paymentTitle = new TitledBorder(res.getString("Payment"));
    
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
        p1.setBorder(comboBoxTitle);
        
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(3, 3));
        p2.add(jlblInterestRate);
        p2.add(jtfInterestRate);
        p2.add(jtfFormattedInterestRate);
        p2.add(jlblNumberOfYears);
        p2.add(jtfNumberOfYears);
        p2.add(jtfFormattedNumberOfYears);
        p2.add(jlblLoanAmount);
        p2.add(jtfLoanAmount);
        p2.add(jtfFormattedLoanAmount);
        p2.setBorder(inputTitle);
        
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(2, 2));
        p3.setBorder(paymentTitle);
        p3.add(jlblMonthlyPayment);
        p3.add(jtfMonthlyPayment);
        p3.add(jlblTotalPayment);
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
                updateStrings();
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
    
    private void updateStrings() {
        res = ResourceBundle.getBundle("MyResource", locale);
        jlblInterestRate.setText(res.getString("Annual_Interest_Rate"));
        jlblNumberOfYears.setText(res.getString("Number_Of_Years"));
        jlblLoanAmount.setText(res.getString("Loan_Amount"));
        jlblMonthlyPayment.setText(res.getString("Monthly_Payment"));
        jlblTotalPayment.setText(res.getString("Total_Payment"));
        jbtCompute.setText(res.getString("Compute"));
        comboBoxTitle.setTitle(res.getString("Choose_a_Locale"));
        inputTitle.setTitle(res.getString("Enter_Interest_Rate"));
        paymentTitle.setTitle(res.getString("Payment"));
        
        repaint();
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
    
    public static void main(String[] args) {
        ResourceBundleDemo applet = new ResourceBundleDemo();
        
        JFrame frame = new JFrame(applet.res.getString("Number_Formatting"));
        
        frame.add(applet, BorderLayout.CENTER);
        
        applet.init();
        applet.start();
        
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
