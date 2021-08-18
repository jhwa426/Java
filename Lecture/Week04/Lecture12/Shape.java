import java.awt.*;
public abstract class Shape {
	
  protected Point p; //top-left corner
  
  public Shape() {
	  p = new Point();
  }
  
  public Shape(int x, int y) {
	  p = new Point(x,y);
  }
  
  public int getX() { 
	  return p.x; 
  }
  public int getY() { 
	  return p.y; 
  }
  
  public void setX(int x ) { 
	  p.x = x; 
  }
  
  public void setY(int y) { p.y = y; 
  }
  
  public void translate(int deltax, int deltay) {
    p.translate(deltax, deltay);
  }
  
  public abstract void draw(Graphics g);
  
  public abstract int getArea();
  
}