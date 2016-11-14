public class TestOctagon {
    public static void main(String[] args) {
        Octagon a1 = new Octagon(5);
        System.out.println("Area is " + a1.getArea());
        System.out.println("Perimeter is " + a1.getPerimeter());

        Object a2 = a1.clone();
        System.out.println("Compare the methods " + a1.compareTo(a2));
    }
}
