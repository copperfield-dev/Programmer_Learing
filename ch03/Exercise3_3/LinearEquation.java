
import java.util.Scanner;

public class LinearEquation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

        double delta = a * d - b * c;
		if (delta == 0)
		    System.out.print("The equation has no real roots");
		else 
			System.out.print("x is " + ((e * d - b * f) / delta) 
		    	+ " and y is " + ((a * f - e * c) / delta));			
	}
}