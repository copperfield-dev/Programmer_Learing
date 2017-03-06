public class TestLinearEquation {
	public static void main(String[] args) {
		java.util.Scanner input = new  java.util.Scanner(System.in);

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

		LinearEquation equation = new LinearEquation(a, b, c, d, e, f);
		if (equation.isSolvable()) {
			System.out.println(equation.getX());
			System.out.println(equation.getY());
		}
		else
			System.out.println("The equation has no solution.");
	}
}