public class TestReverse {
	public static void main(String[] args) {
		final int NUMBERS = 10;
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Please enter 10 numbers: ");
		int[] list1 = new int[NUMBERS];
		for (int i = 0; i < NUMBERS; i++) {
			list1[i] = input.nextInt();
		}
		int[] list2 = reverse(list1);

		for (int i = 0; i < NUMBERS; i++) {
			System.out.print(list2[i] + " ");
		}
	}

	public static int[] reverse(int[] list) {
		for (int i = 0, j = list.length -1; i <= j; i++, j--) {
			int temp;
			temp = list[i];
			list[i] = list[j];
			list[j] = temp;
		}

		return list;
	}
}