import java.util.Scanner;

public class checkISBN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter ISBN: ");
		int number = input.nextInt();
        
        int d1, d2, d3, d4, d5, d6, d7, d8, d9;
        d9 = number % 10;
        number = number / 10;
        d8 = number % 10;
        number = number / 10;
        d7 = number % 10;
        number = number / 10;
        d6 = number % 10;
        number = number / 10;
        d5 = number % 10;
        number = number / 10;
        d4 = number % 10;
        number = number / 10;
        d3 = number % 10;
        number = number / 10;
        d2 = number % 10;
        number = number / 10;
        d1 = number % 10;
        
        int d = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        System.out.printf("%d%d%d%d%d%d%d%d%d%c", d1, d2, d3, d4, d5, d6, d7, d8, d9, (d == 10)? 'X': (char)(d + 48));
	}
}