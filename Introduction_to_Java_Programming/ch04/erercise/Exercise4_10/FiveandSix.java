public class FiveandSix {
	public static void main(String[] args) {
		int n = 100;
		int count = 0;
		while (n <= 1000) {
			if (n % 5 == 0 && n % 6 == 0) {
				System.out.printf("%3d ", n);
				count++;
			}
			if (count == 10) {
				System.out.print("\n");
				count = 0;
			}
			n++;
		}
	}
}