import java.util.Scanner;

public class Inversion {
	public static void main(String[] args) {
		final int NUMBERS = 10;

        Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		
		int[] numbers = new int[NUMBERS];

		for (int i = 0; i < NUMBERS; i++) {
            numbers[i] = input.nextInt();
		}

        for (int i = NUMBERS - 1; i >= 0; i--) {	
        	System.out.print(numbers[i] + " ");
        }
	}
}