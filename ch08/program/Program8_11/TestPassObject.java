public class TestPassObject {
	public static void main(String[] args) {
		Circle3 myCircle = new Circle3(1);

		int n = 5;
		printArea(myCircle, n);

		System.out.println("\n" + "Radius is " + myCircle.getRadius());
		System.out.println("n is " + n);
	}

	public static void printArea(Circle3 c, int times) {
		System.out.println("Radius \t\tArea");
		while (times >= 1) {
			System.out.println(c.getRadius() + "\t\t" + c.getRadius());
			c.setRadius(c.getRadius() + 1);
			times--;
		}
	}
}