public class ACSIIShow {
	public static void main(String[] args) {
		char c = 33;
		int count = 0;
		while (c <= 126) {
		    System.out.printf("%2c ", c);
		    count++;
			if (count == 10) {
				System.out.print("\n");
				count = 0;
			}
			c++;
		}
	}
}