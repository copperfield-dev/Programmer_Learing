public class Compare {
	public static void main(String[] args) {
		final int NUMBERS = 50000;
		double sum = 0;
		for (int i = 1; i <= NUMBERS; i++) {
			sum += 1.0 / i;
		}
		System.out.println("Answer1 is " + sum);
		sum = 0;
		for (int i = NUMBERS; i >= 1; i--) {
			sum += 1.0 / i;
		}
		System.out.print("Answer2 is " + sum);
	}
}