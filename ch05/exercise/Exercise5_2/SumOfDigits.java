import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		long number = input.nextLong();

		System.out.print("The sum of digits is " + sumDigits(number));
	}

	public static int sumDigits(long n) {
		int sum = 0;
        int digit;

		do {
            digit = (int)(n % 10);
            sum = sum + digit;
            n = n / 10;    
		}while(digit != 0);

		return sum;
	}
}