public class CircleWithException1 {
	private double radius;

	private static int numberOfObjects = 0;

	public CircleWithException1() {
		this(1.0);
	}

	public CircleWithException1(double newRadius) {
		try {
			setRadius(newRadius);
		    numberOfObjects++;
		}
		catch (InvalidRadiusException ex) {
			ex.printStackTrace();
		}
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) 
	            throws InvalidRadiusException {
		if (newRadius >= 0)
			radius = newRadius;
		else 
			throw new InvalidRadiusException(newRadius);
	}

    public static int getNumberOfObjects() {
    	return numberOfObjects;
    }

	public double finaArea() {
		return radius * radius * Math.PI;
	}
}