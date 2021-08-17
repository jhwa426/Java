import java.awt.*;
public class Circle extends Shape {
  private int radius;
  public Circle() {}
  
  public Circle(int x, int y, int r) {
    super(x,y);
    radius = r;
  }
  
  public int getRadius(){ 
	  return radius; 
  }
  
  public void setRadius(int r){ 
	  radius = r; 
	  }
  
  public void draw(Graphics g) {
    g.drawOval(p.x, p.y, radius*2, radius*2);
  }
  
  public int getArea() {
    return (int) (Math.PI * radius * radius);
  }
  
  public double getPerimeter() {
	  double perimeter = Math.PI * 2 * this.radius;
	  
	  return perimeter;
  }
  
  public static void main(String[] args) {
	  Circle r  = new Circle (20, 30, 40);
	  System.out.printf("%.2f%n", r.getPerimeter());

	}

}