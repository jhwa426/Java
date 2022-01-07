import java.awt.Rectangle;
import java.util.Arrays;

public class Q2 {
	public static int getSumOfAreas(Rectangle[] rects) {
		int result = 0;
		
		for(int i=0; i<rects.length; i++) {
			result += rects[i].height * rects[i].width;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		Rectangle[] theRects = new Rectangle[3];
		theRects[0] = new Rectangle(30, 40, 5, 5);
		theRects[1] = new Rectangle(10, 0, 2, 6);
		theRects[2] = new Rectangle(15, 5, 2, 5);
		System.out.println(getSumOfAreas(theRects));

	}

}
