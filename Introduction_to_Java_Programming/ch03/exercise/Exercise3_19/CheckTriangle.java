import java.util.Scanner;

public class CheckTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three edges: ");

        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();

        boolean can;

        if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1)
        	can = true;
        else can = false;
        System.out.print("Can edges " + edge1 + ", " + edge2 + ", and " + edge3 +
        	" from a triangle? " + can);
    }	
}