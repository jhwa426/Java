//Q3
interface Movable {
  public void moveUp();
  public void moveDown();
  public void moveLeft();
  public void moveRight();
}

class MovablePoint implements Movable {
	protected int x;
	protected int y;
	protected int xSpeed;
	protected int ySpeed;
	
	//A constructor that creates an object with default values.
	public MovablePoint() {
		this.x = 0;
		this.y = 0;
	}
	
	//An overloaded constructor that creates an object with the specified values.
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public String toString() {
		return String.format("(%d,%d)", this.x, this.y);
	}
	
	public void moveUp() {
		this.y -= this.ySpeed;
	}
	
	public void moveDown() {
		this.y += this.ySpeed;
	}
	
	public void moveLeft() {
		this.x -= this.xSpeed;
	}
	
	public void moveRight() {
		this.x += this.xSpeed;
	}
}
