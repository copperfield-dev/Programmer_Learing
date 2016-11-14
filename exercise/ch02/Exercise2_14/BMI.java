import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double inches = input.nextDouble();
        double kilograms = 0.45359237 * pounds;
        double meters = 0.0254 * inches;
        System.out.print("BMI is " + (double)((kilograms / (meters * meters)) * 10000) / 10000.0);
	}
}