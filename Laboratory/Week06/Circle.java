//Q1
interface GeometricObject {
  public double getPerimeter();
  public double getArea();
}

class Circle implements GeometricObject {
	protected double radius = 1.0;
	
	// A default constructor that creates an object with default values.
	public Circle() {
		this.radius = 1.0;
	}
	
	//An overloaded constructor that creates an object with the given radius.
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getPerimeter() {
		double perimeter = 2 * Math.PI * this.radius;
		return perimeter;
	}
	
	public double getArea() {
		double area = Math.PI * this.radius * this.radius;
		return area;
	}
	
	public String toString() {
		return String.format("Circle(%.2f),area=%.2f,perimeter=%.2f", this.radius, this.getArea(), this.getPerimeter());
	}

}
