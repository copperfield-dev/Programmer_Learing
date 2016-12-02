import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter two number: ");

		int n1, n2;
		n1 = input.nextInt();
		n2 = input.nextInt();

    	int d;
		if (n1 < n2) 
			d = n1;
		else 
			d = n2;
		for (int i = d; d >= 1; d--) {
			if (n1 % d == 0 && n2 % d == 0) {
				System.out.print("The GCD is " + d);
				break;
			}
		}
	}
}