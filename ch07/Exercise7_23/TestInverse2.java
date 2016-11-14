public class TestInverse2 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter a11, a12, a13, a21, a22, a23, a31, a32, a33: ");
		double[][] matrix = new double[3][3];

		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				matrix[row][column] = input.nextDouble();
			}
		}

		double[][] inverseMatrix = inverse(matrix);
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				System.out.print(inverseMatrix[row][column] + " ");
			}
			System.out.print("\n");
		}
	}

	public static double[][] inverse(double[][] A) {
        double[][] inverseMatrix = new double[3][3];

        double d = A[0][0] * A[1][1] * A[2][2] + A[2][0] * A[0][1] * A[1][2]
                    + A[0][2] * A[1][0] * A[2][1] - A[0][2] * A[1][1] * A[2][0]
                    - A[0][0] * A[1][2] * A[2][1] - A[2][2] * A[1][0] * A[0][1];
        if (d == 0)
        	return null;
        else {
        	inverseMatrix[0][0] = (A[1][1] * A[2][2] - A[1][2] * A[2][1]) / d;
        	inverseMatrix[0][1] = (A[0][2] * A[2][1] - A[0][1] * A[2][2]) / d;
        	inverseMatrix[0][2] = (A[0][1] * A[1][2] - A[0][2] * A[1][1]) / d;
        	inverseMatrix[1][0] = (A[1][2] * A[2][0] - A[1][0] * A[2][2]) / d;
        	inverseMatrix[1][1] = (A[0][0] * A[2][2] - A[0][2] * A[2][0]) / d;
        	inverseMatrix[1][2] = (A[0][2] * A[1][0] - A[0][0] * A[1][2]) / d;
        	inverseMatrix[2][0] = (A[1][0] * A[2][1] - A[1][1] * A[2][0]) / d;
        	inverseMatrix[2][1] = (A[0][1] * A[2][0] - A[0][0] * A[2][1]) / d;
        	inverseMatrix[2][2] = (A[0][0] * A[1][1] - A[0][1] * A[1][0]) / d;
        }
        return inverseMatrix;
	}
}