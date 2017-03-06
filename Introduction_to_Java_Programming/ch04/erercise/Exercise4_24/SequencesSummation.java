public class SequencesSummation {
	public static void main(String[] args) {
		double sum = 0;
		for (int i = 1; i < 98; i = i + 2) {
			sum += (1.0 * i) / (i + 2);
		}

		System.out.print(sum);
	}
}