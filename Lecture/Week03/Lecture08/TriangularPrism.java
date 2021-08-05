class TriangularPrism {
	private SimpleTriangle triangle;
	private SimpleRectangle sideRect;
	private SimpleRectangle bottomRect;
	
	public TriangularPrism() {
		
	}
	// overloaded constructor
	// base of triangle, height of the triangle, side of the triangle, and length.
	
	public TriangularPrism(int base, int height, int side, int length) {
		triangle = new SimpleTriangle(base, height);
		sideRect = new SimpleRectangle(side, height);
		bottomRect = new SimpleRectangle(base, length);
	}
	
	public double getSurfaceArea() {
		// (base * height) + (base * length) + (side * length) + (side * length)
		// bottomRect.getHeight() = length (12)
		// sideRect.getWidth() = side (5)
		// triangle.getHeight(); = height (4)
		// triangle.getBase() = base(6)
		
		double surface = (triangle.getBase()*triangle.getHeight()) + (triangle.getBase() * bottomRect.getHeight())
				+ (sideRect.getWidth() * bottomRect.getHeight()) + (sideRect.getWidth() * bottomRect.getHeight()) ;
		return surface;
	}
	
	public String toString() {
		String str = String.format("Prism, Surface area=%.2f", getSurfaceArea());
		return str;
	}
	
	public static void main(String[] args) {
		TriangularPrism p = new TriangularPrism(6, 4, 5, 12);
		System.out.println(p);
		
		TriangularPrism p2 = new TriangularPrism(8, 3, 5, 20);
		System.out.println(p2);

	}

}
