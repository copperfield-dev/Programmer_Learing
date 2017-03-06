import java.util.Scanner;

public class PrintCalendar {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
		System.out.print("Enter year: ");
		int year = input.nextInt();
		
		for (int i = 1; i <= 12; i++)
		    printMonth(year, i);
	}
	
	public static void printMonth(int year, int month) {
	    printMonthTitle(year, month);
		
		printMonthBody(year, month);
	}
	
	public static void printMonthTitle(int year, int month) {
	    System.out.println("        " + getMonthName(month)
		                 + " " + year);
		System.out.println("----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
	
	public static String getMonthName(int month) {
	    String monthName = " ";
		switch (month) {
		    case 1: monthName = "January"; break;
			case 2: monthName = "February"; break;
			case 3: monthName = "March"; break;
			case 4: monthName = "April"; break;
			case 5: monthName = "May"; break;
			case 6: monthName = "June"; break;
			case 7: monthName = "July"; break;
			case 8: monthName = "August"; break;
			case 9: monthName = "September"; break;
			case 10: monthName = "October"; break;
			case 11: monthName = "November"; break;
			case 12: monthName = "December";
		}
		
		return monthName;
	}

    public static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);

        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        int i = 0;
        for (i = 0; i < startDay; i++)
            System.out.print("    ");
        
        for (i = 1; i <= numberOfDaysInMonth; i++) {
			System.out.printf("%4d", i);
			
			if ((i + startDay) % 7 == 0)
			    System.out.println();
		}
		
		System.out.println("\n");
	}
	
	public static int getStartDay(int year, int month) {
		int day = 1;
		if (month == 1) {
			month = 13;
			year--;
		}
			
		else if (month == 2) {
			month = 14;
			year--;
		}
			
        int h = (day + (int)(26 * (month + 1) / 10) + year % 100 + (int)(year % 100 / 4) + (int)(year / 100 / 4) + 5 * year / 100) % 7;
        switch (h) {
			case 0: h = 6;
			        break;
		    case 1: h = 0;
			        break;
			case 2: h = 1;
			        break;
			case 3: h = 2;
			        break;
			case 4: h = 3;
					break;
			case 5: h = 4;
					break;
			case 6: h = 5;
					break;
		}
	    return h;
	}
	
	public static int getTotalNumberOfDays(int year, int month) {
	    int total = 0;
		
		for (int i = 1800; i < year; i++)
		    if (isLeapYear(i))
			    total = total + 366;
			else 
			    total = total + 365;
		
		for (int i = 1; i < month; i++)
		    total = total + getNumberOfDaysInMonth(year, i);
			
		return total;
	}
	
	public static int getNumberOfDaysInMonth(int year, int month) {
	    if (month == 1 || month == 3 || month == 5 || month == 7 || 
		    month == 8 || month == 10 || month == 12)
		    return 31;
		
		if (month == 4 || month == 6 || month == 9 || month == 11)
		    return 30;
	
	    if (month == 2) return isLeapYear(year)? 29 : 28;
		
		return 0;
	}
	
	public static boolean isLeapYear(int year) {
	    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}