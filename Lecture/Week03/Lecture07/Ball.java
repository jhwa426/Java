import java.awt.Color;
class Ball {
	public final static int SIZE = 20; //constant
	private int xPos;
	private int yPos;
	private Color color;
	
	
	public Ball(int x, int y, Color c) {
		xPos = x;
		yPos = y;
		color = c;
	}
	
	public Ball(Color color) {
		this.color = color;
	}
	
    public Ball() {
        this(0, 0, Color.blue);
    }
	
	public void move(int deltaX, int deltaY) {
		xPos += deltaX;
		yPos += deltaY;
	}
	
    public String toString() {
        return xPos + "," + yPos + "," + color;
    }

	public static void main(String[] args) {
		Ball b1 = new Ball(1,2,Color.red);
		System.out.println(b1);
		
		Ball b2 = new Ball();
		System.out.println(b2);
		
		b2.move(20, 20);
		System.out.println(b2);
	}

}
