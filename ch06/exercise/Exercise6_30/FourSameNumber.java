public class FourSameNumber {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Please enter the size of the array: ");
		int num = input.nextInt();

		int[] numbers = new int[num];
		System.out.print("Please enter " + num + " numbers: ");
		for (int i = 0; i < num; i++) {
			numbers[i] = input.nextInt();
		}

        boolean have = false;
		for (int i = 0; i < numbers.length - 2; i++) {
			if (numbers[i] == numbers[i + 1] &&
				numbers[i] == numbers[i + 2] &&
				numbers[i] == numbers[i + 3]) {
				have = true;
				System.out.print("true");
			    break;
			}
		}

		if (!have)
			System.out.print("false");

	}
}