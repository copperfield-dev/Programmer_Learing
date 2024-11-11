import java.util.Scanner;

public class ComputeTrianglePerimeter {
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

        if (can)
            System.out.print("The perimeter of triangle is " + (edge1 + edge2 + edge3));
        else 
            System.out.print("It is not a triangle");
    }	
}