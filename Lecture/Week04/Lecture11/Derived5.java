class Base5 {
  private void get() { System.out.println("private:Base:get"); }
}

public class Derived5 extends Base5 {
  private void get() { System.out.println("private:Derived:get"); }

  public static void main(String[] args) {

    Derived5 b1 = new Derived5();
    b1.get();
  }
}
