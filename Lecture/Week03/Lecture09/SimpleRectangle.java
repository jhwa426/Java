import java.awt.Point;

public class SimpleRectangle {
    private int width=1;
    private int height=1;
    public SimpleRectangle() { this(1, 1);}
    public SimpleRectangle(int b, int h) { width = b; height=h; }
    public String toString() { return String.format("Rectangle, area=%.2f", this.getArea()); }
    public double getArea() {
        return width * height;
    }
    
    // question!! Lecture 09 quiz 6
    public boolean equals(Object obj) {
    	// casting
    	SimpleRectangle sr = (SimpleRectangle) obj;
    	
    	// checking instanceof, equal
    	if((obj instanceof SimpleRectangle) && (this.height == sr.height) && (this.width == sr.width)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
//    public boolean equals(Object obj) {
//    	return ((obj instanceof SimpleRectangle) && ((SimpleRectangle)obj).width == this.width && ((SimpleRectangle)obj).height == this.height); 
//    }
    
    

	public static void main(String[] args) {
//		SimpleRectangle p = new SimpleRectangle(10, 5);
//		System.out.println(p);
//		SimpleRectangle p2 = new SimpleRectangle(10, 5);
//		System.out.println(p2);
//		System.out.println(p == p2);
//		System.out.println(p.equals(p2));
		
		SimpleRectangle p = new SimpleRectangle(10, 5);
		System.out.println(p);
		Point p2 = new Point(10,5);
		System.out.println(p2);
		System.out.println(p.equals(p2));

	}

}
