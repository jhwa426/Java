class MyTriangle {
	static final int NUMSIDES = 0;
	private MyPoint[] vertices = new MyPoint[3];
	
//	private MyPoint[] vertices = new Mypoint[] {new MyPoint(0,0),new MyPoint(0,0),new MyPoint(0,0)};
	
	public MyTriangle() {
		this.vertices[0] = new MyPoint(0, 0);
		this.vertices[1] = new MyPoint(0, 0);
		this.vertices[2] = new MyPoint(0, 0);
	}
	
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.vertices[0] = new MyPoint(x1, y1);
		this.vertices[1] = new MyPoint(x2, y2);
		this.vertices[2] = new MyPoint(x3, y3);
	}
	
	public MyTriangle(MyPoint vertices1, MyPoint vertices2, MyPoint vertices3) {
		this.vertices[0] = vertices1;
		this.vertices[1] = vertices2;
		this.vertices[2] = vertices3;
	}
	
	public MyTriangle(MyTriangle myTr) {
		myTr = new MyTriangle();
	}
	
	public String toString() {
		return String.format("MyTriangle[v1=(%d, %d),v2=(%d, %d),v3=(%d, %d)]", this.vertices[0].x, this.vertices[0].y, this.vertices[1].x, this.vertices[1].y, this.vertices[2].x, this.vertices[2].y);
	}
	
}
