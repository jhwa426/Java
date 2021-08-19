import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q12_1 {

	public static void main(String[] args) {
		Point[] points = new Point[3];
		points[0] = new Point(100,5);
		points[1] = new Point(20, 100);
		points[2] = new Point(140, 200);
		ArrayList<Point> list = new ArrayList<Point>(Arrays.asList(points));
		System.out.println(getLeftMostX(list));
		
//		Point[] points = new Point[3];
//		points[0] = new Point(70, 100);
//		points[1] = new Point(100, 20);
//		points[2] = new Point(40, 200);
//		ArrayList<Point> list = new ArrayList<Point>(Arrays.asList(points));
//		System.out.println(getLeftMostX(list));

	}
	
	public static int getLeftMostX(ArrayList<Point> points) {
		int result = points.get(0).x;

		for (int i = 0; i<points.size(); i++) {
			if(points.get(i).x <= result) {
				result = points.get(i).x;
			}
		}

		
		return result;
	}

}
