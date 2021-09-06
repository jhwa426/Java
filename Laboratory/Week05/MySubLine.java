//Q8 - Q9
import java.awt.Point;
//Q8
class MySubLine extends Point{
	private Point endPoint;
	
	//A default constructor that constructs a line with default values.
	public MySubLine() {
		super();
		this.endPoint = new Point(0,0);
		
	}
	//An overloaded constructor that constructs a line with the specified values.
	public MySubLine(int x1, int y1, int x2, int y2) {
		super(x1, y1);
		this.endPoint = new Point(x2, y2);
	}
	//An overloaded constructor that takes two Point objects as parameters and constructs a line.
	public MySubLine(Point p1, Point p2) {
		super(p1);
		this.endPoint = p2;
	}
	public String toString() {
		String str = String.format("%s to %s", super.toString(), this.endPoint);
		return str;
	}
	
	//Q9
	public int getEndX() {
		return this.endPoint.x;
	}
	
	public int getEndY() {
		return this.endPoint.y;
	}
	
	public void setEndLocation(int x, int y) {
		this.endPoint = new Point(x, y);
	}
	
	public double getLength() {
		return this.distance(endPoint);
	}
	
	public static void main(String[] args) {
//		MySubLine line = new MySubLine(1, 2, 3, 4);
//		System.out.println(line);
//		System.out.printf("%.2f%n", line.getLength());
		
		MySubLine line = new MySubLine(1, 2, 3, 4);
		line.setEndLocation(3, 200);
		System.out.println(line);

	}
}
