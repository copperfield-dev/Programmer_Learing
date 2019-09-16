public class WorkHours{
    public static void main(String[] args) {
	    int[][] workHours = {
		    {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}};
			
        int[][] totalHours = new int[workHours.length][2];
        for (int worker = 0; worker < workHours.length; worker++) {
        	totalHours[worker][0] = worker;
            totalHours[worker][1] = 0;
            for (int j = 0; j < workHours[worker].length; j++) {
                totalHours[worker][1] += workHours[worker][j];
            }
        }
        
        pubbleSort(totalHours);
        for (int i = totalHours.length - 1; i >= 0 ; i--) {
        	System.out.println("Worker " + totalHours[i][0] + "'s total work hours are " +
		                totalHours[i][1]);
        }
        
     
    }

    public static void pubbleSort(int[][] list) {
		for (int i = 0; i < list.length; i++) {
			for (int j = list.length - 1; j > i; j--) {
				if (list[j][1] < list[j - 1][1]) {
					int temp;
					temp = list[j][0];
					list[j][0] = list[j - 1][0];
					list[j - 1][0] = temp;
					temp = list[j][1];
					list[j][1] = list[j - 1][1];
					list[j - 1][1] = temp;
				}
			}
		}
	}
}	
