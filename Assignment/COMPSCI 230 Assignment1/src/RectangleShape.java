/*
 * ==========================================================================================
 *  Implementation of the Rectangle Shape
 *  YOUR UPI: jhwa426
 *  =========================================================================================
 */
import java.awt.Color;
import java.awt.Point;

class RectangleShape extends Shape{
	

	//A default constructor which constructs a rectangle with the default values.
	public RectangleShape() {
		super();
	}

	//An overloaded constructor that constructs a rectangle with the given parameter values. 
	//(i.e. x, y, width, height, margin width, margin height, color and path type).
		
	public RectangleShape(int x, int y, int width, int height, int marginWidth, int marginHeight, Color color, PathType pathType) {
		super(x, y, width, height, marginWidth, marginHeight, color, pathType);
	}
	

	public void draw(Painter g) {
		g.setPaint(super.color);
		g.fillRect(super.x, super.y, super.width, super.height);
	}
	
	public boolean contains(Point mousePt) {
		return ((mousePt.x > super.x) && (mousePt.y > super.y) && (mousePt.x < super.width) && (mousePt.y < super.height) );
		//compare width height
	}
}
