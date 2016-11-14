public class TestGeometricObject {
	public static void main(String[] args) {
		GeometricObject geoObject1 = new Circle(5);
		GeometricObject geoObject2 = new Circle(7);
		GeometricObject geoObject3 = new Rectangle(5, 3);
		GeometricObject geoObject4 = new Rectangle(6, 2);

		Circle circle = (Circle)GeometricObject.max(geoObject1, geoObject2);
        System.out.println("The max circle's radius is " +
            circle.getRadius());
        System.out.println(circle);

        Rectangle rectangle = (Rectangle)GeometricObject.max(geoObject3, geoObject4);
        System.out.println("The max rectangle's area is " +
            rectangle.getArea());
        System.out.println(rectangle);
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