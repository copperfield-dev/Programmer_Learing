public class KilogramsToPounds {
	public static void main(String[] args) {
		int kilograms;
		double pounds;

		System.out.print("kilograms      pounds\n");
		for (int i = 1; i <= 5; i++) {
			kilograms = 2 * i - 1;
			pounds = (int)(2.2 * kilograms * 100) / 100.0;
            System.out.print("  " + kilograms + "             " + pounds + "\n"); 
		} 
		for (int i = 6; i <= 50; i++) {
			kilograms = 2 * i - 1;
			pounds = (int)(2.2 * kilograms * 100) / 100.0;
            System.out.print("  " + kilograms + "            " + pounds + "\n"); 
		} 
		for (int i = 51; i <= 100; i++) {
			kilograms = 2 * i - 1;
			pounds = (int)(2.2 * kilograms * 100) / 100.0;
            System.out.print("  " + kilograms + "           " + pounds + "\n"); 
		} 
        
	}
}