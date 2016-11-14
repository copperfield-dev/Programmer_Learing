public class FourSameNumber {
	public static void main(String[] args) {
		int[][] values = {
			{0, 1, 0, 6, 1, 6, 1},
        	{0, 1, 6, 8, 6, 0, 1},
        	{5, 2, 2, 1, 8, 2, 9},
        	{6, 5, 6, 1, 1, 2, 1},
        	{6, 9, 6, 2, 1, 9, 1},
        	{3, 5, 9, 1, 3, 1, 1},
        	{6, 5, 6, 3, 1, 9, 3},
        	{1, 3, 6, 5, 9, 0, 7}
		};

		System.out.println(isConsecutiveFour(values));
	}

	public static boolean isConsecutiveFour(int[][] values) {
        int numberOfRows = values.length;
        int numberOfColumns = values[0].length;
        
        // Check rows
        for (int i = 0; i < numberOfRows; i++) {
        	if (isConsecutiveFourSimple(values[i]))
        		return true;
        }

        // Check column
        for (int i = 0; i < numberOfColumns; i++) {
            int[] column = new int[numberOfRows];
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
            int[] diagonal = new int[numberOfElementsInDiagonal];
            for (int j = 0; j < numberOfElementsInDiagonal; j++)
                diagonal[j] = values[j + i][j];
      
            if (isConsecutiveFourSimple(diagonal))
                return true;
        }

        // Check major diagonal (upper part)
        for (int i = 1; i < numberOfColumns; i++) {
        	int numberOfElementsInDiagonal 
                = Math.min(numberOfColumns - i, numberOfRows);
            int[] diagonal = new int[numberOfElementsInDiagonal];
            for (int j = 0; j < numberOfElementsInDiagonal; j++)
                diagonal[j] = values[j][j + i];
      
            if (isConsecutiveFourSimple(diagonal))
                return true;
        }

        // Check sub-diagonal (left part)
        for (int i = 3; i < numberOfColumns; i++) {
        	int numberOfElementsInDiagonal 
                = Math.min(i + 1, numberOfRows);
            int[] diagonal = new int[numberOfElementsInDiagonal];
            for (int j = 0; j < numberOfElementsInDiagonal; j++)
                diagonal[j] = values[j][i - j];
      
            if (isConsecutiveFourSimple(diagonal))
                return true;
        }

        // Check sub-diagonal (right part)
        for (int i = 1; i < numberOfRows - 3; i++) {
        	int numberOfElementsInDiagonal 
                = Math.min(numberOfRows - i, numberOfColumns);
            int[] diagonal = new int[numberOfElementsInDiagonal];
            for (int j = 0; j < numberOfElementsInDiagonal; j++)
                diagonal[j] = values[j + i][numberOfColumns - j - 1];
      
            if (isConsecutiveFourSimple(diagonal))
                return true;
        }
        return false;
	}

	public static boolean isConsecutiveFourSimple(int[] values) {    
    	for (int i = 0; i < values.length - 3; i++) {
      		boolean isEqual = true;        
            for (int j = i; j < i + 3; j++) {
                if (values[j] != values[j + 1]) {
                    isEqual = false;
                break;
                }
            }
            if (isEqual) return true;
        }
        return false;
    }
}