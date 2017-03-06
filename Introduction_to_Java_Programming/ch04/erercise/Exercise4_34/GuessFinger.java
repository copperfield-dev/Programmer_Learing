import java.util.Scanner;

public class GuessFinger {
    public static void main(String[] args) {
	    int playerwin = 0;
	    int computerwin = 0;

	    do {
	    	int computer = (int)(Math.random() * 100) % 3;

		    System.out.print(
		       "scissor (0), rock (1), paper (2): ");
			Scanner input = new Scanner(System.in);
			int answer = input.nextInt();
		
			switch (computer) {
				case 0: System.out.print("The computer is scissor.");
			     	    if (answer == 0)
			        		System.out.print("You are scissor too. It is a draw");
			        	else if (answer == 1) {
			        		System.out.print("You are rock. You won");
			        		playerwin++;
			        		if (computerwin > 0) computerwin--;
			        	}	
			        	else {
			        		System.out.print("You are paper. You lost");
			        		computerwin++;
			        		if (playerwin > 0) playerwin--;
			        	}			        		
			        	break;
				case 1: System.out.print("The computer is rock.");
			        	if (answer == 1)
			        		System.out.print("You are rock too. It is a draw");
			        	else if (answer == 2) {
			        		System.out.print("You are paper. You won");
			        		playerwin++;
			        		if (computerwin > 0) computerwin--;
			        	}
			    	    else {
			    	    	System.out.print("You are scissor. You lost");
			    	    	computerwin++;
			        		if (playerwin > 0) playerwin--;
			    	    }			        		
			        	break;
				case 2: System.out.print("The computer is paper.");
			       		if (answer == 2)
			        		System.out.print("You are paper too. It is a draw");
			        	else if (answer == 0) {
                            System.out.print("You are scissor. You won");
                            playerwin++;
			        		if (computerwin > 0) computerwin--;
			        	}			        		
			        	else {
			        		System.out.print("You are rock. You lost");
			        		computerwin++;
			        		if (playerwin > 0) playerwin--;
			        	}			        		
			       		break;
		    } 
		    System.out.print("\n");
	    } while(playerwin < 2 && computerwin < 2);
	}
}	