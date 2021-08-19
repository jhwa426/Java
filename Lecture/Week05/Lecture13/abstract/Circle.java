import java.awt.*;
public class Circle extends Shape {
  private int radius;
  
  public Circle() {}
  public Circle(int x, int y, int r) {
    super(x,y);
    radius = r;
  }

  public int getRadius(){ return radius; }

  public void setRadius(int r){ radius = r; }

  public void draw(Graphics g) {
    g.drawOval(p.x, p.y, radius*2, radius*2);
  }

  public int area() {
    return (int) (Math.PI * radius * radius);
  }  
}