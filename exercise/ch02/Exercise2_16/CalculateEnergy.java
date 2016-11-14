import java.util.Scanner;

public class CalculateEnergy {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount of water in kilograms: ");
		double water = input.nextDouble();
		System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
		System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();

        System.out.print("The energy needed is " 
        	+ water * (finalTemperature - initialTemperature) * 4184);
	}
}