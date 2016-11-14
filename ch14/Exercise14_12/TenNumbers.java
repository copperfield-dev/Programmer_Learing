import java.math.*;

public class TenNumbers {
	public static void main(String[] args) {
		BigInteger a = new BigInteger(Long.MAX_VALUE + "");

		a.add(BigInteger.ONE);

		int count = 0;
		while (count < 10) {
			if (a.remainder(new BigInteger("2")).equals(BigInteger.ZERO) ||
				a.remainder(new BigInteger("3")).equals(BigInteger.ZERO)) {
				System.out.println(a);
			    count++;
			}
		
            a = a.add(BigInteger.ONE);
		}

		System.out.println();

        long startTime = System.currentTimeMillis();
		BigInteger b = new BigInteger(Long.MAX_VALUE + "");
		b.add(BigInteger.ONE);

        count = 0;
		while (count < 5) {
			if (isPrime(b)) {
				System.out.println(b);
				count++;
			}

			b = b.add(BigInteger.ONE);
		}

		long endTime = System.currentTimeMillis();
		System.out.println("Time spent is " +
			(endTime - startTime) + " milliseconds");
	}

	public static boolean isPrime(BigInteger num) {
		if (num.compareTo(BigInteger.ONE) == 0 ||
			num.compareTo(new BigInteger("2")) == 0) {
			return true;
		}

		BigInteger halfNum = num.divide(new BigInteger("2"));

		for (BigInteger divisor = new BigInteger("2");
		     divisor.compareTo(halfNum) <= 0; 
		     divisor = divisor.add(BigInteger.ONE)) {
			if (num.remainder(divisor).equals(BigInteger.ZERO)) {
				return false;
			}
		}

		return true;
	}
}