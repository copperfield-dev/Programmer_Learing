public class MonteCarlo {
	public static void main(String[] args) {
		double x, y;
		int flag1;
		int flag2;
        
        double xA = 0;
		double yA = 0;
		double xB = 1.0;
		double yB = 0;
		double xC = 0;
		double yC = 1.0;

		boolean state1, state2, state3;
		double a, b, c;

		int count = 0;
		for (int i = 0; i < 1000000; i++) {
            x = Math.random();
            y = Math.random();
            flag1 = (int)(Math.random() * 10) % 2;
            if (flag1 == 0) flag1 = -1;
            flag2 = (int)(Math.random() * 10) % 2;
            if (flag2 == 0) flag2 = -1;

            x = flag1 * x;
            y = flag2 * y;

            if (x <= 0) count++;
            else {
            	a = y - yA;
		        b = xA - x;
				c = x * yA - xA * y;
				if ((a * xB + b * yB + c) * (a * xC + b * yC + c) > 0)
					state1 = true;
				else state1 = false;

				a = y - yB;
				b = xB - x;
				c = x * yB - xB * y;
				if ((a * xA + b * yA + c) * (a * xC + b * yC + c) > 0)
					state2 = true;
				else state2 = false;
		
				a = y - yC;
				b = xC - x;
				c = x * yC - xC * y;
				if ((a * xA + b * yA + c) * (a * xB + b * yB + c) > 0)
					state3 = true;
				else state3 = false;

		        if (state1 || state2 || state3)
		        	count++;
            }
		}

		System.out.print("The probability is " + (double)count / 1000000);
	}
} 