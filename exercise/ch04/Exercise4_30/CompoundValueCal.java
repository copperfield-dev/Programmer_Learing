import java.util.Scanner;

public class CompoundValueCal {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Please enter the money: ");
	    double deposit = input.nextDouble();
        System.out.print("Please enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Please enter number of months: ");
        int numberOfMonth = input.nextInt();
        double balance = 0;
        for (int i = 0; i <  numberOfMonth; i++) {
            balance = (int)((deposit + balance) * (1 + annualInterestRate / 1200) * 1000) / 1000.0;
            System.out.println(balance);
        }
    }
}