public class Circle extends GeometricObject 
    implements Comparable {
	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

    public double getDiameter() {
    	return 2 * radius;
    }

	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	public void printCilcle() {
		System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	}

    public int compareTo(Object o) {
		if (getArea() > ((Circle)o).getArea())
            return 1;
        else if (getArea() < ((Circle)o).getArea())
            return -1;
        else
            return 0;
	}


	public boolean equals(Object o) {
        return this.radius == ((Circle)o).radius;
	}
}