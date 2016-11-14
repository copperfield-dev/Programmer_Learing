public class TestQuadraticEquation {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
		System.out.println("The Result Of Discriminant is: " +
			quadraticEquation.getDiscriminant());
		if (quadraticEquation.getDiscriminant() > 0) {
			System.out.println(quadraticEquation.getRoot1());
			System.out.println(quadraticEquation.getRoot2());
		}
		else if (quadraticEquation.getDiscriminant() == 0) {
			System.out.println(quadraticEquation.getRoot1());
		}
		else 
			System.out.println("The equation has no roots.");
	}
}