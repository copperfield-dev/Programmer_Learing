import javax.swing.JOptionPane;

public class ComputeLoanUsingInputDialog {
    public static void main(String[] args) {
	    String annualInterestRateString = JOptionPane.showInputDialog(
		                                  null, "Enter yearly interest rate:", 
										  "Input", JOptionPane.QUESTION_MESSAGE);
										 
		double annualInterestRate = Double.parseDouble(annualInterestRateString);
		
		double monthlyInterestRate = annualInterestRate / 1200;
		
		String numberOfYearsString = JOptionPane.showInputDialog(
		                             null,"Enter number of years as an integer:", 
									 "Input", JOptionPane.QUESTION_MESSAGE);
									 
		int numberOfYears = Integer.parseInt(numberOfYearsString);
		
		String loanString = JOptionPane.showInputDialog(
		                    null, "Enter loan amount:",
							"Input", JOptionPane.QUESTION_MESSAGE);
							
		double loanAmount = Double.parseDouble(loanString);
		
		double monthlyPayment = loanAmount * monthlyInterestRate / (1
		                        - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
		totalPayment = (int)(totalPayment * 100) / 100.0;
		
		String output = "The monthly payment is " + monthlyPayment + 
		                "\nThe total payment is " + totalPayment;
        JOptionPane.showMessageDialog(null, output);
	}
}
        						