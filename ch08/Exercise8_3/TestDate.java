import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		Date date = new Date();

		int count = 1;
        long time = 10000;
    
        while (count < 10) {
        	date.setTime(time);
      		System.out.println(date.toString());   
      		count++;
      		time *= 10;
    	}
	}
}