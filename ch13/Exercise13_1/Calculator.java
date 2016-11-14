public class Calculator {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println(
				"Usage: java Calculator operand1 and operand2");
			System.exit(0);
		}

        int num1, num2;
		int result = 0;

		try {
			num1 = Integer.parseInt(args[0]);
		}
		catch (NumberFormatException ex) {
			System.out.println("Wrong input: " + args[0]);
			return; 
		}

		try {
			num2 = Integer.parseInt(args[2]);
		}
		catch (NumberFormatException ex) {
			System.out.println("Wrong input: " + args[2]);
			return;
		}

		switch (args[1].charAt(0)) {
			case '+': result = num1 + num2;
			          break;
            case '-': result = num1 - num2;			                   Integer.parseInt(args[2]);
			          break;
            case 'x': result = num1 * num2;
			          break;
			case '/': result = num1 / num2;
		}
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
			               + " = " + result);
	}
}