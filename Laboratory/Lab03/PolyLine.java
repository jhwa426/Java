//Q08-Q10
import java.awt.Point;
import java.util.ArrayList;

class PolyLine {
	private ArrayList <Point> points = new ArrayList <Point>();
	
	//default constructor 
	public PolyLine() {
	}
	
	//An overloaded constructor
	public PolyLine(Point point) {
		this.points.add(point);
	}
	
	// constructor methods
	public void appendPoint(Point p) {
		this.points.add(p);
	}
	
	public void appendPoint(int x, int y) {
		Point newPoint = new Point(x, y); //new object of Point
		this.points.add(newPoint);
	}
	
	public void removeLastPoint() {
		this.points.remove(this.points.size() - 1);
	}
	
	public Point getPoint(int index) {
		return this.points.get(index);
	}
	
	public String toString() {
		String str = "";
		for (int i = 0; i<points.size(); i++) {
			int x = this.points.get(i).x;
			int y = this.points.get(i).y;
			str += String.format("java.awt.Point[x=%d,y=%d] ", x, y);
		}
		return str;
	}
	
	public int getSize() {
		return this.points.size();
	}
	
	public double getLength() {
		double length = 0;
		for(int i = 0; i<this.points.size()-1; i++) {
			length += this.points.get(i).distance(this.points.get(i+1));
		}
		return length;
	}
	
	public void join(PolyLine anotherLine) {
		for (int i = 0; i<anotherLine.getSize(); i++) {
			this.points.add(anotherLine.getPoint(i));
		}
	}
	

	public static void main(String[] args) {
		ArrayList<Point> points = new ArrayList<Point>();
		points.add(new Point(11, 12));
		points.add(new Point(13, 14));
		PolyLine line2 = new PolyLine();
		for (Point p: points) line2.appendPoint(p);
		PolyLine line1 = new PolyLine();
		line1.appendPoint(11, 21);
		line1.appendPoint(123, 111);
		line2.join(line1);
		System.out.println(line2);

	}

}
