public class PrimeNumber {
    public static void main(String[] args) {
	    final int NUMBER_OF_PRIMES = 50;
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		int count = 0;
		int number = 2;
		int[] prime = new int[NUMBER_OF_PRIMES];
		prime[0] = 2;
		System.out.print("The first 50 prime numbers are \n");
		
		while (count < NUMBER_OF_PRIMES) {
		    boolean isPrime = true;
			
			int i = 0;
			while (prime[i] <= Math.sqrt(number)) {
                if (number % prime[i] == 0) {
                	isPrime = false;
                    break;
                }
                i++;
			}
			
			if (isPrime) {
				prime[count] = number;
				count++;
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
				    System.out.println(number);
				}
				else 
				    System.out.print(number + " ");
			}
			
			number++;
		}
	}
}	
