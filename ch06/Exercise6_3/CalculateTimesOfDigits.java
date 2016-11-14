import java.util.Scanner;

public class CalculateTimesOfDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	    System.out.print("Enter the integers between 1 and 100: ");
        int[] times = new int[100];  
        for (int i = 0; i < 100; i++) {
        	times[i] = 0;
        }
        int digit = 0;
	    while ((digit = input.nextInt()) != 0) {
	    	times[digit - 1]++;
	    }

	    for (int i = 0; i < 100; i++) {
	    	if (times[i] != 0)
	    		if (times[i] > 1) 
	    			System.out.print((i + 1) + " occurs " + times[i] + " times\n");
	    		else 
	    			System.out.print((i + 1) + " occurs " + times[i] + " time\n");
	    }
	}
	
}