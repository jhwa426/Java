//Q2
interface Resizable {
  public void resize(int percent);
}

class ResizableCircle extends Circle implements Resizable{
	//A default constructor to create the object with default values.
	public ResizableCircle() {
		super();
	}
	
	public ResizableCircle(double radius) {
		super.radius = radius;
	}

	public void resize(int percent) {
		super.radius = (double) percent * super.radius / 100.00;
	}
}
//fix