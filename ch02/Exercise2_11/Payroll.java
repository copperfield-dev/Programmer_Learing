import java.util.Scanner;

public class Payroll {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		System.out.print("Enter number of hours worked in a week: ");
		int hours = input.nextInt();
		System.out.print("Enter hourly pay rate: ");
		double payrate = input.nextDouble();
		System.out.print("Enter federal tax withoutholding rate: ");
		double federaltaxrate = input.nextDouble();
		System.out.print("Enter state tax withoutholding rate: ");
		double statetaxrate = input.nextDouble();
		double federalpay = (int)(payrate * hours * federaltaxrate * 100) / 100.0;
		double statepay = (int)(payrate * hours * statetaxrate * 100) / 100.0;

        System.out.print("Employee name: " + name + "\n" + 
        	             "Hours Worked: " + hours + "\n" +
        	             "Pay Rate:  $" + payrate + "\n" +
        	             "Gross Pay:  $" + payrate * hours + "\n" +
        	             "Deductions:\n" + 
        	             "  Federal Withoutholding (" + (double)(federaltaxrate * 100) + "%): " + "$" + federalpay + "\n" +
                         "  State Withoutholding (" + (double)(statetaxrate * 100) + "%): " + "$" + statepay + "\n" +
                         "  Total Deduction: $" + (federalpay + statepay) + "\n" + 
                         "Net Pay: $" + (payrate * hours - federalpay - statepay));
	}
}