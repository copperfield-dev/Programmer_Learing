public class TestSequencesSummation2 {
	public static void main(String[] args) {
		System.out.print(" i\tm(i)\n");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%3d\t", i * 10);
    		System.out.printf("%6.5f\n", CalculateSummation(i * 10));
		}
	}

	public static double CalculateSummation(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i = i + 2) {
        	sum += 4.0 * (1.0 / (2 * i - 1) - 1.0 / (2 * i + 1));
        }
        return sum;
	}
}