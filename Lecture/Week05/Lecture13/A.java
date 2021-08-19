//Q3
interface A {
  void method1();
  void method2();
}

interface B extends A {
  void method3();
}

//Important implements B not A!!!!!!!!
class MyClass implements B {
	public void method1() {
		System.out.println("implement method1");
	}
	public void method2() {
		System.out.println("implement method2");
	}
	public void method3() {
		System.out.println("implement method3");
	}
	  
}