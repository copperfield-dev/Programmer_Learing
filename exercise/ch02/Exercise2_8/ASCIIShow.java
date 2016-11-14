import java.util.Scanner;

public class ASCIIShow {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an ASCII code: ");
        int code = input.nextInt();

        System.out.print("The character for ASCII code " 
        	+ code + " is " + (char)code);
	}
}