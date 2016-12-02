public class PrintMatrix {
	public static void main(String[] args) {
		printMatrix(5);
	}

	public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < n; j++) {
        		System.out.print((int)(Math.random() * 10) % 2 + " "); 
        	}
        	System.out.println();
        }
	}
}