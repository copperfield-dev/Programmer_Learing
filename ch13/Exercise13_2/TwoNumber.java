import java.util.*;

public class TwoNumber {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        int num1 = 0;
        int num2 = 0;
        do {
        	try {
        		System.out.print("Enter two integer: ");
        		num1 = input.nextInt();
        		num2 = input.nextInt();

        		continueInput = false;
        	}

        	catch (InputMismatchException ex) {
        		System.out.println("Try again. (" +
        			"Incorrect input: an integer is required)");
        		input.nextLine();
        	}
        } while (continueInput);

        System.out.println(num1 + num2);
	}
}