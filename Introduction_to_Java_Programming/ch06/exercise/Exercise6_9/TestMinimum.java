import java.util.Scanner;

public class TestMinimum {
	public static void main(String[] args) {
		final int NUMBERS = 10;

		double[] values = new double[NUMBERS];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");

		for (int i = 0; i < NUMBERS; i++) {
			values[i] = input.nextDouble();
		}

		double minimum = min(values);
		System.out.print("The minimum number is: " + minimum);
	}

	public static double min(double[] array) {
        double minimum = 999999;
        for (int i = 0; i < array.length; i++) {
        	if (array[i] < minimum)
        		minimum = array[i];
        }

        return minimum;
	}
}