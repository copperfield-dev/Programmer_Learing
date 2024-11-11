public class TestRegularPolygon {
	public static void main(String[] args) {
	    RegularPolygon graph1 = new RegularPolygon();
	    System.out.println("Perimeter: " + graph1.getPerimeter());
	    System.out.println("Area: " + graph1.getArea());

	    RegularPolygon graph2 = new RegularPolygon(6, 4);
	    System.out.println("Perimeter: " + graph2.getPerimeter());
	    System.out.println("Area: " + graph2.getArea());

	    RegularPolygon graph3 = new RegularPolygon(10, 4, 5.6, 7.8);
	    System.out.println("Perimeter: " + graph3.getPerimeter());
	    System.out.println("Area: " + graph3.getArea());
	}
}