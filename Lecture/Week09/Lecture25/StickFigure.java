// StickFigure.java
import java.awt.Graphics;
import java.awt.Point;

public class StickFigure {
	private int height; // height of figure with legs stretched out
	private int x; // initial position of central stick from left margin
	private int headDiameter; 
	
	private Point neck;
	private Point head; // half a head diameter to the left of neck
	private Point hip;
	private Point leftHand;
	private Point rightHand;
	private Point leftKnee;
	private Point rightKnee;
	private Point leftFoot;
	private Point rightFoot;
	
	// Initialize StickFigure in "legs apart" pose
	
	
	public StickFigure(int startX, int height) {
		x = startX;
		this.height = height;
		headDiameter = height / 5;
		neck = new Point(x, height / 5);
		head = new Point(x - headDiameter/2, 0); 
		hip = new Point(x, 3 * height / 5);
		leftHand = new Point(neck.x - (int) (height * Math.cos(1.75*Math.PI) / 5), 
				neck.y - (int) (height * Math.sin(1.75 * Math.PI) / 5));  
		rightHand = new Point(neck.x + (int) (height * Math.cos(1.75*Math.PI) / 5), 
				neck.y - (int) (height * Math.sin(1.75 * Math.PI) / 5));  
		leftKnee = new Point(hip.x - (int) (height * Math.cos(1.75*Math.PI) / 5), 
				hip.y - (int) (height * Math.sin(1.75 * Math.PI) / 5));  
		rightKnee = new Point(hip.x + (int) (height * Math.cos(1.75*Math.PI) / 5), 
				hip.y - (int) (height * Math.sin(-1.00 * Math.PI) / 5));  
		leftFoot = new Point(leftKnee.x, leftKnee.y + height / 5);
		rightFoot = new Point(rightKnee.x, rightKnee.y + height / 5);
	}
	
	// Paint the stick figure
	public void paint(Graphics g) {
		g.drawOval(head.x, head.y , headDiameter,  headDiameter); //head
		g.drawLine(neck.x, neck.y, hip.x, hip.y); //body
		g.drawLine(neck.x, neck.y, leftHand.x, leftHand.y); // left arm
		g.drawLine(neck.x, neck.y, rightHand.x, rightHand.y); //right arm
		g.drawLine(hip.x, hip.y, leftKnee.x, leftKnee.y);  // left leg
		g.drawLine(leftKnee.x, leftKnee.y, leftFoot.x, leftFoot.y);
		g.drawLine(hip.x, hip.y, rightKnee.x, rightKnee.y); // right leg
		g.drawLine(rightKnee.x, rightKnee.y, rightFoot.x, rightFoot.y);
	}
	
	private int direction = 1;  // Set the direction of movement,
	                            // varies between 1 and -1
	
	public void move() {
		x += direction;
		head.x += direction;
		neck.x += direction;
		hip.x += direction;
		leftHand.x += direction;
		rightHand.x += direction;
		leftKnee.x += direction;
		rightKnee.x += direction;
		leftFoot.x += direction;
		rightFoot.x += direction;
		if (x < 0 || x > 1000) {  
			// Figure has reached the side of the window
			direction *= -1;
		}
	}
	
	double leftKneeAngle = 1.75;
	double rightKneeAngle = -1.00;
	double angleChange = .005;
	
	public void walk() { 
		move();	// Do the basic move things
		// then set the next knee and foot positions
		leftKneeAngle += angleChange * direction;
		rightKneeAngle += angleChange * direction;
		leftKnee.x = hip.x - (int) (height * Math.cos(leftKneeAngle * Math.PI) / 5); 
		leftKnee.y = hip.y - (int) (height * Math.sin(leftKneeAngle * Math.PI) / 5);  
		rightKnee.x = hip.x - (int) (height * Math.cos(rightKneeAngle * Math.PI) / 5); 
		rightKnee.y = hip.y - (int) (height * Math.sin(rightKneeAngle * Math.PI) / 5);  
		leftFoot.x = leftKnee.x; 
		leftFoot.y = leftKnee.y + height / 5;
		rightFoot.x = rightKnee.x; 
		rightFoot.y = rightKnee.y + height / 5;
	}
}
