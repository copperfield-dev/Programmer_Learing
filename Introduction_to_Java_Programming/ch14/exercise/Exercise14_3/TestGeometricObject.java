public class TestGeometricObject {
	public static void main(String[] args) {
		GeometricObject[] objects = new GeometricObject[5];
		
		objects[0] = new Square(3.2);
		if (objects[0] instanceof Colorable) 
			((Colorable)objects[0]).howToColor();
		displayGeometricObject(objects[0]);
        
        objects[1] = new Circle(3.2);
		if (objects[1] instanceof Colorable) 
			((Colorable)objects[1]).howToColor();
		displayGeometricObject(objects[1]);
		
		objects[2] = new Square(4.7);
		if (objects[2] instanceof Colorable) 
			((Colorable)objects[2]).howToColor();
		displayGeometricObject(objects[2]);
		
		objects[3] = new Rectangle(3, 2);
		if (objects[3] instanceof Colorable) 
			((Colorable)objects[3]).howToColor();
		displayGeometricObject(objects[3]);

		objects[4] = new Circle(2);
		if (objects[4] instanceof Colorable) 
			((Colorable)objects[4]).howToColor();
		displayGeometricObject(objects[4]);
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