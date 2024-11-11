public class Less {
	public static void main(String[] args) {
		int n = 1;
		while (Math.pow(n, 3) < 12000) {
			n++;
		}
	    System.out.print(n - 1);
	}
}