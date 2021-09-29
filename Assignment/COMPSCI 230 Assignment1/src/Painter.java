//Q02, Q05
/*
 *  ============================================================================================

 *  Painter.java : Painter interface
 *  YOUR UPI: jhwa426
 *  ============================================================================================
 */
import java.awt.*;

interface Painter {
	public void setPaint(Color color);
	public void setGraphics(Graphics g);
	public void drawHandles(boolean isSelected, int x, int y, int width, int height);
	public void fillRect(int x, int y, int width, int height);
	public void fillOval(int x1, int y1, int width, int height);
	public void fillPolygon(Polygon p);
	
}

