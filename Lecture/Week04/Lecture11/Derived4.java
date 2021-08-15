class Base4 {
  public static int x = 10;
  public static void get() { System.out.println("static:Base:get"); }
}

public class Derived4 extends Base4 {
  public static int x = 20;
  public static void get() { System.out.println("static:Derived:get"); }

  public static void main(String[] args) {

    Base4.get();
    Derived4.get();
  }
}
