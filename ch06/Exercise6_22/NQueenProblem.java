public class NQueenProblem {	
	private static int numberOfAnswer = 1;
	public static void main(String[] args) {
		final int NUMBER_OF_QUEENS = 8;

		int[] columnIndex = new int[NUMBER_OF_QUEENS];
		for (int i = 0; i < NUMBER_OF_QUEENS; i++) {
			columnIndex[i] = 9999;
		}
		permutation(columnIndex, 0, NUMBER_OF_QUEENS);

	}

	public static void permutation(int columnIndex[], int row, int queens) {
		if (row == queens) {
        	System.out.print("Answer" + numberOfAnswer + ": \n");
        	print_queens(columnIndex, queens);
        	System.out.print("\n");
        	numberOfAnswer++;
        }
		else {
		    for (int i = 0; i < queens; i++) {
                if (check(columnIndex, row, i)) {
            	    columnIndex[row] = i;
               	    permutation(columnIndex, row + 1, queens);
                }
            }    
        } 
	}

	public static void print_queens(int columnIndex[], int queens) {
		for (int i = 0; i < queens; i++) {
			for (int j = 0; j < queens; j++) {
				System.out.print("|");
				if (j == columnIndex[i])
					System.out.print("Q");
				else System.out.print(" ");
			}
			System.out.print("|\n");
		}
	}

	public static boolean check(int columnIndex[], int row, int column) {
        for(int i = 0; i < row; i++) {
            if (columnIndex[i] == column 
            	|| Math.abs(i - row) == Math.abs(columnIndex[i] - column))
                return false;
        }
        return true;
    }
}

