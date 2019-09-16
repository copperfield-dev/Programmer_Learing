import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
				
		System.out.print("Enter height in foot and inches: ");
		int heightOfFoot = input.nextInt();
		int heightOfInches = input.nextInt();

		if (heightOfFoot > 0) 
			heightOfInches = heightOfInches + 12 * heightOfFoot;

		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = heightOfInches * METERS_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters); 
		
		System.out.println("Your BMI is " + bmi);
	    if (bmi < 16)
		    System.out.println("You are seriously underweight!");
		else if (bmi < 18)
		    System.out.println("You are underweight!");
		else if (bmi < 24)
		    System.out.println("You are normal weight!");
		else if (bmi < 29)
		    System.out.println("You are underweight!");
		else if (bmi < 35)
		    System.out.println("You are seriously overweight!");
		else 
		    System.out.println("You are gravely overweight!");
	}
}	
		
