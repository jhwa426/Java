import java.awt.Point;

class Rectangle extends Point{
	private Point bottomRight;
	public Rectangle(Point p, Point q) {
		super(p);
		this.bottomRight = q;
	}
	
	public int getHeight() {
		return this.bottomRight.y - y;
	}
	
	public int getWidth() {
		return this.bottomRight.x - x;
	}
	
	public String toString() {
		return String.format("(%d, %d), %d x %d\n", x, y, getWidth(), getHeight());
	}
	
	public static void main(String[] args) {
		
		Point p = new Point(10, 20);
		Rectangle r1 = new Rectangle(new Point(10, 20), new Point(100, 150));
		Point p2 = new Rectangle(p, new Point(30, 40));

		
		
	}

}
