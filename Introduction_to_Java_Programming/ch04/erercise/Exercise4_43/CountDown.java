public class CountDown {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter the number of second: ");
		int second = input.nextInt();

		for (int i = second - 1; i > 0; i--) {
			if (i == 1)
			    System.out.print(i + "second remaining\n");
			else
				System.out.print(i + "seconds remaining\n");
		}

		System.out.print("Stopped");
	}
}