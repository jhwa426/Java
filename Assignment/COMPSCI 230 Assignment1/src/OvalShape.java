/*
 *  ============================================================================================
 *  Implementation of the Oval Shape
 *  YOUR UPI: jhwa426
 *  ============================================================================================
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;


class OvalShape extends Shape{
	public OvalShape() {
		super();
	}
	public OvalShape(int x, int y, int w, int h, int mw, int mh, Color c, PathType pt) {
		super(x, y, w, h, mw, mh, c, pt);
	}
	
	public void draw(Painter g) {
		g.setPaint(super.color);
		g.fillOval(super.x, super.y, super.width, super.height);
	}

	public boolean contains(Point mousePt) {
		Point endPt = new Point(x + super.width, y + super.height);
		double dx = (2 * mousePt.x - x - endPt.x) / (double) width;
		double dy = (2 * mousePt.y - y - endPt.y) / (double) height;
		return dx * dx + dy * dy < 1.0;
	}

}