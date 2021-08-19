import java.awt.*;
public class Triangle extends Shape {
  private int width, height;
  public Triangle() { }
  public Triangle(int x, int y, int w, int h) {
    super(x,y);
    width = w;
    height = h;
  }
  public int getWidth(){ return width; }
  public int getHeight(){ return height; }
  public void setWidth(int w){ width = w; }
  public void setHeight(int h){ height = h; }
  public void draw(Graphics g) {
    Point middle = new Point(p.x + width/2, p.y);
    Point right = new Point(p.x+ width, p.y + height);
    Point left = new Point( p.x, p.y + height);
    g.drawLine(middle.x, middle.y, left.x, left.y);
    g.drawLine(left.x, left.y, right.x, right.y);
    g.drawLine(right.x, right.y, middle.x, middle.y);
  }
  public int getArea() {
    return (width * height) / 2;
  }
}
