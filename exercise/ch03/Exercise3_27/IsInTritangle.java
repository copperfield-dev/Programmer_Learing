import java.util.Scanner;

public class IsInTritangle {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		double xA = 0;
		double yA = 0;
		double xB = 0;
		double yB = 100;
		double xC = 200;
		double yC = 0;

		boolean state1, state2, state3;
		double a, b, c;

		a = y - yA;
		b = xA - x;
		c = x * yA - xA * y;
		if ((a * xB + b * yB + c) * (a * xC + b * yC + c) > 0)
			state1 = true;
		else state1 = false;

		a = y - yB;
		b = xB - x;
		c = x * yB - xB * y;
		if ((a * xA + b * yA + c) * (a * xC + b * yC + c) > 0)
			state2 = true;
		else state2 = false;
		
		a = y - yC;
		b = xC - x;
		c = x * yC - xC * y;
		if ((a * xA + b * yA + c) * (a * xB + b * yB + c) > 0)
			state3 = true;
		else state3 = false;

		if (state1 || state2 || state3)
			System.out.print("The Point is not in the tritangle");
		else 
			System.out.print("The Point is in the tritangle");
	}
}