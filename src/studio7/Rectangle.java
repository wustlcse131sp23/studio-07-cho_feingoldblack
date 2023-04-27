package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double x, double y) {
		length = x;
		width = y;
	}
	public double area() {
		return this.length*this.width;
	}
	public double perimeter() {
		return 2*(this.length+this.width);
	}
	//q.isSmaller(s)
	public boolean isSmaller(Rectangle s) {
		if (this.area()>=s.area()) {
			return false;
		}
		else {
			return true;
		}
	}
	public boolean isSquare() {
		if (this.width == this.length) {
			return true;
		}
	return false;
	}
	public void drawMe() {
		StdDraw.rectangle(length, width, 0.5, 0.5);
	}
	public static void main(String[] args) {
		Rectangle bob = new Rectangle(.2,.2);
		Rectangle sam = new Rectangle(.2,.2);
		
		System.out.println(bob.area());
		System.out.println(bob.perimeter());
		System.out.println(bob.isSmaller(sam));
		System.out.println(bob.isSquare());
		bob.drawMe();
		

	}

}
