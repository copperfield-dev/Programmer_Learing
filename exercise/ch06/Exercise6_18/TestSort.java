import java.util.Scanner;

public class TestSort {
	public static void main(String[] args) {
		final int NUMBERS = 10;
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter numbers: ");
		double[] list = new double[NUMBERS];
		for (int i = 0; i < NUMBERS; i++) {
			list[i] = input.nextDouble();
		}

		pubbleSort(list);

		for (int i = 0; i < NUMBERS; i++) {
			System.out.print(list[i] + " ");
		}
	}

	public static void pubbleSort(double[] list) {
		for (int i = 0; i < list.length; i++) {
			for (int j = list.length - 1; j > i; j--) {
				if (list[j] < list[j - 1]) {
					double temp;
					temp = list[j];
					list[j] = list[j - 1];
					list[j - 1] = temp;
				}
			}
		}
	}

}