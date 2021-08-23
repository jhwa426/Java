//Q5
class MyClass {
   public String getMessage() { 
	   return "MyClass.getMessage"; 
   }
}

class AnonymousDemo {
  public void create() {
	  MyClass p1 = new MyClass() {
		public String getMessage() {
			return String.format("Overriding %s", super.getMessage());
		}
	  };
 
    System.out.println(p1.getMessage());
  }
}