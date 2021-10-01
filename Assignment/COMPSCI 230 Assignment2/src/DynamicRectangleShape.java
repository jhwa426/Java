/*
 *  ============================================================================================
 *  This class is a DynamicRectangleShape that represents a specific rectangle.
 *  YOUR UPI: jhwa426
 *  ============================================================================================
 */

import java.awt.Color;

class DynamicRectangleShape extends RectangleShape {
	public DynamicRectangleShape () {
		super();
	}
	
	public DynamicRectangleShape (int x, int y, int w, int h, int mw, int mh, Color c, PathType pt) {
		super(x ,y ,w, h ,mw ,mh, c, pt);
	}
	
	public void draw(Painter g) {
		g.setPaint(super.color);
		
		if (path.isBouncedBack) {
			int tempWidth = width;
			width = height;
			height = tempWidth;

			g.fillRect(x, y, height, width);
			path.isBouncedBack = false;
		}
		else {
			g.fillRect(x, y, width, height);
		}
	}
}
