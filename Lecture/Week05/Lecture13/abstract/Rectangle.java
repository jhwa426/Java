import java.awt.*;
public class Rectangle extends Shape {
  private int width, height;
  
  public Rectangle() {}
  public Rectangle(int x, int y, int w, int h) {
    super(x,y);
    width = w;
    height = h;
  }
  
  public int getWidth(){ return width; }

  public int getHeight(){ return height; }

  public void setWidth(int w){ width = w; }

  public void setHeight(int h){ height = h; }

  public void draw(Graphics g) {
    g.drawRect(p.x, p.y, width, height);
  }

  public int area() {
    return (width * height);
  } 
}
