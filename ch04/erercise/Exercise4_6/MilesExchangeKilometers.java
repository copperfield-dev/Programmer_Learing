public class MilesExchangeKilometers {
	public static void main(String[] args) {
		int miles;
		int kilometers;

		System.out.print("miles      kilometers      kilometers      miles\n");
		for (int i = 1; i <= 6; i++) {
			miles = i;
			System.out.print(miles + "            " + (double)(1.609 * miles) + "  "); 
            kilometers = 15 + 5 * i;
            System.out.print("         " + kilometers + "            " + (int)(kilometers / 1.609 * 1000) / 1000.0+ "\n"); 
		}  
		for (int i = 7; i <= 9; i++) {
			miles = i;
			System.out.print(miles + "            " + (double)(1.609 * miles) + " "); 
            kilometers = 15 + 5 * i;
            System.out.print("         " + kilometers + "            " + (int)(kilometers / 1.609 * 1000) / 1000.0 + "\n"); 
		}  
		for (int i = 10; i < 11; i++) {
			miles = i;
			System.out.print(miles + "           " + (double)(1.609 * miles) + "  "); 
            kilometers = 15 + 5 * i;
            System.out.print("         " + kilometers + "            " + (int)(kilometers / 1.609 * 1000) / 1000.0 + "\n"); 
		}
	}
}