import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

        double delta = b * b - 4 * a *c;
		if (delta > 0)
		    System.out.print("The roots are " + ((-b + Math.pow(delta, 0.5)) / (2 * a)) 
		    	+ " and " + ((-b - Math.pow(delta, 0.5)) / (2 * a))); 
		else if (delta == 0)
			System.out.print("The root is " + ((-b + Math.pow(delta, 0.5)) / (2 * a)));
		else 
			System.out.print("The equation has no real roots");
	}
}