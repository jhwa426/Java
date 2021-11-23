/*
 *	===============================================================================
 *	NestedShape.java : A shape that is a rectangle.
 *  YOUR UPI: jhwa426
 *	=============================================================================== */
import java.awt.Color;
import java.util.*;
class NestedShape extends RectangleShape {
	private ArrayList<Shape> innerShapes = new ArrayList<Shape>();

	/** constructor to create a rectangle with default values */
	public NestedShape() { createInnerShape(ShapeType.RECTANGLE); }
	/** constructor to create a rectangle shape */
	public NestedShape(int x, int y, int w, int h, int mw, int mh, Color fc, String text, ShapeType ist) {
		super(x ,y ,w, h ,mw ,mh, fc, PathType.BOUNCE, text);
		createInnerShape(ist);
	}
	// add a constructor
	public NestedShape (int width, int height) {
		super(0, 0, width, height, 0, 0, Color.black, PathType.BOUNCE, "");
	}

	public NestedShape(int x, int y, int w, int h, int mh, int mh2, Color c, PathType bounce, String text,
			ShapeType ist) {
		// TODO Auto-generated constructor stub
	}
	// add createInnerShape() here
	public Shape createInnerShape(int x, int y, int w, int h, Color c, String text, ShapeType st, ShapeType ist) {
		return this.createInnerShape(x, y, w, h, w, h, c, text, st, ist);
	}
	
	public Shape createInnerShape(ShapeType st, ShapeType ist) {
		return createInnerShape(0, 0, width/2, height/2, width, height, color, text, st, ist);
	}
	
	public Shape createInnerShape(int x, int y, int w, int h, int mw, int mh, Color c, String text, ShapeType st, ShapeType ist) {
		Shape s = null;
		switch (st) {
			case RECTANGLE: {
				s =  new RectangleShape(x,y,w,h,mw,mh,c,PathType.BOUNCE,text );
				break;
			} case OVAL: {
				s = new OvalShape(x,y,w,h,mw,mh,c,PathType.BOUNCE,text);
				break;
			} case NESTED: {
				s = new NestedShape(x,y,w,h,mw,mh,c,text, ist);
				break;
			}
		}
		s.setParent(this);
		innerShapes.add(s);
		return s;
	}
	
	
	public Shape createInnerShape(ShapeType ist) {
		int halfWidth = width/2, halfHeight = height/2;
		return createInnerShape(0,0, halfWidth, halfHeight, width, height, color, text, ist, null);
	}
	public void draw(Painter g2d) {
		g2d.setPaint(Color.black);
		g2d.drawRect(x, y, width, height);
		g2d.translate(x, y);
		for (Shape s: innerShapes)
			s.draw(g2d);
		g2d.translate(-x, -y);
	}
	public void move() {
		super.move();
		for (Shape s: innerShapes)
			s.move();
	}
	public void add(Shape s) {
		s.setParent(this);
		innerShapes.add(s);
	}
	public void remove(Shape s) {
		innerShapes.remove(s);
		s.setParent(null);
	}
	public int getSize() { return innerShapes.size(); }
	public Shape getInnerShapeAt(int row) { return innerShapes.get(row); }
	public int indexOf(Shape s) { return innerShapes.indexOf(s); }
	public ArrayList<Shape> getAllInnerShapes() {
		return innerShapes;
	}
	public void setWidth(int w) {
		super.setWidth(w);
		for (Shape s: innerShapes)
			s.setMarginSize(w, height);
	}
	public void setHeight(int h) {
		super.setHeight(h);
		for (Shape s: innerShapes)
			s.setMarginSize(width, h);
	}
	public void setColor(Color fc) {
		super.setColor(fc);
		for (Shape s: innerShapes)
			s.setColor(fc);
	}
	
	public static void main(String[] args) {


	}
}