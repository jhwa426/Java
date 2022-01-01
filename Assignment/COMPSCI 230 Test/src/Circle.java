class Circle {
  private double radius=1;
  public Circle() {}
  public Circle(double radius) { this.radius = radius;}
  public double getArea() { return Math.PI * radius * radius; }
  public double getPerimeter() { return 2 * Math.PI * radius; }
  public double getRadius() { return radius; }
}
class Rectangle {
  private double width=1, height=1;
  public Rectangle() {}
  public Rectangle(double w, double h) { width = w; height = h;}
  public double getArea() { return width * height; }
  public double getPerimeter() { return 2 * (width + height); }
  public double getWidth() { return width; }
  public double getHeight() { return height; }
}


class CylinderPrism {
	private Circle topCircle;
	private Circle baseCircle;
	private Rectangle sideRectangle;
	

	
	public CylinderPrism() {
		this(1,1);
	}
	
	public CylinderPrism(double radius, double height) {
		topCircle = new Circle(radius);
		baseCircle = new Circle(radius);
		sideRectangle = new Rectangle(this.topCircle.getPerimeter(), height);
	}
	
	public double getSurfaceArea() {
		double surface = topCircle.getArea() + baseCircle.getArea() + sideRectangle.getArea();
		return surface;
	}
	
	public void setHeight(double h) {
		if (h > 0) {
			this.sideRectangle = new Rectangle(this.topCircle.getPerimeter(), h);
		}
	}
}

class SubCylinderPrism extends Circle{
	private double height = 1;
	
	public SubCylinderPrism() {
		super();
	}
	
	public SubCylinderPrism(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public double getSurfaceArea() {
		return super.getArea() * 2 + super.getPerimeter() * height;
	}
	
	public void setHeight(double h) {
		if (h > 0) {
			this.height = h;
		}
	}
}












