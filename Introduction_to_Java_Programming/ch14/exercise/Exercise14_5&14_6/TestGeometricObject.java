public class TestGeometricObject {
	public static void main(String[] args) {
		Circle geoObject1 = new Circle(5);
		Circle geoObject2 = new Circle(5);

		System.out.println(geoObject1.equals(geoObject2));
        System.out.println(geoObject1.compareTo(geoObject2));

        Rectangle geoObject3 = new Rectangle(5, 3);
		Rectangle geoObject4 = new Rectangle(5, 4);

		System.out.println(geoObject3.equals(geoObject4));
        System.out.println(geoObject3.compareTo(geoObject4));

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