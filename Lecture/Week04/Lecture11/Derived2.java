class Base2 {
  public int x = 10;
}

public class Derived2 extends Base2 {
  public int x = 20;

  public static void main(String[] args) {

    Derived2 b1 = new Derived2();
    System.out.println("b1.x=" + b1.x);

    Base2 b2 = new Derived2();
    System.out.println("b2.x=" + b2.x);
   // System.out.println("b2.y=" + b2.y); //compile error
  }
}
