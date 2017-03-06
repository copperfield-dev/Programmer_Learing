public class TestCircleWithException {
	public static void main(String[] args) {
		try {
			CircleWithException1 c = new CircleWithException1(4);
			c.setRadius(-5);
		}
		catch (InvalidRadiusException ex) {
			System.out.println("The invalid radius is " + ex.getRadius());
		}
	}
}