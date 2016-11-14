import java.util.Scanner;

public class AnalyzeScores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();

		int[] scoreOfStudents = new int[numberOfStudents];

    	int best = 0;
    	System.out.print("Enter " + numberOfStudents + " scores: ");
		for (int i = 0; i < numberOfStudents; i++) {
            scoreOfStudents[i] = input.nextInt();
            if (scoreOfStudents[i] > best) 
            	best = scoreOfStudents[i];
		}

        char[] gradeOfStudents = new char[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
        	if (scoreOfStudents[i] >= (best - 10))
        		gradeOfStudents[i] = 'A';
        	else if (scoreOfStudents[i] >= (best - 20))
        		gradeOfStudents[i] = 'B';
        	else if (scoreOfStudents[i] >= (best - 30))
        		gradeOfStudents[i] = 'C';
        	else if (scoreOfStudents[i] >= (best - 40))
        		gradeOfStudents[i] = 'D';
        	else 
        		gradeOfStudents[i] = 'F';

        	System.out.print("Student " + i + " score is " + gradeOfStudents[i]
        		+ " and grade is " + gradeOfStudents[i] + "\n");
        }
	}
}