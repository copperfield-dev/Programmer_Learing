public class TestInverse {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter a, b, c, d: ");
		double[][] matrix = new double[2][2];

		for (int row = 0; row < 2; row++) {
			for (int column = 0; column < 2; column++) {
				matrix[row][column] = input.nextDouble();
			}
		}

		double[][] inverseMatrix = inverse(matrix);
		for (int row = 0; row < 2; row++) {
			for (int column = 0; column < 2; column++) {
				System.out.print(inverseMatrix[row][column] + " ");
			}
			System.out.print("\n");
		}
	}

	public static double[][] inverse(double[][] A) {
        double[][] inverseMatrix = new double[2][2];

        double d = A[0][0] * A[1][1] - A[0][1] * A[1][0];
        if (d == 0)
        	return null;
        else {
        	inverseMatrix[0][0] = A[1][1] / d;
        	inverseMatrix[0][1] = -1 * A[0][1] / d;
        	inverseMatrix[1][0] = -1 * A[1][0] / d;
        	inverseMatrix[1][1] = A[0][0] / d;
        }
        return inverseMatrix;
	}
}