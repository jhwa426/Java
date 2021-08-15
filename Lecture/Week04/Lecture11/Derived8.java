class Base8 {
  public void g() {
    System.out.println("Base:g");
  }
}

public class Derived8 extends Base8 {
  public void g() {
    System.out.println("Derived:g");
  }
  public static void main(String[] args) {
    Derived8 b1 = new Derived8();
    b1.g();
    Base8 b2 = new Derived8();
    b2.g();
  }
}
