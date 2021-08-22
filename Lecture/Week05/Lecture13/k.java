// Q1
interface I {
  public void iMethod1(int i);
}

abstract class J implements I {
  public abstract void jMethod1(int j);
}

class K extends J implements I{
	public void iMethod1(int i) {
		System.out.printf("iMethod1(),%d\n", i);
	}
	public void jMethod1(int j) {
		System.out.printf("jMethod1(),%d\n", j);
	}
}

