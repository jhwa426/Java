interface I {
	public void im();

}

interface J extends I{
	public void jm();
}

interface k extends I{
	public void km();
}

class F{
	public void km() {
		System.out.print("class F: km()");
	}
}

class C implements I{
	public void im() {
		System.out.print("class C: im()");
	}
}

class D implements J{
	public void im() {
		System.out.print("class D: im()");
	}
	public void jm() {
		System.out.print("class D: jm()");
	}
	
	public void f() {
		System.out.print("class D: f()");
	}
	
	public void h() {
		System.out.print("class D: h()");
	}
}

class H extends D{
	public void g() {
		System.out.print("class H: g()");
	}
	
	public void f() {
		System.out.print("class H: f()");
	}
	public void jm() {
		System.out.print("class H: jm()");
	}
	
}








