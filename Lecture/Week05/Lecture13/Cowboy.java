//Q4
interface Cowboy {
  void draw();  // draw the gun - get ready to pump some iron
  void drink(); // enjoy some beverage
  void burp();  // communicate with other people in the bar (or where ever)
}

interface Drawable {
	void draw(int x, int y);  // draw the drawable item on the screen
}

class Person implements Cowboy, Drawable{
	public void burp() {
		System.out.println("BURP !!");
	}
	
	public void drink() {
		System.out.println("I'm drinking...");
	}
	
	public void draw() {
		System.out.println("I'm drawing my gun");
	}

	public void draw(int x, int y) {
		System.out.printf("I'm drawing a point at (%d, %d)\n", x, y);
	}
}