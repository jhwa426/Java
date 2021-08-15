class Base7 {
	public void aMethod() {
	  System.out.println("called aMethod()");
	}
	public void aMethod(int x) {
	  System.out.println("called aMethod(x)");
	}
	public static void main(String[] args) {
		Base7 b1 = new Base7();
		b1.aMethod(8);
	}
}
