// Q1
public class MyPoint {
	
	private int x=0;
	private int y=0;
	
	public MyPoint() {
		
	}
	public MyPoint(int x, int y) { 
		this.x = x; 
		this.y = y;
	}
	public MyPoint(MyPoint p) { 
		this(p.x, p.y);
	}
	
	public int getX() { 
		return x; 
	}
	public int getY() { 
		return y; 
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() { return String.format("(%d, %d)", x, y); }
	
	public double distance(int x, int y) {
		double result = Math.sqrt(Math.pow((x - this.x),2) + Math.pow((y - this.y),2));
		return result;
	}
	
	public double distance(MyPoint p) {
		return this.distance(p.getX(),p.getY());
	}
	
	public double distance() {
		return this.distance(0,0);
	}
	
	
	public static void main(String[] args) {
//		MyPoint p1 = new MyPoint(2, 2);
//		MyPoint p2 = new MyPoint(19, 19);
//		System.out.printf("distance=%.2f%n", p1.distance(p2));
		MyPoint p1 = new MyPoint();
		System.out.printf("distance=%.2f%n", p1.distance());

	}

}
