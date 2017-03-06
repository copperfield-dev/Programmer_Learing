public class TestTriangle2D {
  public static void main(String[] args) {
  	MyPoint n1 = new MyPoint(2, 2);
  	MyPoint n2 = new MyPoint(5.5, 4.9);
  	MyPoint n3 = new MyPoint(9.0, 10.3);
    Triangle2D r1 = new Triangle2D(n1, n2, n3);
    System.out.println("Area is " + r1.getArea());
    System.out.println("Perimeter is " + r1.getPerimeter());
    System.out.println(r1.contains(new MyPoint(3, 3)));
    System.out.println(r1.contains(new Triangle2D(new MyPoint(4, 5), 
    	new MyPoint(10.5, 3.2), new MyPoint(-0.5, -10.5))));
    System.out.println(r1.overlaps(new Triangle2D(new MyPoint(3, 5),
        new MyPoint(2.3, 6.7), new MyPoint(5.5, 8.8))));
  }
}
