interface I1 {
    public void m1();
    public void m2();
}

class C1 implements I1 {
    public void m1() {System.out.println("m1");}
    public void m2() {System.out.println("m2");}
}

interface I2 extends I1 {
    public void m3();
    }

class C2 implements I2{
    public void m1() {System.out.println("I2.m1");}
    public void m2() {System.out.println("I2.m2");}
    public void m3() {System.out.println("I2.m3");}
}

public class TestAbstract {
    public static void main(String[] args) {
        C1 a = new C1();
        C1 b = new C1();
        I1 p = a;
        p.m1();
        p.m2();

        C2 c = new C2();
        I2 q = c;
        q.m1();
        q.m2();
        q.m3();
    }
}