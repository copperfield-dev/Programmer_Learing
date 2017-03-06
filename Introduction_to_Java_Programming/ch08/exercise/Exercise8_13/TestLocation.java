public class TestLocation {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter the nueber of rows and columns of the array: ");
		int row = input.nextInt();
		int column = input.nextInt();

		
		double[][] array = new double[row][column];
        System.out.println("Enter the array: ");
        for (int i = 0; i < row; i++) {
        	for (int j = 0; j < column; j++) {
        		array[i][j] = input.nextDouble();
        	}
        }

        Location example = locateLargest(array);
        System.out.print("The location of the largest element is " +
        	example.maxValue + " at (" + example.row +
        	", " + example.column + ")");
	}
	public static Location locateLargest(double[][] a) {
	    Location example = new Location();

	    for (int i = 0; i < a.length; i++) {
		    for (int j = 0; j < a[0].length; j++) {
			    if (a[i][j] > example.maxValue) {
					example.maxValue = a[i][j];
					example.row = i;
					example.column = j;
				}
			}
		}

    	return example;
	}
}

class Location {
	public int row;
	public int column;
	public double maxValue = 0;
}