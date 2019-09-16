import java.util.Scanner;

public class TestReverseNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a number: ");
	    int number = input.nextInt();

	    System.out.print("The number reversed is " + reverse(number));
	}

	public static int reverse(int number) {
        int digital = 0;
        int reverseNumber = 0;

        while (number != 0) {
        	digital = number % 10;
        	number = number / 10; 
            reverseNumber = reverseNumber * 10 + digital;
        }

        return reverseNumber;
	}
}