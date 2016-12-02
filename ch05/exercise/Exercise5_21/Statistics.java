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
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
        	sum1 += Math.pow(x[i], 2);
        }
        for (int j = 0; j < NUMBER_OF_ELEMENTS; j++) {
        	sum2 += x[j];
        }
        sum2 = Math.pow(sum2, 2) / NUMBER_OF_ELEMENTS;
        double deviation = (sum1 - sum2) / (NUMBER_OF_ELEMENTS - 1);
        deviation = Math.pow(deviation, 0.5);
        return deviation;
	}
}