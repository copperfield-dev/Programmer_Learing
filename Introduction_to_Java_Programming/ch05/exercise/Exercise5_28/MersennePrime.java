public class MersennePrime {
    public static void main(String[] args) {
    	System.out.print("p\t2^p-1\n");
	    for (int i = 2; i <= 31; i++) {
	    	if (isPrime((int)Math.pow(2, i) - 1))
	    		System.out.print(i + "\t" + ((int)Math.pow(2, i) - 1) + "\n");
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
		