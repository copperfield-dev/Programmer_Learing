import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		System.out.print("Enter a 4-by-4 matrix row by row:\n");

		Scanner input = new Scanner(System.in);
		int[][] matrix = new int[4][4];
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextInt();
			}
		}

		int sumMatrix = sumMatrix(matrix);
		int sumMajorDiagonal = sumMajorDiagonal(matrix);

		System.out.print("Sum of the matrix is " + sumMatrix + "\n");
		System.out.print("Sum of the elements in the major diagonal is " + sumMajorDiagonal + "\n");
	} 

	public static int sumMatrix(int[][] m) {
        int sumMatrix = 0;
        for (int row = 0; row < m.length; row++) {
			for (int column = 0; column < m[row].length; column++) {
				sumMatrix += m[row][column];
			}
		}
		return sumMatrix;
	}

	public static int sumMajorDiagonal(int[][] m) {
    	int sumMajorDiagonal = 0;
    	int row, column;
        for (row = 0; row < m.length; row++) {
		   	column = row;
		   	sumMajorDiagonal += m[row][column];
		}
		return sumMajorDiagonal;
	}
}