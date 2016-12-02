public class PrintSqrt {
	public static void main(String[] args) {
		System.out.print("number\tsquareRoot\n");
		for (int i = 0; i <= 10; i++) {
			System.out.print(2 * i + "\t" + (int)(Math.sqrt((double)(2 * i)) * 10000) / 10000.0 + "\n");
		}
	}
}