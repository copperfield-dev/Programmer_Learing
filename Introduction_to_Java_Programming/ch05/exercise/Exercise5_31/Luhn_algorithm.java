import java.util.Scanner;

public class Luhn_algorithm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Plesse enter your Card Number: ");
		long number = input.nextLong();
		System.out.print("Your card is ");
		if (prefixMatched(number))
			System.out.print((isValid(number)? "valid" : "invalid"));
		else     
			System.out.print("invalid");
	}

	public static boolean isValid(long number) {
        long sumOfDoubleEvenPlace = sumOfDoubleEvenPlace(number);
        long sumOfOddPlace = sumOfOddPlace(number);
        long sumOfTotalPlace = sumOfOddPlace + sumOfDoubleEvenPlace;
        if (sumOfTotalPlace % 10 == 0) 
        	return true;
        else 
        	return false;
	}

	public static long sumOfDoubleEvenPlace(long number) {
        long sumOfDoubleEvenPlace = 0;
        long digit = 0;
        number = number / 10;

        do {
            digit = number % 10;
            if (digit * 2 < 10)
                sumOfDoubleEvenPlace += digit * 2;
            else {
            	long temp1 = (digit * 2) % 10;
            	long temp2 = (digit * 2) / 10;
            	digit = temp1 + temp2;
                sumOfDoubleEvenPlace += digit;
            }
            number = number / 100;
        }while(number != 0);

        return sumOfDoubleEvenPlace;
	}

	public static long sumOfOddPlace(long number) {
        long sumOfOddPlace = 0;
        long digit = 0;

        do {
            digit = number % 10;
            sumOfOddPlace += digit;
            number = number / 100;
        }while(number != 0);

        return sumOfOddPlace;
	}

	public static boolean prefixMatched(long number) {
        long digit = getPrefix(number, 1);
        if (digit >= 4 && digit <= 6) 
        	return true;
        else if (digit == 3) {
        	digit = getPrefix(number, 2);
        	if (digit == 37) return true;
        	else return false;
        }
        else return false;
	}

	public static int getSize(long d) {
        int size = 0;
        do {
        	size++;
        	d = d / 10;
        }while(d != 0);

        return size;
	}

	public static long getPrefix(long number, int k) {
        int size = getSize(number);
        if (size <= k) 
        	return number;
        else {
        	for (int i = 0; i <= (size - k - 1); i++) {
        		number = number / 10;
        	}
        	return number;
        }  
	}
}