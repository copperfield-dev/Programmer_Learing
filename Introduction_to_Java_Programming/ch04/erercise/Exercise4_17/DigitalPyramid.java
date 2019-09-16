import java.util.Scanner;

public class DigitalPyramid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
        	for (int j = number - i; j >= 0; j--) {
        		System.out.print("  ");
        	}
        	for (int k = i; k >= 1; k--) {
        		System.out.print(k + " ");
        	}
            for (int k = 2; k <= i; k++) {
            	System.out.print(k + " ");
            }
            System.out.print("\n");
        }
    }
}