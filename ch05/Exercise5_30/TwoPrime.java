public class TwoPrime {
    public static void main(String[] args) {
    	final int NUMBER = 1000;
		int number = 2;
		
		System.out.print("The first 100 palindromeprime numbers are \n");
		
		while (number < NUMBER) {	
			if (isPrime(number) && isPrime(number + 2)) {
				System.out.println("(" + number + ", " + (number + 2) + ")");
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
}	
		