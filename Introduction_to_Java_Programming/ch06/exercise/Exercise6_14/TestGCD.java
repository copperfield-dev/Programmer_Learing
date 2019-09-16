public class TestGCD {
	public static void main(String[] args) {
		final int NUMBERS = 5;
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Please enter 5 numbers: ");
		int[] list = new int[NUMBERS];
		for (int i = 0; i < NUMBERS; i++) {
			list[i] = input.nextInt();
		}
		int gcd = gcd(list);
		System.out.print(gcd);
	}

	public static int gcd(int[] numbers) {
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) 
				min = numbers[i];
		}
		int gcd = 1;
        for (int i = min; i >= 1; i--) {
        	int j;
        	for (j = 0; j < numbers.length; j++) {
        		if (numbers[j] % i != 0) break;
        	}
        	if (j == numbers.length) {
        		gcd = i;
        		break;
        	}
        }

        return gcd;
	}
}