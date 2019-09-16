import java.util.Scanner;

public class AreaOfRegularPolygon{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of sides: ");
        int n = input.nextInt();
		System.out.print("Please enter the side of the regular polygon: ");
		double side = input.nextDouble();

		double area = area(n, side);
		System.out.print("The area of the regular polygon is " + area);
	} 

	public static double area(int n, double side) {
		double area;
		area = (n * side * side) / (4 * Math.tan(Math.PI / n));
		return area;
	}
}