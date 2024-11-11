public class TestRationalClass {
	public static void main(String[] args) {
        Rational result = new Rational();

        for (int i = 1; i < 100; i++) {
        	Rational r = new Rational(i, i + 1);
        	result = result.add(r);
        }
        
        System.out.println(result);
        System.out.println(result.doubleValue());		
	}
}