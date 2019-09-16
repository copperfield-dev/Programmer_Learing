import java.math.*;

public class TenNumbers {
    public static void main(String[] args) {
    	BigInteger a = new BigInteger(Long.MAX_VALUE + "");

    	a.add(BigInteger.ONE);

    	int count = 0;
    	while (count < 10) {
    		if (a.remainder(new BigInteger("5")).equals(BigInteger.ZERO) ||
    			a.remainder(new BigInteger("6")).equals(BigInteger.ZERO)) {
    			System.out.println(a);
    		    count++;
    		}

    		a = a.add(BigInteger.ONE);
    	}

    	System.out.println();

    	BigInteger b = new BigInteger(Long.MAX_VALUE + "");
    	BigInteger i = BigInteger.ONE;
    	for (;
    		i.multiply(i).compareTo(b) < 0;
    		i = i.add(BigInteger.ONE));

    	for (int j = 0; j < 10; j++) {
    		System.out.println(i.multiply(i));
    		i = i.add(BigInteger.ONE);
    	}
    }
}