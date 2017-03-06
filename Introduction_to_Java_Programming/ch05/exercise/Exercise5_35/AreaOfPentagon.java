import java.util.Scanner;

public class AreaOfPentagon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the side of the pentagon: ");
		double side = input.nextDouble();

		double area = area(side);
		System.out.print("The area of the pentagon is " + area);
	} 

	public static double area(double side) {
		double area;
		area = (5 * side * side) / (4 * Math.tan(Math.PI / 5));
		return area;
	}
}