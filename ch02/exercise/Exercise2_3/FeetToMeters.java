import java.util.Scanner;

public class FeetToMeters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value in feet: ");
		int feet = input.nextInt();
		double meters = 0.305 * feet;
        System.out.println(feet + " feet is " + meters + " meters");
	}
}