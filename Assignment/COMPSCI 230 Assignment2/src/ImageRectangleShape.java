/*
 *  ============================================================================================
 *  This class is a ImageRectangleShape that represents a shape that displays an image.
 *  YOUR UPI: jhwa426
 *  ============================================================================================
 */

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

class ImageRectangleShape extends RectangleShape{
	private Image image = null;
	private String imageFilename = "java.gif";
	
	public ImageRectangleShape() {
		super();
	}
	
	public ImageRectangleShape (int x, int y, int width, int height, int marginWidth, int marginHeight, Color color, PathType pathType, String imageFilename) {
		super(x ,y ,width, height ,marginWidth ,marginHeight, color, pathType);
		this.imageFilename = imageFilename;
		this.loadImage();
	}
	
	public void loadImage() {
		this.image = Toolkit.getDefaultToolkit().createImage(A2.class.getResource(this.imageFilename));
	}

	public void draw(Painter g) {
		g.drawImage(image, x, y, width, height);
	}
}
