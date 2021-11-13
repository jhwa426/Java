/*
 *	===============================================================================
 *	NestedShape.java : A shape that is a Nested Shape.
 *  YOUR UPI: jhwa426
 *	=============================================================================== */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class NestedShape extends RectangleShape{
	private ArrayList <Shape> innerShapes = new ArrayList<Shape>();
	private ShapeType innerShapeType = Shape.DEFAULT_SHAPETYPE;
	
	/*A default no-arg constructor to create an nested shape. The constructor creates an inner shape by calling the createInnerShape(innerShapeType) method. 
	 *The inner shape is a rectangle */
	public NestedShape() {
		super();
		this.createInnerShape(innerShapeType);
	}
	
	/* An overloaded constructor that takes x, y, width, height, margin width, margin height, fill colour, text and the inner shape type to create a nested shape. 
	 * The constructor invokes the constructor of super class, sets up the inner shape type and creates an inner shape and add it to the list of inner shapes 
	 * by calling the createInnerShape(ShapeType ist) method. */
	public NestedShape(int x, int y, int w, int h, int mw, int mh, Color c, String t, ShapeType ist) {
		super.x = x;
		super.y = y;
		super.width = w;
		super.height = h;
		super.marginWidth = mw;
		super.marginHeight = mh;
		super.color = c;
		super.text = t;
		this.innerShapeType = ist;
		this.createInnerShape(innerShapeType = ist);
		
	}
	
	public ShapeType getInnerShapeType() {
		return this.innerShapeType;
	}

	public Shape createInnerShape(int x, int y, int w, int h, int mw, int mh, Color c, String text, ShapeType st, ShapeType ist) {
		Shape s = null;
	
		switch(st) {
		case RECTANGLE : {
			s = new RectangleShape(x, y, w, h, mw, mh, c, PathType.BOUNCE, text);
			break;
			}
		case OVAL : {
			s = new OvalShape(x, y, w, h, mw, mh, c, PathType.BOUNCE, text);
			break;
			}
		}
		s.setParent(this);
		this.innerShapes.add(s);
		return s;
	}
	
	public Shape createInnerShape(ShapeType st) {
		return this.createInnerShape(0, 0, width/2, height/2, width, height, color, text, st, st);
	}

	public Shape getInnerShapeAt(int index) {
		return this.innerShapes.get(index);
	}
	
	public int getSize() {
		return this.innerShapes.size();
	}
	
	public int indexOf(Shape s) {
		return this.innerShapes.indexOf(s);
	}
	
	public void add(Shape s) {
		this.innerShapes.add(s);
		s.setParent(this);
	}
	
	public void remove(Shape s) {
		this.innerShapes.remove(s);
		s.setParent(null);
	}
	
	public void draw (Painter painter) {
		painter.setPaint(Color.black);
		painter.drawRect(this.x, this.y, this.width, this.height);
		painter.translate(this.x, this.y);
		
		for(Shape s : innerShapes) {
			s.draw(painter);
		}
		painter.translate(-this.x, -this.y);
	}
	
	public void move() {
		super.move();
		for (Shape s : innerShapes) {
			s.move();
		}
	}
	
	public void setWidth(int w) {
		super.width = w;
		for(Shape s : innerShapes) {
			s.marginWidth = w;
		}
	}
	
	public void setHeight(int h) {
		super.setHeight(h);
		for(Shape s : innerShapes) {
			s.marginHeight = h;
		}
	}
	
	public void setColor(Color c) {
		super.setColor(c);
		for(Shape s : innerShapes) {
			s.setColor(c);
		}
	}
}
