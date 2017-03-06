import java.util.Scanner; 

public class CalculateYears {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();

		int days = minutes / 60 /24;
		int years = days / 365;
		int restdays = days % 365;

		System.out.print(minutes + " minutes is approximately " 
			+ years + " years and " + restdays + " days.");
	}
}