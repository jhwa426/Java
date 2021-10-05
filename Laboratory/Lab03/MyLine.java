//Q6-Q7
import java.awt.Point;
public class MyLine {
	private Point startPoint = new Point(0,0);
	private Point endPoint = new Point(0,0);
	
	public MyLine() {
		
	}
	
	public MyLine(int x1, int y1, int x2, int y2) {
		this.startPoint.x = x1;
		this.startPoint.y = y1;
		this.endPoint.x = x2;
		this.endPoint.y = y2;
	}
	
	public MyLine(Point p1, Point p2) {
		this(p1.x, p1.y, p2.x, p2.y);
	}
	
	
	public int getX() {
		return this.startPoint.x;
	}
	
	public int getY() {
		return this.startPoint.y;
	}
	
	public int getEndX() {
		return this.endPoint.x;
	}
	
	public int getEndY() {
		return this.endPoint.y;
	}
	
	public void setX(int x) {
		this.startPoint.x = x;
	}
	
	public void setY(int y) {
		this.startPoint.y = y;
	}
	
	public void setEndX(int x) {
		this.endPoint.x = x;
	}
	
	public void setEndY(int y) {
		this.endPoint.y = y;
	}
	
	public double getLength() {
		double length = Point.distance(getX(), getY(), getEndX(), getEndY());
		return length;
	}
	
	public String toString() {
		String str = String.format("%s to %s", this.startPoint, this.endPoint);
		return str;
	}

	public static void main(String[] args) {
		MyLine line = new MyLine(1, 2, 3, 4);
		System.out.printf("%.2f%n", line.getLength());
	}

}
