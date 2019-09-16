import java.util.Scanner;

public class TotalDays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter month and year: ");
		int month = input.nextInt();
		int year = input.nextInt();

		boolean isLeapYear =
		    (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		int days;

		if (isLeapYear && month == 2) days = 29;
		else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			days = 31;
		else days = 30;

		switch (month) {
			case 1: System.out.print("January " + year + " has " + days + " days");
			        break;
			case 2: System.out.print("February " + year + " has " + days + " days");
			        break;
			case 3: System.out.print("March " + year + " has " + days + " days");
			        break;
			case 4: System.out.print("April " + year + " has " + days + " days");
					break;
			case 5: System.out.print("May " + year + " has " + days + " days");
					break;
			case 6: System.out.print("June " + year + " has " + days + " days");
					break;
			case 7: System.out.print("July " + year + " has " + days + " days");
 					break;
			case 8: System.out.print("August " + year + " has " + days + " days");
					break;
			case 9: System.out.print("September " + year + " has " + days + " days");
					break;
			case 10: System.out.print("October " + year + " has " + days + " days");
					break;
			case 11: System.out.print("November  " + year + " has " + days + " days");
					break;
			case 12: System.out.print("December  " + year + " has " + days + " days");
					break;
		}
	}
}