import java.util.Scanner;

public class CDValueCal {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter the initial deposit amount: ");
	    double deposit = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        int numberOfMonth = input.nextInt();
        double value = deposit; 
        System.out.print("Month\t\tCD Value\n");
        for (int i = 0; i < numberOfMonth; i++) {
            System.out.print((i + 1) + "\t\t");
            value = value + value * annualInterestRate / 1200;
            System.out.printf("%8.2f\n", value);
        }
    }
}