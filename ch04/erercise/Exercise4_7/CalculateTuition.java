public class CalculateTuition  {
    public static void main(String[] args) {
    	int nowTuition = 10000;

    	final int NUMBER_YEAR = 10;
    	double totalTuition = 0;
    	double tenYearsTuition = nowTuition;
    	for (int i = 0; i < NUMBER_YEAR + 4; i++) {
            tenYearsTuition = tenYearsTuition * 1.05;
            
            if (i == 9)
            	System.out.printf("Ten years later the tuition is %.2f\n", tenYearsTuition);

            if (i >= 10)
                totalTuition += tenYearsTuition;
    	}

    	System.out.printf("The total tuition ten years later is %.2f\n", totalTuition);
    }
}