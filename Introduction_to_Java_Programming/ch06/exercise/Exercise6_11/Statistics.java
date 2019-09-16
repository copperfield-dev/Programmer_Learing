import java.util.Scanner;

public class Statistics {
	public static void main(String[] args) {
		final int NUMBER_OF_ELEMENTS = 10;
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[NUMBER_OF_ELEMENTS];
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
			numbers[i] = input.nextDouble(); 
		}

        System.out.print("The mean is " + mean(numbers) + "\n");
        System.out.print("The standard deviation is " + devitation(numbers));
	}

	public static double mean(double[] x) {
		final int NUMBER_OF_ELEMENTS = 10;
        double sum = 0;
		for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
			sum += x[i];
		}
		return sum / NUMBER_OF_ELEMENTS;
	}

	public static double devitation(double[] x) {
		final int NUMBER_OF_ELEMENTS = 10;
		double mean = mean(x);
        double sum = 0;
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
        	sum += Math.pow(x[i] - mean, 2);
        }

        double deviation = Math.sqrt(sum / (NUMBER_OF_ELEMENTS - 1));
        return deviation;
	}
}