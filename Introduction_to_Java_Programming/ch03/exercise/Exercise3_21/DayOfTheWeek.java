import java.util.Scanner;

public class DayOfTheWeek {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: ");
		int year = input.nextInt();
		System.out.print("Enter month: ");
		int month = input.nextInt();

		boolean isLeapYear =
		    (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		int days;

		if (isLeapYear && month == 2) days = 29;
		else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			days = 31;
		else days = 30;

		if (month == 1) {
			month = 13;
			year--;
		}
		else if (month == 2) {
			month = 14;
			year--;
		}

		System.out.print("Enter the day of the month: 1-" + days + ": ");
		int day = input.nextInt();

		int h = (day + (int)(26 * (month + 1) / 10) + year % 100 + (int)(year % 100 / 4) + (int)(year / 100 / 4) + 5 * year / 100) % 7;

		switch (h) {
			case 0: System.out.print("Day of the week is " + "Saturday");
			        break;
			case 1: System.out.print("Day of the week is " + "Sunday");
			        break;
			case 2: System.out.print("Day of the week is " + "Monday");
			        break;
			case 3: System.out.print("Day of the week is " + "Tuesday");
			        break;
			case 4: System.out.print("Day of the week is " + "Wednesday");
					break;
			case 5: System.out.print("Day of the week is " + "Thursday");
					break;
			case 6: System.out.print("Day of the week is " + "Friday");
					break;
		}
	}
}