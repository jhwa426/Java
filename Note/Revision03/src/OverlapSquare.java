//Q2
class OverlapSquare {
	private int x;
	private int y;
	private boolean isOverlapped;
	public static final int SIZE = 30;
	
	public OverlapSquare() {
		
	}
	
	public OverlapSquare(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	private boolean inside(int theX, int theY) {
		return ((this.x * this.y) > (theX * theY));
	}
	
	public void overlaps(OverlapSquare s) {
		this.inside(s.x, s.y);
	}
	
	public String toString() {
		if (this.inside(x, y) == false) {
			return String.format("A black square at (%d, %d)", this.x, this.y);
		}
		
		return String.format("A square at (%d, %d)", this.x, this.y);
	}

}
