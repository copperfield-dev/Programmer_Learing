import java.util.Scanner;

public class isEvenNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = input.nextInt();
 
		if (number % 2 == 0)
		    System.out.print("Is " + number + " an even number? true"); 
		else 
			System.out.print("Is " + number + " an even number? false");
	}
}