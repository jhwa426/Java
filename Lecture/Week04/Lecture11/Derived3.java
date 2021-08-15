class Base3 {
  public static int x = 10;
}

public class Derived3 extends Base3 {
  public static int y = 20;

  public static void main(String[] args) {

    System.out.println("Base3.x=" + Base3.x);
    System.out.println("Derived3.y=" + Derived3.y);
    System.out.println("Derived3.y=" + Derived3.x);

  }
}
