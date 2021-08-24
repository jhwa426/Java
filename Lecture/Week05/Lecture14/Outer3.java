public class Outer3 {
  private int x=1;
  private static int count;
  public void OuterInstanceMethod(int p) {
    final int q=100;
    int r = 20;
    int x = 100;
    class MyLocalClass {
      private int x = 10;
      private int y = 10;

      public void instanceMethod() {
        System.out.print("x=" + x + ",y=" + y );
        System.out.println(" x=" + Outer3.this.x + ",count=" + Outer3.count);
        System.out.print("p=" + p + " q=" + q +" r=" + r );
      }
    }
    MyLocalClass obj = new MyLocalClass();
    obj.instanceMethod();
    System.out.print("obj.x=" + obj.x);
    System.out.println(" obj.y=" + obj.y);
  }

  public static void main(String[] args) {
    Outer3 m1 = new Outer3();
    m1.OuterInstanceMethod(5);
  }
}
