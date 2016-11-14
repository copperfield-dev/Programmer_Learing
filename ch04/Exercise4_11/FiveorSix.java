public class FiveorSix {
	public static void main(String[] args) {
		int n = 100;
		int count = 0;
		while (n <= 200) {
			if (n % 5 == 0 || n % 6 == 0) {
				if (n % 5 == 0 && n % 6 == 0) {
					n++;
					continue;
				}
				else {
					System.out.printf("%3d ", n);
				    count++;
				}
			}
			if (count == 10) {
				System.out.print("\n");
				count = 0;
			}
			n++;
		}
	}
}