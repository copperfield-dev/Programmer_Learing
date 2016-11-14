public class PalindromePrimeNumber {
    public static void main(String[] args) {
	    final int NUMBER_OF_PALINDROMEPRIMES = 100;
		final int NUMBER_OF_PALINDROMEPRIMES_PER_LINE = 10;
		int count = 0;
		int number = 2;
		
		System.out.print("The first 100 palindromeprime numbers are \n");
		
		while (count < NUMBER_OF_PALINDROMEPRIMES) {	
			if (isPrime(number) && isPalindrome(number)) {
			    count++;
				
				if (count % NUMBER_OF_PALINDROMEPRIMES_PER_LINE == 0) 
				    System.out.printf("%5d\n", number);
				else 
				    System.out.printf("%5d ", number);
			}
			
			number++;
		}
	}

	public static boolean isPrime(int number) {
        boolean isPrime = true;
			
		for (int divisor = 2; divisor <= number / 2; divisor++) {
		    if (number % divisor == 0) {
			    isPrime = false;
				break;
			}
		}

		return isPrime;
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
		