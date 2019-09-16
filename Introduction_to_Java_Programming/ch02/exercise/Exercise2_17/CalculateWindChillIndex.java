import java.util.Scanner;

public class CalculateWindChillIndex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the temperature in Fahrenheit: ");
		double temperature = input.nextDouble();
		System.out.print("Enter the wind speed miles per hour: ");
        double windSpeed = input.nextDouble();

        double windChillIndex = 35.74 + 0.6215 * temperature 
		                       - 35.75 * Math.pow(windSpeed, 0.16)
		                       + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
        System.out.print("The wind chill index  is " 
        	+ windChillIndex);
	}
}