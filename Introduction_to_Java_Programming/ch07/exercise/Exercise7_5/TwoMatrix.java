import java.util.Scanner;

public class TwoMatrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		System.out.print("Enter matrix1: ");
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				matrix1[row][column] = input.nextDouble();
			}
		}
		System.out.print("Enter matrix2: ");
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				matrix2[row][column] = input.nextDouble();
			}
		}

		double[][] resultOfAddMatrix = addMatrix(matrix1, matrix2);
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < matrix1[row].length; column++) 
				System.out.print(matrix1[row][column] + " ");
			if (row == 1) 
				System.out.print(" + ");
			else
				System.out.print("   ");
            for (int column = 0; column < matrix2[row].length; column++) 
				System.out.print(matrix2[row][column] + " ");
			if (row == 1)
				System.out.print(" = ");
			else
				System.out.print("   ");
			for (int column = 0; column < resultOfAddMatrix[row].length; column++) 
				System.out.print(resultOfAddMatrix[row][column] + " ");
			System.out.println();
		}
		System.out.println();
		double[][] resultOfMultiplyMatrix = multiplyMatrix(matrix1, matrix2);
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < matrix1[row].length; column++) 
				System.out.print(matrix1[row][column] + " ");
			if (row == 1) 
				System.out.print(" * ");
			else
				System.out.print("   ");
            for (int column = 0; column < matrix2[row].length; column++) 
				System.out.print(matrix2[row][column] + " ");
			if (row == 1)
				System.out.print(" = ");
			else
				System.out.print("   ");
			for (int column = 0; column < resultOfMultiplyMatrix[row].length; column++) 
				System.out.printf("%.1f ", resultOfMultiplyMatrix[row][column]);
			System.out.println();
		}
	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] resultOfAddMatrix = new double[3][3];
        for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[row].length; column++) {
				resultOfAddMatrix[row][column] 
				    = a[row][column] + b[row][column];
			}
		}
		return resultOfAddMatrix;
	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] resultOfMultiplyMatrix = new double[3][3];
        for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[row].length; column++) {
				for (int i = 0; i < 3; i++) {
					resultOfMultiplyMatrix[row][column] 
				        += a[row][i] * b[i][column];
				}			
			}
		}
		return resultOfMultiplyMatrix;
	}
}