import java.util.Scanner;

public class InvestmentValueCal {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

        System.out.print("The amount invested : ");
        double investmentAmount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Years     Future Value\n");
        for (int i = 1; i <= 30; i++) {
            System.out.printf("%2d           %5.2f\n", i, futureInvestmentValue(investmentAmount, annualInterestRate / 12, i));
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        double futureInvestmentValue = (int)(investmentAmount * Math.pow(1 + monthlyInterestRate / 100, years * 12) * 100) / 100.0;
        return futureInvestmentValue;
    }
}