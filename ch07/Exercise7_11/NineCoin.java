public class NineCoin {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter a number between 0 and 511: ");
		int number = input.nextInt();

		int[][] nineCoin = new int[3][3];
		int[] binaryNumber = new int[9];
		for (int i = 0; i < 9; i++) {
			binaryNumber[i] = 2;
		}
		int count = 0;
    
		while(number != 0) {
            binaryNumber[count] = number % 2;
            count++;
            number = number / 2;
		}

        int k = 8;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (binaryNumber[k] < 2) 
					nineCoin[i][j] = binaryNumber[k];
				else
					nineCoin[i][j] = 0;
				k--;
			}
		}

        char[][] charNineCoin = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (nineCoin[i][j] == 1)
					charNineCoin[i][j] = 'T';
				else if (nineCoin[i][j] == 0)
					charNineCoin[i][j] = 'H';
				System.out.print(charNineCoin[i][j] + " ");
			}
			System.out.print("\n");
	    }
    }	
}