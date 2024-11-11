import java.util.Scanner;

public class DifferentNumbers {
	public static void main(String[] args) {
		final int NUMBERS = 10;

        Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		
		int[] numbers = new int[NUMBERS];

        int index = 0;
        int number;
		for (int i = 0; i < NUMBERS; i++) {
            number = input.nextInt();
            if (i == 0) numbers[i] = number;
            for (int j = 0; j <= index; j++) {
            	if (number == numbers[j])
            		break;
            	else if (j == index && number != numbers[index]) {
            		numbers[index + 1] = number;
            	    index++;
            	}
            }
		}

        for (int i = 0; i <= index; i++) {	
        	System.out.print(numbers[i] + " ");
        }
	}
}