public class CalculateTimesOfDigit {
	public static void main(String[] args) {
        final int NUMBER_OF_DIGITAL = 10;

        int[] counts = new int[NUMBER_OF_DIGITAL];  
        for (int i = 0; i < NUMBER_OF_DIGITAL; i++) {
        	counts[i] = 0;
        }
        
        int digit = 0;
	    for (int i = 0; i < 100; i++) {
	    	digit = (int)(Math.random() * 10);
	    	counts[digit]++;
	    }

	    for (int i = 0; i < NUMBER_OF_DIGITAL; i++) {
	    	if (counts[i] != 0)
	    		if (counts[i] > 1) 
	    			System.out.print(i + " occurs " + counts[i] + " times\n");
	    		else 
	    			System.out.print(i + " occurs " + counts[i] + " time\n");
	    }
	}
	
}