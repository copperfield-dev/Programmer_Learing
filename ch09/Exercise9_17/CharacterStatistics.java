import java.io.*;
import java.util.*;
 
public class CharacterStatistics {
	public static void main(String[] args) throws Exception{
		if (args.length != 1) 
			System.exit(0);

		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.print("Source file " + args[0] + "does not exist");
			System.exit(0);
		}

		int numberOfCharacters = 0;
		int numberOfWords = 0;
		int numberOfLines = 0;
        Scanner input = new Scanner(sourceFile);

		while (input.hasNext()) {
			String s = input.nextLine();
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != '\r' && s.charAt(i) != '\n')
					numberOfCharacters++;
			}
			numberOfWords += countWords(s);
			numberOfLines++;
		}

		System.out.println("File " + args[0] + " has");
		System.out.println(numberOfCharacters + " characters");
		System.out.println(numberOfWords + " words");
		System.out.println(numberOfLines + " lines");
	}

	private static int countWords(String s) {
    	Scanner input = new Scanner(s);
    	int count = 0;

    	while (input.hasNext()) {
      	input.next(); count++;
    	}

    	return count;
  	}
}