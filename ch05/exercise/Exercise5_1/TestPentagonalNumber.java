public class TestPentagonalNumber {
	public static void main(String[] args) {
		final int NUMBERS_OF_PERLINE = 10;
		for (int i = 1; i <= 100; i++) {
			int pentagonalNumber = getPentagonalNumber(i);
            if (i % NUMBERS_OF_PERLINE == 0) 
            	System.out.printf("%5d\n", pentagonalNumber);
            else 
            	System.out.printf("%5d ", pentagonalNumber);
		}
	}

	public static int getPentagonalNumber(int n) {
        int pentagonalNumber = n * (3 * n - 1) / 2;
        return pentagonalNumber;
	}
}