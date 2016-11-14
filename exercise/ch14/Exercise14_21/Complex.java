public class Complex {
	private double real = 0;
	private double imaginary = 0;

	public Complex() {
		this(0, 0);
	}

	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public Complex add(Complex secondComplex) {
		double a = real + secondComplex.getReal();
		double b = real + secondComplex.getImaginary();
		return new Complex(a, b);
	}

	public Complex subtract(Complex secondComplex) {
		double a = real - secondComplex.getReal();
		double b = real - secondComplex.getImaginary();
		return new Complex(a, b);
	}

	public Complex multiply(Complex secondComplex) {
		double a = real * secondComplex.getReal() 
		           - imaginary * secondComplex.getImaginary();
		double b = imaginary * secondComplex.getReal()
		           + real * secondComplex.getImaginary();
		return new Complex(a, b);
	}

	public Complex divide(Complex secondComplex) {
		double a = (real * secondComplex.getReal() 
		           + imaginary * secondComplex.getImaginary()) 
		           / (secondComplex.getReal() * secondComplex.getReal() +
		           	  secondComplex.getImaginary() * secondComplex.getImaginary());
		double b = (imaginary * secondComplex.getReal()
		           - real * secondComplex.getImaginary()) 
		           / (secondComplex.getReal() * secondComplex.getReal() +
		           	  secondComplex.getImaginary() * secondComplex.getImaginary());
	    return new Complex(a, b);
	}

	public double abs() {
		return Math.sqrt(real * real + imaginary * imaginary);
	}

	public String toString() {
		if (imaginary == 0)
			return real + "";
		else
			return real + " + " + imaginary + "i";
	}

	public boolean equals(Object parm1) {
		if ((this.getReal() - ((Complex)parm1).getReal()) == 0 &&
			(this.getImaginary() - ((Complex)parm1).getImaginary()) == 0)
			return true;
		else 
			return false;
	}
}