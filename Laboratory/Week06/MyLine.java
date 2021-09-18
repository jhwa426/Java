//Q8

import java.awt.Point;
import java.util.ArrayList;

interface Iterator<E> {
	public boolean hasNext();
	public E next();
	public void remove();
}

class MyLine implements Iterable <Point> {
	private ArrayList<Point> points = new ArrayList<Point>();

	public void addPoint(int x, int y) {
		points.add(new Point(x, y));
	}

	public Iterator<Point> iterator() {
		return new PointIterator();
	}
	//Q9
	public static Point highestPoint(MyLine line) {
		  Point highestPoint = new Point(0,0);
		  Iterator<Point> pointIterator = line.iterator();

		  while (pointIterator.hasNext()) {
		      Point pt = pointIterator.next();
		      if (pt.y > highestPoint.y){
		          highestPoint.x = pt.x;
		          highestPoint.y = pt.y;
		      }
		  }
		  return highestPoint;
		}

	public class PointIterator implements Iterator <Point>{
		private int nextIndex = 0;

		public boolean hasNext() {
			return nextIndex < points.size();
		}

		public Point next() {
			int count = nextIndex;
			nextIndex++;
			return points.get(count);
		}
	}
}
