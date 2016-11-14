import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		int number = input.nextInt();

		StackOfIntegers stack1 = new StackOfIntegers();
        
        int factor = 2;
        while (factor <= number ) {
        	if (isPrime(number)) {
        		stack1.push(number);
        		break;
        	}
        	
        	if (number % factor == 0 && isPrime(factor)) {
        		stack1.push(factor);
        	    number = number / factor;	
        	}
        	else {
        		factor++;
        	}
        }

        while (!stack1.empty()) {
        	System.out.print(stack1.pop() + " ");
        }
        System.out.println();

        StackOfIntegers stack2 = new StackOfIntegers(33);
        int divisor = 1;
        while (divisor <= 120) {
        	if (isPrime(divisor))
                stack2.push(divisor);
            divisor++;
        }

        while (!stack2.empty()) {
        	System.out.print(stack2.pop() + " ");
        }
	}

	public static boolean isPrime(int number) {
        if (number == 1 || number == 2)
        	return true;

		for (int divisor = 2; divisor < number / 2; divisor++) {
			if (number % divisor == 0)
				return false;
		}

		return true;
	}
}