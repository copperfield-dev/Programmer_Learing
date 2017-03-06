import java.math.*;

public class TestRationalClass {
	public static void main(String[] args) {
		Rational r1 = new Rational(new BigInteger("4"), new BigInteger("2"));
		Rational r2 = new Rational(new BigInteger("2"), new BigInteger("3"));

		System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
		System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
		System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
		System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
		System.out.println(r2 + " is " + r2.doubleValue());
	}
}