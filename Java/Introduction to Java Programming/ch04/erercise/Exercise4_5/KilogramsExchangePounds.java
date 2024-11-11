public class KilogramsExchangePounds {
	public static void main(String[] args) {
		int kilograms;
		int pounds;

		System.out.print("kilograms    pounds    pounds    kilograms\n");
		for (int i = 1; i <= 2; i++) {
			kilograms = 2 * i - 1;
            System.out.print(kilograms + "             " + (int)(2.2 * kilograms * 100) / 100.0 + "        ");
			pounds = 15 + 5 * i;
			System.out.print(pounds + "        " + (int)(pounds / 2.2 * 100) / 100.0 + "\n"); 
		}  
		for (int i = 3; i <= 5; i++) {
			kilograms = 2 * i - 1;
            System.out.print(kilograms + "             " + (int)(2.2 * kilograms * 100) / 100.0 + "       ");
			pounds = 15 + 5 * i;
			System.out.print(pounds + "        " + (int)(pounds / 2.2 * 100) / 100.0 + "\n"); 
		}  
		for (int i = 6; i <= 16; i++) {
			kilograms = 2 * i - 1;
            System.out.print(kilograms + "            " + (int)(2.2 * kilograms * 100) / 100.0 + "       ");
			pounds = 15 + 5 * i;
			System.out.print(pounds + "        " + (int)(pounds / 2.2 * 100) / 100.0 + "\n"); 
		} 
		for (int i = 17; i <= 23; i++) {
			kilograms = 2 * i - 1;
            System.out.print(kilograms + "            " + (int)(2.2 * kilograms * 100) / 100.0 + "       ");
			pounds = 15 + 5 * i;
			System.out.print(pounds + "       " + (int)(pounds / 2.2 * 100) / 100.0 + "\n"); 
		}   
		for (int i = 24; i <= 50; i++) {
			kilograms = 2 * i - 1;
            System.out.print(kilograms + "            " + (int)(2.2 * kilograms * 100) / 100.0 + "      ");
			pounds = 15 + 5 * i;
			System.out.print(pounds + "       " + (int)(pounds / 2.2 * 100) / 100.0 + "\n"); 
		}  
		for (int i = 51; i <= 100; i++) {
			kilograms = 2 * i - 1;
            System.out.print(kilograms + "           " + (int)(2.2 * kilograms * 100) / 100.0 + "      ");
			pounds = 15 + 5 * i;
			System.out.print(pounds + "       " + (int)(pounds / 2.2 * 100) / 100.0 + "\n"); 
		}  
	}
}