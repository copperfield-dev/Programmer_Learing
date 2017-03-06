public class PolymorphismDemo {
	public static void main(String[] args) {
		displayObject(new Circle4(1, "red", false));
		displayObject(new Rectangle1(1, 1, "balck", true));
	}

public static void displayObject(GeometricObject1 object) {
	System.out.println("Created on " + object.getDateCreated() + 
		               ". Color is " + object.getColor());
    }
}