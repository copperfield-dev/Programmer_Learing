public class GradeExam {
    public static void main(String[] args) {
	    char[][] answers = {
		        {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
				{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}}; 
			
		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
   
        int[][] correctCount = new int[answers.length][2];
        for (int student = 0; student < answers.length; student++) {
        	correctCount[student][0] = student;
            correctCount[student][1] = 0;
            for (int j = 0; j < answers[student].length; j++) {
                if (answers[student][j] == keys[j])
                    correctCount[student][1]++;
            }
        }
        
        pubbleSort(correctCount);
        for (int i = 0; i < correctCount.length; i++) {
        	System.out.println("Student " + correctCount[i][0] + "'s correct count is " +
		                correctCount[i][1]);
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
