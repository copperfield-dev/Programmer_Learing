public class FindLargestNumber {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");
        int row = input.nextInt();
        int column = input.nextInt();

        System.out.print("Enter the array: \n");
        double[][] array = new double[row][column];
        for (int i = 0; i < row; i++) {
        	for (int j = 0; j < column; j++) {
        		array[i][j] = input.nextDouble();
        	}
        }
        int[] maxIndex = locateLargest(array);
        System.out.print("The location of the largest element is at (" 
        	+ maxIndex[0] + ", " + maxIndex[1] + ")");
	}

	public static int[] locateLargest(double[][] a) {
        double max = 0;
        int [] index = new int[2];
        for (int i = 0; i < a.length; i++) {
        	for (int j = 0; j < a[i].length; j++) {
        		if (a[i][j] > max) {
        			max = a[i][j];
        			index[0] = i;
        			index[1] = j;
        		}
        	}
        }
        return index;
	}
}