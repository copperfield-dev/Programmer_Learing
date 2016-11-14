public class ShowCurrentDateAndTime {
    public static void main(String[] args) {
	    showDateAndTime();
	}

	public static void showDateAndTime() {
        //Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();
		
		//Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;
		
		//Compute the current seconds in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		//Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		//Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
		
		//Obtain the total hours
		long totalHours = totalMinutes / 60;
		
		//Compute the current hour
		long currentHour = totalHours % 24;

		long totalDays = totalHours / 24 + 1;

        System.out.println("Current time is ");

        showDate(totalDays);
		
		System.out.println(currentHour + ":" + currentMinute 
			                + ":" + currentSecond + " GMT");
	}

	public static void showDate(long days) {
		int year = 1970;
		do {
			if (isLeapYear(year)) 
				days = days - 366;
            else 
            	days = days - 365;

            year++;
		}while(days >= 365);

        System.out.print(year);
        int daysInTheMonth;
        int month;
        for (month = 1; month <= 12; month++) {
        	daysInTheMonth = getNumberOfDaysInMonth(year, month);
        	if (days <= daysInTheMonth)
        		break;
        	else 
        		days = days - daysInTheMonth;
        }

        System.out.print(", " + getMonthName(month) + ", " + days + " ");

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