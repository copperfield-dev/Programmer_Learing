public class ShowDaysOfYear {
    public static void main(String[] args) {
	    for (int year = 2000; year <= 2010; year++) {
	    	int daysInTheYear = numberOfDaysInAYear(year);
	    	System.out.print(year + " has " + daysInTheYear + " days\n");
	    }
	}

	public static int numberOfDaysInAYear(int year) {
        return (isLeapYear(year)? 366: 365);
	}	

	public static boolean isLeapYear(int year) {
	    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}