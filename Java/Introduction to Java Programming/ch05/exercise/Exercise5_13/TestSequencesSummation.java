public class TestSequencesSummation {
	public static void main(String[] args) {
		System.out.print(" i\tm(i)\n");
		for (int i = 1; i <= 20; i++) {
			System.out.printf("%2d\t", i);
    		System.out.printf("%6.4f\n", CalculateSummation(i));
		}
	}

	public static double CalculateSummation(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
        	sum += (double)i / (double)(i + 1);
        }
        return sum;
	}
}