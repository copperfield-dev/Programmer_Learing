import java.util.Scanner;

public class Luhn_algorithm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Plesse enter your Card Number: ");
		String number = input.nextLine();
		System.out.print("Your card is ");
		if (prefixMatched(number))
			System.out.print((isValid(number)? "valid" : "invalid"));
		else     
			System.out.print("invalid");
	}

	public static boolean isValid(String cardNumber) {
        int sumOfDoubleEvenPlace = sumOfDoubleEvenPlace(cardNumber);
        int sumOfOddPlace = sumOfOddPlace(cardNumber);
        int sumOfTotalPlace = sumOfOddPlace + sumOfDoubleEvenPlace;
        if (sumOfTotalPlace % 10 == 0) 
        	return true;
        else 
        	return false;
	}

	public static int sumOfDoubleEvenPlace(String cardNumber) {
        int sumOfDoubleEvenPlace = 0;
        int digit = 0;
        
        for (int i = cardNumber.length() - 2; i >= 0; i = i - 2) {
            digit = getDigit(cardNumber.charAt(i));
            if (digit * 2 < 10)
                sumOfDoubleEvenPlace += digit * 2;
            else {
                int temp1 = (digit * 2) % 10;
                int temp2 = (digit * 2) / 10;
                digit = temp1 + temp2;
                sumOfDoubleEvenPlace += digit;
            }
        }

        return sumOfDoubleEvenPlace;
	}

	public static int sumOfOddPlace(String cardNumber) {
        int sumOfOddPlace = 0;
        int digit = 0;
        
        for (int i = cardNumber.length() - 1; i >= 0; i = i - 2) {
            digit = getDigit(cardNumber.charAt(i));
            sumOfOddPlace += digit;
        }
            
        return sumOfOddPlace;
	}

	public static boolean prefixMatched(String cardNumber) {
        if (cardNumber.charAt(0) >= '4' && cardNumber.charAt(0) <= '6') 
        	return true;
        else if (cardNumber.substring(0, 2) == "37")
            return true;
        else return false;
	}

    public static int getDigit(char ch) {
        return ch - '0';
    }
}