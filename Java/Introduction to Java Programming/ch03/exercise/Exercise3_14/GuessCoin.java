import java.util.Scanner;

public class GuessCoin {
    public static void main(String[] args) {
	    int coin = (int)(Math.random() * 100) % 2;

		System.out.print(
		   "What is the coin:? ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		if (coin == answer)
		    System.out.println("You are correct!");
		else 
		    System.out.println("Your answer is wrong\n");
	}
}	