public class Calculator {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println(
				"Usage: java Calculator operand1 and operand2");
			System.exit(0);
		}

        long numerator1;
	    long denominator1;
	    long numerator2;
	    long denominator2;
	    String[] tokens1 = args[0].split("[/]");
	    String[] tokens2 = args[2].split("[/]");
	    numerator1 = Long.parseLong(tokens1[0]);
	    denominator1 = Long.parseLong(tokens1[1]);
	    numerator2 = Long.parseLong(tokens2[0]);
	    denominator2 = Long.parseLong(tokens2[1]);

	    Rational number1 = new Rational(numerator1, denominator1);
	    Rational number2 = new Rational(numerator2, denominator2);
 		Rational result = new Rational();

		switch (args[1].charAt(0)) {
			case '+': result = number1.add(number2);
			          break;
            case '-': result = number1.subtract(number2);
			          break;
            case 'x': result = number1.multiply(number2);
			          break;
			case '/': result = number1.divide(number2);
		}
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
			               + " = " + result);
	}
}