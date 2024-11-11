public class TestTriangle {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(0.5, 0.5, 1);

            triangle.setColor("yellow");
            triangle.setFilled(true);

            System.out.println(triangle);
            System.out.println("The area is " + triangle.getArea());
            System.out.println("The perimeter is "
                + triangle.getPerimeter());
            System.out.println(triangle);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}