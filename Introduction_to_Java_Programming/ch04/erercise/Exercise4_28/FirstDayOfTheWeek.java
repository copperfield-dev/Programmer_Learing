import java.util.Scanner;

public class FirstDayOfTheWeek {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: ");
		int year = input.nextInt();
		
		int month;
		int days;
		int day = 1;

		for (month = 1; month <= 12; month++) {
			boolean isLeapYear =
		    (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
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

			int h = (day + (int)(26 * (month + 1) / 10) + year % 100 + (int)(year % 100 / 4) + (int)(year / 100 / 4) + 5 * year / 100) % 7;
			if (month == 13) {
				month = 1;
				year++;
			}
			else if (month == 14) {
				month = 2;
				year++;
			}

			switch (h) {
				case 0: System.out.println("Saturday");
			    	    break;
				case 1: System.out.println("Sunday");
			    	    break;
				case 2: System.out.println("Monday");
			        	break;
				case 3: System.out.println("Tuesday");
			       		break;
				case 4: System.out.println("Wednesday");
						break;
				case 5: System.out.println("Thursday");
						break;
				case 6: System.out.println("Friday");
						break;
			}
		}

		
	}
}