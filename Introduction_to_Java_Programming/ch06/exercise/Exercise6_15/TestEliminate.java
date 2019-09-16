public class TestEliminate{
	public static void main(String[] args) {
		final int NUMBERS = 10;
		java.util.Scanner input = new java.util.Scanner(System.in);

		int[] list1 = new int[NUMBERS];
		System.out.print("Enter ten numbers: ");
        for (int i = 0; i < NUMBERS; i++) {
        	list1[i] = input.nextInt();
        }

        int[] list2 = eliminateDuplicates(list1);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < list2.length; i++) {
        	System.out.print(list2[i] + " ");
        }
	}

	public static int[] eliminateDuplicates(int[] list) {
		int[] result = new int[list.length];

        result[0] = list[0];
        int index = 1;
		for (int i = 0; i < list.length; i++) {
			int j;
			for (j = 0; j < index; j++) {
				if (list[i] == result[j])
					break;
			}
			if (j == index) {
				result[index] = list[i];
				index++;
			}
		}

		int[] result2 = new int[index];
		for (int i = 0; i < index; i++) {
			result2[i] = result[i];
		}

		return result2;
	}
}