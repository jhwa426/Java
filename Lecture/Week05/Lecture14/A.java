class A {
    int val;
    public A(int v) { val = v; }
}
class B extends A {
    int val = 1;
    public B() { super(2); }
    class C extends A {
      int val = 3;
      public C() {
        super(4);
        System.out.println(B.this.val);
        System.out.println(C.this.val);
        System.out.println(super.val);
      }
    }
}