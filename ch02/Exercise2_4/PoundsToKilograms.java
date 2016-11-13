import java.util.Scanner;

public class PoundsToKilograms {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		double kilograms = 0.454 * pounds;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
	}
}