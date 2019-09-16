import java.util.Scanner;

public class CalculateCylinder {
	public static void main(String[] args) {
		final double PI = 3.14159;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		System.out.print("The area is " + radius * radius * PI + "\n");
		System.out.print("The volume is " + radius * radius * PI * length);
	}
}