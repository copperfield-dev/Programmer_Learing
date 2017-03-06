public class PrintTable {
	public static void main(String[] args) {
		System.out.print("a\tb\tpow(a, b)\n");
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "\t" + (i + 1) + "\t" + (int)Math.pow(i, i + 1) + "\n");
		}
	}
}