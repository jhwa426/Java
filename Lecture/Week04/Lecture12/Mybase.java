abstract class MyBase {
	private int a, b;
	
	public MyBase(){
		
	}
	
	public abstract int method1(int a, int b); 
	
	public abstract int method2(int a, int b);
	
	
	public static void main(String[] args) {
		MyDerived b = new MyDerived();
		System.out.println(b.method1(5, 2));
		System.out.println(b.method2(5, 4));

	}

}

class MyDerived extends MyBase{
	public int method1(int a, int b) {
		return a+b;
	}

	public int method2(int a, int b) {
		return a*b;
	}
}

