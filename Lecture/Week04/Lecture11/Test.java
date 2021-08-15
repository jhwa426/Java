class Test {

	public static void main(String[] args) {
		Derived2 d = new Derived2();
		Base2 b = new Derived2();
		
//		System.out.println(d.x);
//		System.out.println(((Base2)d).x); //casting
//		System.out.println(((Base2)d).y);
		
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println();
		System.out.println(((Derived2)b).x);
		System.out.println(((Derived2)b).y);
		
		

	}

}


class Base2{
	public int x = 10;
	public int y = 20;
	
}

class Derived2 extends Base2{
	public int x = 30;
	public int y = 40;
}
