public class CheckSSN {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter a string for SSN: ");
		String s = input.nextLine();

		if (isValidSSN(s))
			System.out.print("Valid SSN");
		else
			System.out.print("Invalid SSN");
	}

	public static boolean isValidSSN(String ssn) {
		return ssn.length() == 11 &&
		    Character.isDigit(ssn.charAt(0)) &&
		    Character.isDigit(ssn.charAt(1)) &&
		    Character.isDigit(ssn.charAt(2)) &&
		    ssn.charAt(3) == '-' &&
		    Character.isDigit(ssn.charAt(4)) &&
		    Character.isDigit(ssn.charAt(5)) &&
		    ssn.charAt(6) == '-' &&
		    Character.isDigit(ssn.charAt(7)) &&
		    Character.isDigit(ssn.charAt(8)) &&
		    Character.isDigit(ssn.charAt(9)) &&
		    Character.isDigit(ssn.charAt(10));
	}
}