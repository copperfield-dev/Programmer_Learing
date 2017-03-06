import java.util.Scanner;

public class ATMMachine {
	public static void main(String[] args) {
		Account[] account = new Account[10];

		for (int i = 0; i < account.length; i++) {
			account[i] = new Account(i, 100);
		}

		Scanner input = new Scanner(System.in);

        while (true) {
        	System.out.print("Enter an id: ");
        	int newid = input.nextInt();
        	System.out.println();
        	int i = 0;
        	for (; i < account.length; i++) {
        		if (account[i].getId() == newid)
        			break;
        	}
        	if (i == account.length + 1)
        		continue;

            int choice = 0;
            while (choice != 4) {
            	System.out.println("Main menu");
        		System.out.println("1: check balance");
        		System.out.println("2: withdraw");
        		System.out.println("3: deposit");
        		System.out.println("4: exit");
        		System.out.print("Enter a choice: ");
        	    choice = input.nextInt();

                double money;
        	    switch (choice) {
        		    case 1: System.out.println("The balance is " + 
        		    			account[newid].getBalance());
        		    	    break;
        		    case 2: System.out.print("Enter an amount to withdraw: ");
 						    money = input.nextDouble();
 						    account[newid].withdraw(money);
 						    break;
 				    case 3: System.out.println("Enter an amount to deposit: ");
 				            money = input.nextDouble();
 				            account[newid].deposit(money);
 				            break;
 				    case 4: break;
 				    default: break;
        	    }
        	    System.out.println();
            }
        }	
	}
}