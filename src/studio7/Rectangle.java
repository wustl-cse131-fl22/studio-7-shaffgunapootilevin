package studio7;

public class Rectangle {
	private double length; //instance variables
	private double width;//instance variables
	
	/**
	 * Giving rectangle
	 * @param length: length of rectangle
	 * @param width: width of rectangle
	 */
	public Rectangle(double length, double width) { // constructor
		this.length = length; //first one is the private and second is in ()
		this.width = width;
	}
	
	/**
	 * Computes area of rectangle
	 * @param length: length of rectangle
	 * @param width: width of rectangle
	 * @return
	 */
	public double area() {
		return length*width;
	}
	
	/**
	 * Computes area of perimeter
	 * @param length: length of rectangle
	 * @param width: width of rectangle
	 * @return
	 */
	public double perimeter () {
		return (length*2)+(width*2);
	}
	
	/**
	 * Sees if the rectangle is a square
	 * @return
	 */
	public boolean isSquare(String[] args) {
		if (length == width) { //we can use length and width because they are private
			return true;
		}
		return false;
	}
	
	
	public static void main() {//returning something/testing other methods
		Rectangle r = new Rectangle (4.98, 69.2);
		System.out.print(r.area());
	}
}
