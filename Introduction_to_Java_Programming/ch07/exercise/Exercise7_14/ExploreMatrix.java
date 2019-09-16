public class ExploreMatrix {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter the size for the matrix: ");
		int size = input.nextInt();

		int[][] array = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				array[i][j] = (int)(Math.random() * 10) % 2;
				System.out.print(array[i][j]);
			}
			System.out.println(); 
		}

        boolean flag = false;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (array[i][j] != 0)
					break;
				else if (array[i][j] == 0 && j == size - 1) {
					System.out.println("All 0s on row " + i);
					flag = true;
				}
			}

			for (int j = 0; j < size; j++) {
				if (array[i][j] != 1)
					break;
				else if (array[i][j] == 1 && j == size - 1) {
					System.out.println("All 1s on row " + i);
					flag = true;
				}
			}
		}
		if (flag == false)
			System.out.print("No same numbers on a row\n");

		flag = false;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (array[j][i] != 0)
					break;
				else if (array[j][i] == 0 && j == size - 1) {
					System.out.println("All 0s on column " + i);
					flag = true;
				}
			}

			for (int j = 0; j < size; j++) {
				if (array[j][i] != 1)
					break;
				else if (array[j][i] == 1 && j == size - 1) {
					System.out.println("All 1s on column " + i);
					flag = true;
				}
			}
		}
		if (flag == false)
			System.out.print("No same numbers on a column\n");
	
	    flag = false;
	    for (int i = 0; i < size; i++) {
			if (array[i][i] != 0)
				break;
			else if (array[i][i] == 0 && i == size - 1) {
				System.out.println("All 0s on the major diagonal");
				flag = true;
			}
        }
		for (int i = 0; i < size; i++) {
			if (array[i][i] != 1)
				break;
			else if (array[i][i] == 1 && i == size - 1) {
			    System.out.println("All 1s on the major diagonal");
				flag = true;
			}
		}
		if (flag == false)
			System.out.print("No same numbers on the major diagonal\n");

        flag = false;
	    for (int i = 0; i < size; i++) {
			if (array[i][size - 1 - i] != 0)
				break;
			else if (array[i][size - 1 - i] == 0 && i == size - 1) {
				System.out.println("All 0s on the sub-diagonal");
				flag = true;
			}
        }
		for (int i = 0; i < size; i++) {
			if (array[i][size - 1 - i] != 1)
				break;
			else if (array[i][size - 1 - i] == 1 && i == size - 1) {
			    System.out.println("All 1s on the sub-diagonal");
				flag = true;
			}
		}
		if (flag == false)
			System.out.print("No same numbers on the sub-diagonal\n");
	}
}