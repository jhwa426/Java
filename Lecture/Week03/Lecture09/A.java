
public class A {
	int x;
	public A() {
		this(100);
	}
	public A(int x) {
		this.x = x;
	}
	
	class B extends A {
		  int x = 10;
		  int y = 1;
		  public B() {}
		  public B(int y) { this.y = this.y + y; }
		  public B(int x, int y) {
			  super(x);
			  this.y = this.y + y;
		  }
	}

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A(10);
//		B b1 = new B();
		System.out.println(a1.x);
		System.out.println(a2.x);
//		System.out.println(b1);

	}

}
