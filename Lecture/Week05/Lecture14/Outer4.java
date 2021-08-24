public class Outer4 {

  interface HelloWorld {
    public void greet();
  }

  public void sayHello() {

    class EnglishGreeting implements HelloWorld {
      String name = "world";
      public void greet() {
        System.out.println("Hello " + name);
      }
    }
HelloWorld english = new EnglishGreeting();
    english.greet();
  }

  public void sayBye() {
	  HelloWorld i = new HelloWorld() {
		  String name = "world";
		  public void greet() {
			  System.out.println("Bye " + name);
		  }
	  };
	  i.greet();
  }


  public static void main(String[] args) {
    Outer4 myApp = new Outer4();
    myApp.sayHello();
    myApp.sayBye();
  }
}