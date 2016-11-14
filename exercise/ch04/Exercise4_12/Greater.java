public class Greater {
	public static void main(String[] args) {
		int n = 50;
		while (Math.pow(n, 2) < 12000) {
			n++;
		}
	    System.out.print(n);
	}
}