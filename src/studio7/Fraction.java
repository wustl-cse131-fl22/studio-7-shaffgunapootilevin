package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) { //constructor
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public double Adding(int num1, int den1) {
		return (double) (numerator/denominator)+(double)(num1/den1);
	}
	
	public double Multiply(int num1, int den1) {
		return (double) (numerator/denominator)*(double)(num1/den1);
	}
	
	public double Reciprocal() {
		return (double) (denominator/numerator);
	}
	
	public double GCF() {
		int a = numerator;
		int b = denominator;
		int temp =0;
		while(b != 0) {
			temp = b;
			b = a%b;
			a = temp;
		}
		return (numerator/a)/(denominator/a);
	}
}
