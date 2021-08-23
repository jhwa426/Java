//Q6
interface MyInterface {
   public String getMessage();
}
class AnonymousDemo {
	public void create() {
		MyInterface p1 = new MyInterface(){
			public String getMessage() {
				return String.format("Implementing getMessage");
			}
			
		};
		System.out.println(p1.getMessage());
	}
}