public class TestGeometricObject {
	public static void main(String[] args) {
		GeometricObject[] objects = {new Circle(3.2), new Rectangle(3, 2),
		                             new Circle(2), new Rectangle(5, 8)};
		
		System.out.println("The sum of area are: " + GeometricObject.sumArea(objects));
	}

	public static boolean equalArea(GeometricObject object1,
		GeometricObject object2) {
		return object1.getArea() == object2.getArea();
	}

	public static void displayGeometricObject(GeometricObject object) {
		System.out.println();
		System.out.println("The area is " + object.getArea());
		System.out.println("The perimeter is " + object.getPerimeter());
	}
}