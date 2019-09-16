import java.util.Scanner;

public class checkISBN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter ISBN: ");
		int number = input.nextInt();
        
        int d = 0;
        int[] digit = new int[9];
        for (int i = 8; i >= 0; i--) {
            digit[i] = number % 10;
            number = number / 10;
            d += (i + 1) * digit[i];
        }
        d = d % 11;
        for (int i = 0; i < 9; i++) {
            System.out.print(digit[i]);
        }
        System.out.printf("%c", (d == 10)? 'X': (char)(d + 48));
	}
}