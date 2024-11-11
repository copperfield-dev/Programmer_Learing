import java.util.Scanner;

public class InvestmentValueCal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter monthly interest rate: ");
        double monthlyInterestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();
        double futureInvestmentValue = (int)(investmentAmount * Math.pow(1 + monthlyInterestRate / 100, numberOfYears) * 100) / 100.0;
        System.out.print("Accumulated value is " + futureInvestmentValue);
	}
}