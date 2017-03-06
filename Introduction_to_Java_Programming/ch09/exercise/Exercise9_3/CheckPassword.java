public class CheckPassword {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter a string for password: ");
		String s = input.nextLine();

		if (isValidPassword(s))
			System.out.print("Valid Password");
		else 
			System.out.print("Invalid Password");
	}

	public static boolean isValidPassword(String psw) {
		int pswLength = psw.length();
		if (pswLength < 8)
			return false;
		int dightsOfPsw = 0;
		for (int i = 0; i < pswLength; i++) {
			if (Character.isLetterOrDigit(psw.charAt(i)) == false)
		        return false;
            else if (Character.isDigit(psw.charAt(i)))
            		dightsOfPsw++;
		}       

		if (dightsOfPsw < 2)
			return false;

		return true;

	}
}