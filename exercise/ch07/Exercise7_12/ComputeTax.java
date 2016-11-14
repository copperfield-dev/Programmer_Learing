import java.util.Scanner;

public class ComputeTax { 
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
		System.out.print("0-single filer,\n" + 
		                 "1-married jointly,\n" +
						 "2-married separately,\n" +
						 "3-head of household\n" +
						 "Enter the filing status: ");
		int status = input.nextInt();
		
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();
		
		double tax = 0;
		double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
		int[][] brackets = {
				  {8350, 33950, 82250, 171550, 372950},   // Single filer
				  {16700, 67900, 137050, 20885, 372950}, // Married jointly
				  {8350, 33950, 68525, 104425, 186475}, // Married separately
				  {11950, 45500, 117450, 190200, 372950} // Head of household
				};

        if (income <= brackets[status][0])
			tax = income * rates[0]; // Done
		else {
			tax = brackets[status][0] * rates[0];
			for (int i = 1; i < brackets[status].length; i++) {
		        if (income > brackets[status][i]) 
		        	tax += (brackets[status][i] - brackets[status][i - 1]) * rates[i];
		    	else {
		    		tax += (income - brackets[status][i - 1]) * rates[i];
		            break;
		    	}
			}		
		}

		if (income > brackets[status][3])
			tax += (income - brackets[status][3]) * rates[5];

		System.out.println("Tax is " + (int)(tax * 100) / 100.0);
	}
}
