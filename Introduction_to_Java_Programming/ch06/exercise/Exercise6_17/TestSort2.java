import java.util.Scanner;

public class TestSort2 {
	public static void main(String[] args) {
		final int NUMBERS = 10;
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter numbers: ");
		double[] list = new double[NUMBERS];
		for (int i = 0; i < NUMBERS; i++) {
			list[i] = input.nextDouble();
		}

		selectionSort(list);

		for (int i = 0; i < NUMBERS; i++) {
			System.out.print(list[i] + " ");
		}
	}

	public static void selectionSort(double[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			double currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < currentMin) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}

}