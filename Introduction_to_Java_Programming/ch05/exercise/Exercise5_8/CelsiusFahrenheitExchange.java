public class CelsiusFahrenheitExchange {
	public static void main(String[] args) {
		System.out.print("Celsius    Fahrenheit    Fahrenheit    Celsius\n");
        double celsius = 40.0;
        double fahrenheit = 120.0;
        for (int i = 0; i < 10; i++) {
        	System.out.printf("  %2.1f       %5.1f         %5.1f        %5.2f\n", 
        		celsius, celsiusToFahrenheit(celsius),
        		fahrenheit, fahrenheitToCelsius(fahrenheit));
        	celsius = celsius - 1;
        	fahrenheit = fahrenheit - 10;
        }
		
	}

	public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5.0 / 9;
        return celsius;
	}
}