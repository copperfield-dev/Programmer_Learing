public class Octagon extends GeometricObject 
    implements Comparable, Cloneable {
    protected double side; 

    public Octagon() {

    }

    public Octagon(double side) {
    	this.side = side;
    }

    public double getSide() {
    	return side;
    }

    public double getArea() {
    	return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    public double getPerimeter() {
    	return 8 * side;
    }

    public Object clone() {
    	try {
    		return super.clone();
    	}
    	catch (CloneNotSupportedException e) {
    		return null;
    	}
    }

    public int compareTo(Object o) {
    	if (getArea() > ((Octagon)o).getArea())
    		return 1;
    	else if (getArea() < ((Octagon)o).getArea())
    		return -1;
    	else
    		return 0;
    }
}
