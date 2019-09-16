public class CalcutatePI {
	public static void main(String[] args) {
		final int NUMBER = 10000;
		for (int i = 1; i <= 10; i++) {
            double sum = 0;
			int flag = 1;
			for (int j = 1; j <= 2 * (NUMBER * i) + 1; j += 2) {
				sum += flag * (1.0 / j);
				flag = flag * -1;
			}
			System.out.println(4 * sum);
		}
	}
}