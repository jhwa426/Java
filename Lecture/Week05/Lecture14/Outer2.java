public class Outer2 {
  private int x;
  private static int count;
  public Outer2() {
	x=count++;
	MyInnerMember n = new MyInnerMember();
    n.instanceMethod();
    System.out.println("n.x=" + n.x + ",n.p" + n.p);
  }

  public class MyInnerMember {
    private int p = 10;
    private int x = 10;
    public void instanceMethod() {
      System.out.print("x=" + x + ",p=" + p );
      System.out.println(" x=" + Outer2.this.x + ",count=" + Outer2.count);
    }
  }

  public static void main(String[] args) {
    Outer2 m1 = new Outer2();
    Outer2 m2 = new Outer2();
  }
}

class A2 {
  public static void main(String[] args) {
   Outer2 obj = new Outer2();
   Outer2.MyInnerMember m3 = obj.new MyInnerMember(); //outside the outer class
   m3.instanceMethod();
  }
}