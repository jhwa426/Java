//Q02
enum ShapeType { SQUARE, CIRCLE;}
abstract class Shape {
  public abstract double getArea();
  public void draw() {
    System.out.println(String.format("Area of %s is %.2f", getClass().getName(), getArea()));
   }
}


class Square extends Shape {
	private int side_length;
	
	public Square(int value) {
		this.side_length = value;
	}
	
	@Override
	public double getArea() {
		return this.side_length * this.side_length;
	}
}

class Circle extends Shape {
	private int radius;
	
	public Circle (int value) {
		this.radius = value;
	}
	
	@Override
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
}

class ShapeFactory {
	public Shape createShape(ShapeType shapeType, int value) {
		if (shapeType == ShapeType.SQUARE) {
			Square s = new Square(value);
			return s;
		}
		if (shapeType == ShapeType.CIRCLE) {
			Circle c = new Circle(value);
			return c;
		}
		return null;
	}
}