import java.util.*;

public class TestArrayException {
	public static void main(String[] args) {
		int[] numbers = new int[100];

		Scanner input = new Scanner(System.in);
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 100);
		}

        while (true) {
        	try {
        		System.out.print("Enter the index: ");
        		int index = input.nextInt();

        		System.out.println(numbers[index]);
        	}
        	
        	catch (Exception e) {
        		System.out.println("Out of Bounds");
        	}
        }
		
	}
}