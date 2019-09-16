import java.util.Scanner;

public class IsInRectangle {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double horizontaldistance = Math.abs(x);
		double verticaldistance = Math.abs(y);
		if (horizontaldistance <= 10 / 2 && verticaldistance <= 5 / 2)
			System.out.print("Point (" + x + ", " + y + ") is in the rectangle");
		else 
			System.out.print("Point (" + x + ", " + y + ") is not in the rectangle");
	}
}