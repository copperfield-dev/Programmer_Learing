import java.util.Scanner;

public class InterestCal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter balance and interest rate: ");
		int balance = input.nextInt();
		double rate = input.nextDouble();
        System.out.print("The interest is " + (int)(balance * (rate / 1200) * 100000) / 100000.0);
	}
}