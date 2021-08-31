//Q3-Q5
import java.awt.Point;
public class MySquare2D {
	private Point topLeft = new Point(0,0);
	private int sideLength = 10;
	
	public MySquare2D() {
		
	}
	
	//overloaded constructor
	
	//An overloaded constructor that creates a square with the given Point instance.
	public MySquare2D(Point other) {
		this.topLeft.x = other.x;
		this.topLeft.y = other.y;
	}
	
	//An overloaded constructor that creates a square with the given side length.
	public MySquare2D(int sideLength) {
		this.sideLength = sideLength;
	}
	// An overloaded constructor that constructs a square with the given Point instance and side length.
	public MySquare2D(Point other, int sideLength) {
		this.topLeft.x = other.x;
		this.topLeft.y = other.y;
		this.sideLength = sideLength;
	}
	// An overloaded constructor that constructs a square with the given x, y and side length.
	public MySquare2D(int x, int y, int sideLength) {
		this.topLeft.x = x;
		this.topLeft.y = y;
		this.sideLength = sideLength;
	}
	
	public Point getTopLeft() {
		return this.topLeft;
	}
	
	public int getSideLength() {
		return this.sideLength;
	}
	
	public void setTopLeft(Point p) {
		if(p.x >= 0) {
			this.topLeft.x = p.x;
			if (p.y >= 0) {
				this.topLeft.y = p.y;
			}
		}
		
		else {
			if (p.y >= 0) {
				this.topLeft.y = p.y;
			}
		}
		
	}
	
	public void setTopLeft(int x, int y) {
		if (x >= 0) {
			this.topLeft.x = x;
			if (y >= 0) {
				this.topLeft.y = y;
			}
		}
		else {
			if (y >= 0) {
				this.topLeft.y = y;
			}
		}

	}
	
	public void setSideLength(int s) {
		if (s > 0) {
			this.sideLength = s;
		}
	}
	
	public int getArea() {
		int area = this.sideLength * this.sideLength;
		return area;
	}
	
	public int getPerimeter() {
		int perimeter = 4 * this.sideLength;
		return perimeter;
	}
	
	public boolean equals(MySquare2D another) {
		if((this.topLeft.x == another.topLeft.x) && (this.topLeft.y == another.topLeft.y) && (this.sideLength == another.sideLength)) {
			return true;
		}
		return false;
	}

	
	public String toString() {
		String str = String.format("MySquare2D:(%d, %d), side=%d", this.topLeft.x, this.topLeft.y, sideLength);
		return str;
	}
	
	
	public static void main(String[] args) {
		MySquare2D s1 = new MySquare2D(10, 20, 30);
		MySquare2D s2 = new MySquare2D(new Point(10, 20), 30);
		System.out.printf("The area is %d\n", s1.getArea());
		System.out.printf("The perimeter is %d\n", s1.getPerimeter());
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
//		MySquare2D s = new MySquare2D(10, 20, 30);
//		Point p = new Point(10, 20);
//		System.out.println(".equal? " + s.equals(p));
		
//		MySquare2D s = new MySquare2D(10, 20, 30);
//		MySquare2D p = new MySquare2D(10, 20, 10);
//		System.out.println(".equal? " + s.equals(p));
//		System.out.println("reference? " + (s == p));
		

	}

}
