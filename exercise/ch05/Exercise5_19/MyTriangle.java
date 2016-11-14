import java.util.Scanner;

public class MyTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter three sides: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.print("Your triangle is " + 
        	(isValid(side1, side2, side3)? "valid": "invalid") + "\n");
        if (isValid(side1, side2, side3)) {
        	System.out.print("The area of the triangle is " + 
        		area(side1, side2, side3));
        }
	}

	public static boolean isValid(
		double side1, double side2, double side3) {
        if (side1 + side2 > side3 
            && side1 + side3 > side2
            && side2 + side3 > side1)
            return true;
        else 
        	return false;
	}

	public static double area(
		double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2.0;
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		return area;    
	}
}