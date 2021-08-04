
public class MyPoint {
	private int x = 0;
	private int y = 0;
	
	public MyPoint() {
		
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public MyPoint add(MyPoint other) {
		int x_value = this.x + other.x;
		int y_value = this.y + other.y;
		
		return new MyPoint(x_value, y_value);
		
	}
	
	public int multiply(MyPoint other) {
		int result = (this.x*other.x) + (this.y*other.y);
		return result;
	}
	
	public MyPoint scalar_multiply(int value) {
		int x_value = (this.x*value);
		int y_value = (this.y*value);
				
		return new MyPoint(x_value,y_value);
	}
	
	
	public String toString() {
		String str = String.format("(%d, %d)", x, y);
		return str;
	}
	
	
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(3, 4);
		MyPoint p2 = p1.scalar_multiply(3);
		System.out.println(p1);
		System.out.println(p2);

	}

}
