import java.util.Scanner;

public class DigitSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();

		int digit1 = number % 10;
		number = number / 10;
		int digit2 = number % 10;
		number = number / 10;
		int digit3 = number % 10;

		System.out.print("The sum of the digits is " + (digit1 + digit2 + digit3));
	}
}