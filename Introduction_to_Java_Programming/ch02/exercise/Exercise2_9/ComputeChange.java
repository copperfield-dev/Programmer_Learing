import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount: ");
		int amount = input.nextInt();
		
		int remainingAmount = amount;
		
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
		
		System.out.println("Your amount " + amount + " consists of \n" + 
                           "\t" + numberOfOneDollars + " dollars\n" +
                           "\t" + numberOfQuarters + " quarters\n" +
                           "\t" + numberOfDimes + " dimes\n" +
                           "\t" + numberOfNiclels + " nickels\n" +
                           "\t" + numberOfPennies + " pennies\n");						   
	}
}