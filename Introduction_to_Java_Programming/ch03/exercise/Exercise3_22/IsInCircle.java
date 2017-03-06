import java.util.Scanner;

public class IsInCircle {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double distance = Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);
		if (distance <= 10)
			System.out.print("Point (" + x + ", " + y + ") is in the circle");
		else 
			System.out.print("Point (" + x + ", " + y + ") is not in the circle");
	}
}