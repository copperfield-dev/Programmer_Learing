import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");
		double[] eqn = new double[3];
		for (int i = 0; i < 3; i++) {
			eqn[i] = input.nextDouble();
		}

		double[] roots = new double[2];

		int numberOfRoots = solveQuadratic(eqn, roots);    

		if (numberOfRoots == 2) {
			System.out.print("There are " + numberOfRoots + " roots\n");
			System.out.print("The roots are " + roots[0] 
		    	+ " and " + roots[1]); 
		}
			
		else if (numberOfRoots == 1) {
			System.out.print("There is " + numberOfRoots + " root\n");
			System.out.print("The root is " + roots[0]);
		}
			
		else 
			System.out.print("The equation has no real roots");
	}

	public static int solveQuadratic(double[] eqn, double[] roots) {
        double delta = eqn[1] * eqn[1] - 4 * eqn[0] * eqn[2];
        int numberOfRoots;
        if (delta > 0) {
        	numberOfRoots = 2;
        	roots[0] = (-eqn[1] + Math.pow(delta, 0.5)) / (2 * eqn[0]);
		    roots[1] = (-eqn[1] - Math.pow(delta, 0.5)) / (2 * eqn[0]); 
        }
        	
		else if (delta == 0) {
			numberOfRoots = 1;
			roots[0] = (-eqn[1] + Math.pow(delta, 0.5)) / (2 * eqn[0]);
			roots[1] = (-eqn[1] + Math.pow(delta, 0.5)) / (2 * eqn[0]);
		}
		
		else 
			numberOfRoots = 0;

	    return numberOfRoots;
	}
}