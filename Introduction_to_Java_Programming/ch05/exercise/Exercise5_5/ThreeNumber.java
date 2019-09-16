import java.util.Scanner;

public class ThreeNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Please enter three numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();

		displaySortedNumbers(num1, num2, num3);
	}

	public static void displaySortedNumbers(
		double num1, double num2, double num3) {
		if (num1 > num2) {
			double temp;
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num3 < num2) {
			double temp;
		    temp = num2;
		    num2 = num3;
			num3 = temp;
		}
		if (num2 < num1) {
			double temp;
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.print(num1 + ", " + num2 + ", " + num3);
	}
}