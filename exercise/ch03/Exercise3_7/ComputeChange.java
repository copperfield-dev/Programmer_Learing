import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount: ");
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		
	    //Find the number of one dollars 
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		//Find the number of one quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		//Find the number of one dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		//Find the number of one nickels in the remaining amount
		int numberOfNiclels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		//Find the number of one pennies in the remaining amount
		int numberOfPennies = remainingAmount;
		
		System.out.println("Your amount " + amount + " consists of \n");
		if (numberOfOneDollars != 0) 
			if (numberOfOneDollars == 1)
				System.out.print("\t" + numberOfOneDollars + " dollar\n"); 
			else 
				System.out.print("\t" + numberOfOneDollars + " dollars\n");
        if (numberOfQuarters != 0) 
			if (numberOfQuarters == 1)
				System.out.print("\t" + numberOfQuarters + " quarter\n"); 
			else 
				System.out.print("\t" + numberOfQuarters + " quarters\n");
        if (numberOfDimes != 0) 
			if (numberOfDimes == 1)
				System.out.print("\t" + numberOfDimes + " dime\n"); 
			else 
				System.out.print("\t" + numberOfDimes + " dimes\n");
		if (numberOfNiclels != 0) 
			if (numberOfNiclels == 1)
				System.out.print("\t" + numberOfNiclels + " nickel\n"); 
			else 
				System.out.print("\t" + numberOfNiclels + " nickels\n");
        if (numberOfPennies != 0) 
			if (numberOfPennies == 1)
				System.out.print("\t" + numberOfPennies + " pennie\n"); 
			else 
				System.out.print("\t" + numberOfPennies + " pennies\n");					   
	}
}