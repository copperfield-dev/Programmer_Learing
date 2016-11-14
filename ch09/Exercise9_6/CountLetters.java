public class CountLetters {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        int counts = countLetters(s);
        System.out.print(counts);
	}

	public static int countLetters(String s) {
		int counts = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i)))
				counts++;
		}
		return counts;
	}
}
