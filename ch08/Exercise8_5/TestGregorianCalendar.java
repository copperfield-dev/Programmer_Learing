import java.util.*;

public class TestGregorianCalendar {
	public static void main(String[] args) {
		GregorianCalendar date = new GregorianCalendar();
		System.out.println("Year: " + date.get(GregorianCalendar.YEAR));
		System.out.println("Month: " + date.get(GregorianCalendar.MONTH));
		System.out.println("Day: " + date.get(GregorianCalendar.DAY_OF_MONTH));
	
	    date.setTimeInMillis(1234567898765L);
	    System.out.println("Year: " + date.get(GregorianCalendar.YEAR));
		System.out.println("Month: " + date.get(GregorianCalendar.MONTH));
		System.out.println("Day: " + date.get(GregorianCalendar.DAY_OF_MONTH));
	}
}