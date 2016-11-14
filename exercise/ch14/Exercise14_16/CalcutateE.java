import java.math.*;

public class CalcutateE {
	public static void main(String[] args) {
		BigDecimal e = new BigDecimal(1);
        BigDecimal item = new BigDecimal(1.0);
		for (int i = 1; i <= 1000; i++) {
            item = item.divide(new BigDecimal(i + ""), 25, BigDecimal.ROUND_UP);
            e = e.add(item);

			if (i % 100 == 0)
			    System.out.println(e);
		}
	}
}