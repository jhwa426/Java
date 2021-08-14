class A {
public A() {
System.out.println("Class A constructor");
}
public void m() {
System.out.println("Class A method");
}
public static void main(String[] args) {
A a = new B();
a.m();
}
}
class B extends A {
public B() {
System.out.println("Class B constructor");
}
public void m() {
System.out.println("Class B method");
}
}


