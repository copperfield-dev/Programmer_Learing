import java.util.Scanner;

public class FindFactor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		int number = input.nextInt();

        if (number == 1)
			System.out.print(1);
		else {
			while (number != 1) {
				for (int i = 2; i <= number; i++) {
				    if (number % i == 0) {
						System.out.print(i + " ");
						number = number / i;
						break;
				    }
			    }
		    }
		}	
	}
}