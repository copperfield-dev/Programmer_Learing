import java.util.Scanner;

public class TestIndexOfMinimum {
	public static void main(String[] args) {
		final int NUMBERS = 10;

		double[] values = new double[NUMBERS];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");

		for (int i = 0; i < NUMBERS; i++) {
			values[i] = input.nextDouble();
		}

		int indexOfMinimum = indexOfSmallestElement(values);
		System.out.print("The minimum index of number is: " + indexOfMinimum);
	}

	public static int indexOfSmallestElement(double[] array) {
        double minimum = 999999;
        int indexOfMinimum = 0;
        for (int i = 0; i < array.length; i++) {
        	if (array[i] < minimum) {
        		minimum = array[i];
        		indexOfMinimum = i;
        	}
        }

        return indexOfMinimum;
	}
}