import java.util.Scanner;

public class TestCalculateAverage {
	public static void main(String[] args) {
		final int NUMBERS = 10;

		double[] values = new double[NUMBERS];
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 10 values: ");

		for (int i = 0; i < NUMBERS; i++) {
			values[i] = input.nextDouble();
		}

		double average = average(values);
		System.out.print(average);
	}

	public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
        	sum += array[i];
        }

        return sum / array.length;
	}

	public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
        	sum += array[i];
        }

        return sum / array.length;
	}
}