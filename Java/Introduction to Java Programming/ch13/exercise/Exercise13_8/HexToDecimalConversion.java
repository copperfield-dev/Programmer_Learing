import java.util.Scanner;

public class HexToDecimalConversion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();

        try {
        	System.out.println("The decimal value for hex number "
			               		+ hex + " is " + hexToDecimal(hex.toUpperCase()));
        }
		catch (HexFormatException e) {
			System.out.println(e);
		}
	}

	public static int hexToDecimal(String hex) 
	    throws HexFormatException {
			int decimalValue = 0;
			for (int i = 0; i < hex.length(); i++) {
				char hexChar = hex.charAt(i);
				decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
			}

			return decimalValue;
	}

	public static int hexCharToDecimal(char ch) 
	    throws HexFormatException {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else if (ch >= '0' && ch <= '9')
			return ch - '0';
		else 
			throw new HexFormatException("Wrong input");
	}
}

class HexFormatException extends Exception {
	public HexFormatException() {
		super("Illegal hex character");
	}

	public HexFormatException(String message) {
		super(message);
	}
}