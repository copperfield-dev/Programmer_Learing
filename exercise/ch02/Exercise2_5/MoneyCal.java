import java.util.Scanner;

public class MoneyCal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		int gratuity_rate = input.nextInt();
		double gratuity = subtotal * ((double)gratuity_rate / 100);
		double total = subtotal + gratuity;
        System.out.println("The gratuity is " + (int)(gratuity * 100) / 100.0+ " and total is " + (int)(total * 100) / 100.0);
	}
}