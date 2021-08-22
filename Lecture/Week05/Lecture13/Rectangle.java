class Rectangle implements Comparable<Rectangle>{
	private int width=1,height=1 ;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int w, int h) {
		width = w; height = h;
	}
	
	public int getArea() { 
		return width * height; 
	}
	
	public String toString() {
		return String.format("%s(%d)",getClass().getSimpleName(), getArea());
	}

	public int compareTo(Rectangle other) {
//		int area1 = (this.height * this.width);
//		int area2 = (other.height * other.width);
//		
//		return area1 - area2;
		
		return this.getArea() - other.getArea();
	}

}
