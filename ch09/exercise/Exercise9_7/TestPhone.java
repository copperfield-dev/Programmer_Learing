public class TestPhone {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i)))
				System.out.print(s.charAt(i));
			else if (s.charAt(i) == '-')
				System.out.print(s.charAt(i));
            else if (Character.isLetter(s.charAt(i)))
            	System.out.print(getNumber(s.charAt(i)));
		}
	}

	public static int getNumber(char letter) {
        char uppercaseLetter = Character.toUpperCase(letter);
        if (uppercaseLetter == 'A' ||
        	uppercaseLetter == 'B' ||
        	uppercaseLetter == 'C')
        	return 2;
        if (uppercaseLetter == 'D' ||
        	uppercaseLetter == 'E' ||
        	uppercaseLetter == 'F')
        	return 3;
        if (uppercaseLetter == 'G' ||
        	uppercaseLetter == 'H' ||
        	uppercaseLetter == 'I')
        	return 4;
        if (uppercaseLetter == 'J' ||
        	uppercaseLetter == 'K' ||
        	uppercaseLetter == 'L')
        	return 5;
        if (uppercaseLetter == 'M' ||
        	uppercaseLetter == 'N' ||
        	uppercaseLetter == 'O')
        	return 6;
        if (uppercaseLetter == 'P' ||
        	uppercaseLetter == 'Q' ||
        	uppercaseLetter == 'R' ||
        	uppercaseLetter == 'S') 
        	return 7;
        if (uppercaseLetter == 'T' ||
        	uppercaseLetter == 'U' ||
        	uppercaseLetter == 'V')
        	return 8;
        if (uppercaseLetter == 'W' ||
        	uppercaseLetter == 'X' ||
        	uppercaseLetter == 'Y' ||
        	uppercaseLetter == 'Z')
        	return 9;
        return 0;
	}
}