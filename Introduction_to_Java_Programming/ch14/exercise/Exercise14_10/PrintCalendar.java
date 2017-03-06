import java.util.*;

public class PrintCalendar {
    public static void main(String[] args) {
	    if (args.length != 2) {
	    	System.out.print("Wrong");
	    	System.exit(0);
	    }

	    Calendar calendar = new GregorianCalendar(Integer.parseInt(args[0]), Integer.parseInt(args[1]) - 1, 1);
		printMonth(calendar);
	}
	
	public static void printMonth(Calendar calendar) {
	    printMonthTitle(calendar);
		
		printMonthBody(calendar);
	}
	
	public static void printMonthTitle(Calendar calendar) {
	    System.out.println("        " + getMonthName(calendar.get(Calendar.MONTH) + 1)
		                 + " " + calendar.get(Calendar.YEAR));
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

    public static void printMonthBody(Calendar calendar) {
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        int numberOfDaysInMonth = getNumberOfDaysInMonth(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1);

        int i = 0;
        for (i = 0; i < startDay; i++)
            System.out.print("    ");
        
        for (i = 1; i <= numberOfDaysInMonth; i++) {
			System.out.printf("%4d", i);
			
			if ((i + startDay) % 7 == 0)
			    System.out.println();
		}
		
		System.out.println();
	}
	
	/*public static int getStartDay(int year, int month) {
	    final int START_DAY_FOR_JAN_1_1800 = 3;
		
		int totalNumberOfDays = getTotalNumberOfDays(year, month);
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
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
	}*/
	
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