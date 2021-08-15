class Base {
  public int x = 10;
}

public class Derived extends Base {
  public int y = 20;

  public static void main(String[] args) {

    Derived b1 = new Derived();
    System.out.println("b1.x=" + b1.x);
    System.out.println("b1.y=" + b1.y);

    Base b2 = new Derived();
    System.out.println("b2.x=" + b2.x);
   // System.out.println("b2.y=" + b2.y); //compile error
  }
}


