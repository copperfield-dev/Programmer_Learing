public class CheckLetters {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.print("Enter the letter: ");
        char letter = input.nextLine().charAt(0);
        int numberOfLetter = count(s, letter);
        System.out.print(numberOfLetter);
	}

	public static int count(String str, char a) {
		int numberOfLetter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a)
				numberOfLetter++;
		}
		return numberOfLetter;
	}
}