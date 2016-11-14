import java.util.Scanner;

public class LengthOfRunway {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter v and a: ");
		double v = input.nextDouble();
		double a = input.nextDouble();
		double length = Math.pow(v, 2) / (2 * a);
		System.out.println("The minimum runway length for this airplane is " + length);
	}
}