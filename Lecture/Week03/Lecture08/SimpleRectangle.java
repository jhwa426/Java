class SimpleRectangle {
	private int height = 1;
	private int width = 1;
	
	// no-arg constructor 
	public SimpleRectangle() {
		
	}
	// overloaded constructor 

	public SimpleRectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	

	public int getArea() {
//		int area = this.height*this.width;
		int area = getWidth()*getHeight();
		return area;
	}

	
	public String toString() {
		String str = String.format("Rectangle, area=%d.00",getArea());
		return str;
	}
	
	
	

	public static void main(String[] args) {
		SimpleRectangle p = new SimpleRectangle();
		System.out.println(p);
		SimpleRectangle p2 = new SimpleRectangle(10, 5);
		System.out.println(p2);
		System.out.println(p == p2);
		System.out.println(p.equals(p2));
		
		SimpleRectangle s = new SimpleRectangle(100, 20);
		System.out.println(s.getWidth());
		System.out.println(s.getHeight());

	}

}
