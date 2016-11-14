import java.util.Scanner;

public class FourChess {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("| | | | | | | |\n");
		System.out.print("| | | | | | | |\n");
		System.out.print("| | | | | | | |\n");
		System.out.print("| | | | | | | |\n");
		System.out.print("| | | | | | | |\n");
		System.out.print("| | | | | | | |\n");

		char[][] chessBoard = new char[6][7];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				chessBoard[i][j] = ' ';
			}
		}

		int[] row = {5, 5, 5, 5, 5, 5, 5};
		int column;
		int step = 0;
        while(true) {
        	System.out.print("----------------------\n");
        	System.out.print("Drop a red disk at column (0-6): ");
            column = input.nextInt();
        	chessBoard[row[column]][column] = 'R';
        	step++;
        	row[column]--;
        	printBoard(chessBoard);
        	if (isConsecutiveFour(chessBoard)) {
        		System.out.print("----------------------\n");
        		System.out.print("The red player won");
        		break;
        	}

        	System.out.print("----------------------\n");
        	System.out.print("Drop a yellow disk at column (0-6): ");
            column = input.nextInt();
        	chessBoard[row[column]][column] = 'Y';
        	step++;
        	row[column]--;
        	printBoard(chessBoard);
        	if (isConsecutiveFour(chessBoard)) {
        		System.out.print("----------------------\n");
        		System.out.print("The yellow player won");
        		break;
        	}

        	if (step == 42) {
            	System.out.print("The match ended in a draw");
            	break;
            }
        }
		
	} 

	public static boolean isConsecutiveFour(char[][] values) {
        int numberOfRows = values.length;
        int numberOfColumns = values[0].length;
        
        // Check rows
        for (int i = 0; i < numberOfRows; i++) {
        	if (isConsecutiveFourSimple(values[i]))
        		return true;
        }

        // Check column
        for (int i = 0; i < numberOfColumns; i++) {
            char[] column = new char[numberOfRows];
            // Get a column into an array
            for (int j = 0; j < numberOfRows; j++)
                column[j] = values[j][i];  
            if (isConsecutiveFourSimple(column))
        		return true;
        }

        // Check major diagonal (lower part)
        for (int i = 0; i < numberOfRows - 3; i++) {
        	int numberOfElementsInDiagonal 
                = Math.min(numberOfRows - i, numberOfColumns);
            char[] diagonal = new char[numberOfElementsInDiagonal];
            for (int j = 0; j < numberOfElementsInDiagonal; j++)
                diagonal[j] = values[j + i][j];
      
            if (isConsecutiveFourSimple(diagonal))
                return true;
        }

        // Check major diagonal (upper part)
        for (int i = 1; i < numberOfColumns - 3; i++) {
        	int numberOfElementsInDiagonal 
                = Math.min(numberOfColumns - i, numberOfRows);
            char[] diagonal = new char[numberOfElementsInDiagonal];
            for (int j = 0; j < numberOfElementsInDiagonal; j++)
                diagonal[j] = values[j][j + i];
      
            if (isConsecutiveFourSimple(diagonal))
                return true;
        }

        // Check sub-diagonal (left part)
        for (int i = 3; i < numberOfColumns; i++) {
        	int numberOfElementsInDiagonal 
                = Math.min(i + 1, numberOfRows);
            char[] diagonal = new char[numberOfElementsInDiagonal];
            for (int j = 0; j < numberOfElementsInDiagonal; j++)
                diagonal[j] = values[j][i - j];
      
            if (isConsecutiveFourSimple(diagonal))
                return true;
        }

        // Check sub-diagonal (right part)
        for (int i = 1; i < numberOfRows - 3; i++) {
        	int numberOfElementsInDiagonal 
                = Math.min(numberOfRows - i, numberOfColumns);
            char[] diagonal = new char[numberOfElementsInDiagonal];
            for (int j = 0; j < numberOfElementsInDiagonal; j++)
                diagonal[j] = values[j + i][numberOfColumns - j - 1];
      
            if (isConsecutiveFourSimple(diagonal))
                return true;
        }
        return false;
	}

	public static boolean isConsecutiveFourSimple(char[] values) {    
    	for (int i = 0; i < values.length - 3; i++) {
      		boolean isEqual = true;        
            for (int j = i; j < i + 3; j++) {
            	if (values[j] == ' ') {
            		isEqual = false;
            		break;
            	}
                
                if (values[j] != values[j + 1]) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) return true;
        }
        return false;
    }

	public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
        	System.out.print("|");
        	for (int j = 0; j < board[i].length; j++) {
        		System.out.print(board[i][j] + "|");
        	}
        	System.out.print("\n");
        }
	}
}