import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		int number = input.nextInt();

		displayPattern(number);
	}

	public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
        	for (int j = 1; j <= n - i; j++) {
        		System.out.print("   ");
        	}
        	for (int k = i; k >= 1; k--) {
        		System.out.printf("%2d ", k);
        	}
        	System.out.print("\n");
        }
	}
}