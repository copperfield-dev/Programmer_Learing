public class LargestNumber {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter numbers: ");
        int  number = input.nextInt();
        int max = number;
        int count = 1;
		while (number != 0) {
    		if (number > max) {
    			max = number;
    			count = 1;
    		}
    		else if (number == max)
    			count++;
    		number = input.nextInt();
		}

		System.out.print("The largest number is " + max + "\n");
		System.out.print("The occurrence count of the largest number is " + count);
	}
}