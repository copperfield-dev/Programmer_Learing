import java.util.Scanner;

public class ShowCurrentTime {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

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
		long currentHour = (totalHours + offset) % 24;

		System.out.println("Current time is " + currentHour + ":" 
		                    + currentMinute + ":" + currentSecond + " GMT");
	}
}