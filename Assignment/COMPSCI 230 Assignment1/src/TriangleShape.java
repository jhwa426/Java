/*
 *  ============================================================================================
 *  Implementation of the Triangle Shape
 *  YOUR UPI: jhwa426
 *  ============================================================================================
 */

import java.awt.Color;
import java.awt.Point;
import java.awt.Polygon;

class TriangleShape extends Shape{
	public TriangleShape() {
		super();
	}
	
	public TriangleShape(int x, int y, int width, int height, int marginWidth, int marginHeight, Color color, PathType pathType) {
		super(x, y, width, height, marginWidth, marginHeight, color, pathType);
	}
	
	public void draw(Painter g) {
		g.setPaint(super.color);
		
		int xPoly[] = {x+(width/2), x+width, x};
		int yPoly[] = {y, y+height, y+height};
		
		Polygon poly = new Polygon(xPoly, yPoly, 3);

		g.fillPolygon(poly);
	}


	public boolean contains(Point p) {
		Polygon poly = new Polygon();
		poly.addPoint(x+(width/2), y);
		poly.addPoint(x+width,y+height);
		poly.addPoint(x, y+height);
		
		return poly.contains(p);
	}



}
