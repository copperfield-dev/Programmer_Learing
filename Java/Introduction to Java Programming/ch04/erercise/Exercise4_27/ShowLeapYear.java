public class ShowLeapYear {
	public static void main(String[] args) {
		boolean isLeapYear; 
		int count = 0;
		for (int year = 2001; year <= 2100; year++) {
			isLeapYear =
		    (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		    if (isLeapYear) {
		    	System.out.print(year + " ");
                count++;
                if (count % 10 == 0)
                	System.out.print("\n");
		    }
		}
	}
}