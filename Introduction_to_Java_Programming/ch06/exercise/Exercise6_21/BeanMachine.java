import java.util.Scanner;

public class BeanMachine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of balls to drop: ");
		int numberOfBalls = input.nextInt();
		System.out.print("Enter the number of slots in the bean machine: ");
		int numberOfSlots = input.nextInt();
		System.out.println();

		int[] slots = new int[numberOfSlots + 1];
		for (int i = 0; i < numberOfBalls; i++) {
			int step;
			int digitalOfSlot = 0;
			for (int j = 0; j < numberOfSlots; j++) {
				step = (int)(Math.random() * 10) % 2;
				if (step == 0) {
                    System.out.print("L");
				}				
				else {
                    System.out.print("R");
		            digitalOfSlot++;
				}		
			}
			slots[digitalOfSlot]++;
            System.out.print("\n");
		}

		System.out.println();
		for (int i = 0; i < numberOfSlots; i++) {
			for (int j = 0; j < slots[i]; j++) {
				System.out.print("0");
			}
			System.out.print("\n");
		}
	}
}