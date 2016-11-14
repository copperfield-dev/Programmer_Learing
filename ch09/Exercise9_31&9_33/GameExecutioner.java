import java.util.Scanner;
import java.io.*;

public class GameExecutioner {
	public static void main(String[] args) throws Exception {
		if (args.length != 1) 
			System.exit(0);

		File file = new File(args[0]);
		Scanner fileInput = new Scanner(file);
		char tryAgain = 'n';

        do {
        	String guessWord = fileInput.nextLine();
            Scanner charInput = new Scanner(System.in);
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < guessWord.length(); i++) {
        	    temp.append('*');
            }
        	int missedTimes = 0;

        	while(true) {
				System.out.print("(Guess) Enter a letter in word " + temp + " > ");
				char guessChar = charInput.next().charAt(0);
				boolean isGuess = false;
				for (int i = 0; i < guessWord.length(); i++) {
					if (guessChar == temp.toString().charAt(i)) {
						System.out.println(guessChar + " is already in the word");
						isGuess = true;
						break;
					}
					if (guessChar == guessWord.charAt(i)) {
						temp.setCharAt(i, guessChar);
						isGuess = true;
					}
				}

				if (!isGuess) {
					System.out.println(guessChar + " is not in the world");
					missedTimes++;
				}

				if (guessWord.equals(temp.toString()))
					break;
			}

			System.out.println("The word is " + guessWord + 
				". You missed " + missedTimes + ((missedTimes == 1)?" time\n":" times\n"));
        	System.out.print("Do you want to guess for another word? Enter y or n>");
        	tryAgain = charInput.next().charAt(0);
        } while (tryAgain == 'y');
	}
}