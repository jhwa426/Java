//Q5
class MyClass {
	
	private int outerNumber;
	public MyClass(int x) {
    outerNumber = x;
    }
	public class MyInner {
		private int innerNumber;
		
		public MyInner() {
			this.innerNumber = MyClass.this.outerNumber + 1;
		}
		
		public void printValues() {
			System.out.println(String.format("outer:%d, inner:%d", MyClass.this.outerNumber, this.innerNumber));
		}
	}
	
	public void start() {
		MyInner inner = new MyInner();
		inner.printValues();
		}
}