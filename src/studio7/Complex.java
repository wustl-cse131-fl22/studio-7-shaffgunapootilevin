package studio7;

public class Complex {
	private double real;
	private double imaginary; 
	
	public Complex(int real, int imaginary) { //constructor
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public double Adding(Complex c) {
		return real+c.real+imaginary+c.imaginary;
	}
	
	public double Multiple(Complex c) {
		return (real+imaginary)*(c.real+c.imaginary);
	}
}


