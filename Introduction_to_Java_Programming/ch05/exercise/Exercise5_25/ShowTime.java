import java.util.Scanner;

public class ShowTime {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Please enter millis: ");
        long millis = input.nextLong();

        System.out.print(convertMillis(millis));
	}

	public static String convertMillis(long millis) {
       	//Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = millis / 1000;
		
		//Compute the current seconds in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		//Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		//Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
		
		//Obtain the total hours
		long totalHours = totalMinutes / 60;
		
		//Compute the current hour
		long currentHour = totalHours;

		return (String)(currentHour + ":" + currentMinute 
			                + ":" + currentSecond + " GMT");
	}
}