import java.util.Scanner;

public class CompareLoan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Number of Years: ");
		int numberOfYears = input.nextInt();

		System.out.print("Interest Rate\t\tMonthly Payment\t\tTotal Payment\n");
        for (double annualInterestRate = 0.05; 
        	annualInterestRate <= 0.081; 
        	annualInterestRate += 0.00125) {
            System.out.printf("   %5.3f%%", annualInterestRate * 100);
            double monthlyInterestRate = annualInterestRate / 12;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1
		        - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            System.out.printf("\t\t  %6.2f", monthlyPayment);
            double totalPayment = monthlyPayment * numberOfYears * 12;
            System.out.printf("\t\t   %8.2f\n", totalPayment);
        }
	}
}