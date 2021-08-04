class SimpleCircle {
	private int radius = 1;

	public SimpleCircle() {
		
	}
	
	public SimpleCircle(int r) {
		radius = r;
	}
	
	public String toString() {
		String result = String.format("Circle, radius=%d", radius);
		return result;
	}

	public static void main(String[] args) {
		SimpleCircle p = new SimpleCircle();
		System.out.println(p);
		SimpleCircle p2 = new SimpleCircle(10);
		System.out.println(p2);
		System.out.println(p == p2);

	}

}
