import java.util.Scanner;

public class TestScaleChange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a binary number: ");
		String binary = input.nextLine();

        try {
        	System.out.println("The decimal value for binary number "
			               		+ binary + " is " + binaryToDecimal(binary));
        }
		catch (BinaryFormatException e) {
			System.out.println(e);
		}
		System.out.println("The decimal value for hex number "
			               + binary + " is " + binaryToHex(binary));
	
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        System.out.println("The decimal value for binary number "
			               + decimal + " is " + decimalToBinary(decimal));

	}

	public static int binaryToDecimal(String binaryString) 
	    throws BinaryFormatException {
        	int decimalValue = 0;
        	for (int i = 0; i < binaryString.length(); i++) {
        		char binaryChar = binaryString.charAt(i); 
        		decimalValue = decimalValue * 2 + binaryCharToDecimal(binaryChar);
        	}
        	return decimalValue;
	}

	public static String binaryToHex(String binaryString) {
        int length = binaryString.length(); 
        int rest = length % 4;
        StringBuffer hexStringtemp = new StringBuffer();
        StringBuffer hexString = new StringBuffer();
        for (int i = 0, j = rest; i < length / 4; i++) {
        	hexStringtemp.append(binaryStringToHexChar(binaryString.substring(j, j + 4)));
        	j += 4;
        }

        if (rest == 3) {
            StringBuffer temp = new StringBuffer();
            temp.append("0");
            temp.append(binaryString.substring(0, rest));
            hexString.append(binaryStringToHexChar(temp.toString()));
            hexString.append(hexStringtemp.toString());
        }
        else if (rest == 2) {
            StringBuffer temp = new StringBuffer();
            temp.append("00");
            temp.append(binaryString.substring(0, rest));
            hexString.append(binaryStringToHexChar(temp.toString()));
            hexString.append(hexStringtemp.toString());
        }
        else if (rest == 1) {
            StringBuffer temp = new StringBuffer();
            temp.append("000");
            temp.append(binaryString.substring(0, rest));
            hexString.append(binaryStringToHexChar(temp.toString()));
            hexString.append(hexStringtemp.toString());
        }
        else
        	hexString.append(hexStringtemp.toString());
        
        return hexString.toString();
	}

	public static String decimalToBinary(int value) {
        StringBuffer binaryString = new StringBuffer();

        while (value != 0) {
        	binaryString.append(decimalToBinaryChar(value % 2));
        	value = value / 2;
        }

        return binaryString.reverse().toString();
	}

	public static int binaryCharToDecimal(char ch) 
	    throws BinaryFormatException {
		    if (ch >= '0' && ch <= '1')
		        return ch - '0';
		    else 
		    	throw new BinaryFormatException("Wrong input");
	}

	public static char decimalToBinaryChar(int digital) {
		if (digital == 1)
		    return '1';
		else 
			return '0';
	}

	public static char binaryStringToHexChar(String binary) {
		if (binary.equals("0000"))
			return '0';
		else if (binary.equals("0001"))
			return '1';
		else if (binary.equals("0010"))
			return '2';
		else if (binary.equals("0011"))
			return '3';
		else if (binary.equals("0100"))
			return '4';
		else if (binary.equals("0101"))
			return '5';
		else if (binary.equals("0110"))
			return '6';
		else if (binary.equals("0111"))
			return '7';
		else if (binary.equals("1000"))
			return '8';
		else if (binary.equals("1001"))
			return '9';
		else if (binary.equals("1010"))
			return 'A';
		else if (binary.equals("1011"))
			return 'B';
		else if (binary.equals("1100"))
			return 'C';
		else if (binary.equals("1101"))
			return 'D';
		else if (binary.equals("1110"))
			return 'E';
		else if (binary.equals("1111"))
			return 'F';
		return 'O';
	}
}

class BinaryFormatException extends Exception {
	public BinaryFormatException() {
		super("Illegal binary character");
	}

	public BinaryFormatException(String message) {
		super(message);
	}
}