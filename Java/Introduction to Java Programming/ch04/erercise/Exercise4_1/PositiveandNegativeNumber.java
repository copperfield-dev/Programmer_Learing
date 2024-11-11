import java.util.Scanner;

public class PositiveandNegativeNumber {
	public static void main(String[] args) {
		System.out.print("Enter an int value, the program exits if the input is 0:\n");
		Scanner input = new Scanner(System.in);

		int positiveNumber = 0;
		int negativeNumber = 0;
		int total = 0;
		double average = 0;
		int number = input.nextInt();
		while (number != 0) {
            if (number > 0) 
            	positiveNumber++;
            else if (number < 0)
            	negativeNumber++;
            total += number;
            number = input.nextInt();
		}

		System.out.println("The number of positives is " + positiveNumber);
        System.out.println("The number of negatives is " + negativeNumber);
        System.out.println("The total is " + total);
        System.out.print("The average is " + total * 1.0 / (positiveNumber + negativeNumber));
	}
}