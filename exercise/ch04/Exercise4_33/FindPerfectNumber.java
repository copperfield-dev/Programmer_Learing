public class FindPerfectNumber {
	public static void main(String[] args) {
		for (int i = 2; i <= 10000; i++) {
			int number = i;
			for (int j = 1; j <= i / 2 + 1; j++) {
				if (i % j == 0) 
					number = number - j;
			}
			if (number == 0)
				System.out.print(i + " ");
		}
	}
}