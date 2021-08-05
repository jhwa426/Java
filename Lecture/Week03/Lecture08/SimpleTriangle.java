class SimpleTriangle {
	private int height = 1;
	private int base = 1;
	
	public SimpleTriangle() {
		
	}
	
	public SimpleTriangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	public int getBase() {
		return this.base;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	
	public double getArea() {
		double area = (this.base * this.height)/2.00;
		return area;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String toString() {
		String str = String.format("Triangle, area=%.2f", getArea());
		return str;
	}
	
	
	
	public static void main(String[] args) {
		SimpleTriangle p = new SimpleTriangle();
		System.out.println(p);
		SimpleTriangle p2 = new SimpleTriangle(10, 5);
		System.out.println(p2);
		System.out.println(p == p2);
		System.out.println(p.equals(p2));
		p.setBase(50);
		p.setHeight(100);
		System.out.println(p.getBase());
		System.out.println(p.getHeight());
		
//		SimpleTriangle p = new SimpleTriangle(20, 10);
//		System.out.println(p);

	}

}
