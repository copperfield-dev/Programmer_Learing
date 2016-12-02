import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of banks: ");
		int numberOfBank = input.nextInt();

		System.out.print("Enter the limit of money: ");
		double limit = input.nextDouble();

        double[][] borrowers = new double[numberOfBank][numberOfBank];
        double[] balance = new double[numberOfBank];

		for (int i = 0; i < numberOfBank; i++) {
			balance[i] = input.nextDouble();
			int numberOfBorrowBanks = input.nextInt();

			for (int j = 0; j < numberOfBorrowBanks; j++) {
				int idOfBank = input.nextInt();
				double money = input.nextDouble();
				borrowers[i][idOfBank] = money;
			}
		}

		boolean[] isSafe = new boolean[numberOfBank];
		for (int i = 0; i < numberOfBank; i++)
            isSafe[i] = true;
		boolean newUnsafeFound = true;
		double[] totalAssets = new double[numberOfBank];
		while (newUnsafeFound) {
			newUnsafeFound = false;
            for (int i = 0; i < numberOfBank; i++) {
			    totalAssets[i] = balance[i];
			    for (int j = 0; j < numberOfBank; j++) {
				    totalAssets[i] += borrowers[i][j];
			    }
			    if (isSafe[i] && totalAssets[i] < limit) {
			    	isSafe[i] = false;
			    	for (int k = 0; k < numberOfBank; k++) {
			    		borrowers[k][i] = 0;
			    	}
			    	newUnsafeFound = true;
			    }
		    }
		}
        System.out.print("Unsafe banks are ");
		for (int i = 0; i < numberOfBank; i++) {
			if (totalAssets[i] < limit) 
				System.out.print(i + " ");
		}
	}
}