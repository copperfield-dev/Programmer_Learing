public class PiCal {
	public static void main(String[] args) {
		double result = 1.0;
		int sign = -1;
		for (int i = 1; i < 7; i++) {
			result = result + sign * (1.0 / (2 * i + 1));
			sign = sign * (-1);
		}
		System.out.print(4.0 * result);
	}
}