/*
 *  ============================================================================================
 *  Implementation of the Painter interface that delegates drawing to a Graphics object
 *  YOUR UPI: jhwa426
 *  ============================================================================================
 */
import java.awt.*;

class GraphicsPainter implements Painter {
	private Graphics2D g;
	public GraphicsPainter() {}
	public GraphicsPainter(Graphics g) { this.g = (Graphics2D) g;}
	public void setGraphics(Graphics g) {
		this.g = (Graphics2D)g;
	}
	@Override
	public void fillRect(int x, int y, int width, int height) {
		g.fillRect(x, y, width, height);
	}
	@Override
	public void fillOval(int x, int y, int width, int height) {
		g.fillOval(x, y, width, height);
	}
	public void fillPolygon(Polygon p) {
		g.fillPolygon(p);
	}
	@Override
	public void setPaint(Color c) {
		g.setPaint(c);
	}
	public void drawHandles(boolean isSelected, int x, int y, int width, int height) {
		if (isSelected) {
            g.setPaint(Color.black);
            g.fillRect(x -2, y-2, 4, 4);
            g.fillRect(x + width -2, y + height -2, 4, 4);
            g.fillRect(x -2, y + height -2, 4, 4);
            g.fillRect(x + width -2, y-2, 4, 4);
        }
	}
	@Override
	public void drawImage(Image img, int x, int y, int width, int height) {
		g.drawImage(img, x, y, width, height, null);
		
	}
}
