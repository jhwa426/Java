public class Outer {
  private int x=1;
  private static int count = 10;

  public static void g() { System.out.println("g");}
  public static void outerStaticMethod() {
	MyStaticInner b = new MyStaticInner();
    System.out.println("b.x=" + b.x + ",b.count=" + b.count);
  }

  public static class MyStaticInner {
    private int x=2;
    private static int count=20;
    public void  instanceMethod() {
      System.out.println("x=" + x); //itself
      //System.out.println("Outer.x=" + Outer.x);
      System.out.println("count=" + count); //itself
      System.out.println("Get Outer.count=" + Outer.count);

      MyOuter.g();
    }
    public static void staticMethod() {
      System.out.println("Get Outer.count=" + Outer.count);
    }
  }

  public static void main(String[] args) {
    Outer.MyStaticInner n1 = new Outer.MyStaticInner();
    n1.instanceMethod();
    outerStaticMethod();
  }
}

class A {
  public static void main(String[] args) {
    Outer.MyStaticInner n2 = new Outer.MyStaticInner(); //without an instance of the outer class
    n2.instanceMethod();

  }
}