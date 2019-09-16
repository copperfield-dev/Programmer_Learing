public class Cabinet {
	public static void main(String[] args) {
		final int NUMBER_OF_LOCKERS = 100;
		boolean[] locker = new boolean[NUMBER_OF_LOCKERS];
		for (int i = 0; i < NUMBER_OF_LOCKERS; i++) {
            locker[i] = false;    
		} 

		for (int i = 0; i < NUMBER_OF_LOCKERS; i++) {
			for (int j = i; j < NUMBER_OF_LOCKERS; j = j + (i + 1)) {
				if (locker[j] == false)
				    locker[j] = true;
				else
				    locker[j] = false; 
			}
		}

		for (int i = 0; i < NUMBER_OF_LOCKERS; i++) {
			if (locker[i] == true)
				System.out.print(i + " ");
		}
 	}
}