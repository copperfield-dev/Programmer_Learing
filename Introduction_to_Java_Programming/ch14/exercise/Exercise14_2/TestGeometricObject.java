public class TestGeometricObject {
	public static void main(String[] args) {
		ComparableCircle geoObject1 = new ComparableCircle(4);
		ComparableCircle geoObject2 = new ComparableCircle(5);

		Circle circle = (Circle)GeometricObject.max(geoObject1, geoObject2);
        System.out.println("The max circle's radius is " +
            circle.getRadius());
        System.out.println(circle);
	}
}