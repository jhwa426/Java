import java.awt.Point;
import java.util.ArrayList;

public class Q07 {
	public static double getTotalDistance(ArrayList<Point> points) {
		double result = 0;
		
		for(int i=0; i<points.size()-1; i++) {
			result += points.get(i).distance(points.get(i+1));
		}
		return result;
	}

	public static void main(String[] args) {
		ArrayList<Point> points = new ArrayList<Point>();
		points.add(new Point(10, 10));
		points.add(new Point(20, 30));
		points.add(new Point(30, 40));
		System.out.printf("%.2f", getTotalDistance(points));

	}

}
