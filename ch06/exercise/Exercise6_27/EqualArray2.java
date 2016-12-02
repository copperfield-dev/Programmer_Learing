import java.util.Scanner;

public class EqualArray2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter list1: ");
		int numberOfList1 = input.nextInt();
		int[] list1 = new int[numberOfList1];
		for (int i = 0; i < numberOfList1; i++) {
			list1[i] = input.nextInt();
		}
		System.out.print("Enter list2: ");
		int numberOfList2 = input.nextInt();
		int[] list2 = new int[numberOfList2];
		for (int i = 0; i < numberOfList2; i++) {
			list2[i] = input.nextInt();
		}

		if (equal(list1, list2)) 
			System.out.print("Two lists are strictly identical");
		else 
			System.out.print("Two lists are not strictly identical");
	}

	public static boolean equal(int[] list1, int[] list2) {
		if (list1.length != list2.length)
			return false;
		else {
			selectionSort(list1);
			selectionSort(list2);
			for (int i = 0; i < list1.length; i++) {
				if (list1[i] != list2[i])
					return false;
			}
		}

		return true;
	}

	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int currentMin = list[i];
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