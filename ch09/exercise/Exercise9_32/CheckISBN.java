import java.util.Scanner;

public class CheckISBN {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

        System.out.print("Enter ISBN: ");
	String number = input.nextLine();
        
        int[] digits = new int[9];
        int d = 0;
        for (int i = 0; i < 9; i++) {
            digits[i] = number.charAt(i) - '0';
            d = d + digits[i] * (i + 1);
            System.out.printf("%d", digits[i]);
        }
        
        d = d % 11;
        System.out.printf("%c", (d == 10)? 'X': (char)(d + 48));
	}
}