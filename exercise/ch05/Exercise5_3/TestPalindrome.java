import java.util.Scanner;

public class TestPalindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a number: ");
	    int number = input.nextInt();

	    System.out.print("The number is " 
	    	+ ((isPalindrome(number))? "palindrome" : "not palindrome"));
	}

    public static boolean isPalindrome(int number) {
        boolean isPalindrome;

        int reverseNumber = reverse(number);
        if (number == reverseNumber) 
        	isPalindrome = true;
        else isPalindrome = false;
        return isPalindrome;
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