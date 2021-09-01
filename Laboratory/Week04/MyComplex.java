//Q2
public class MyComplex {
	private double real = 0;
	private double imaginary = 0;
	
	public MyComplex() {
		
	}
	
	//overloaded constructor
	public MyComplex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	public MyComplex(MyComplex other) {
//		this(other.real, other.imaginary);
		this.real = other.real;
		this.imaginary = other.imaginary;
	}
	
	public double getReal() {
		return this.real;
	}
	
	public double getImaginary() {
		return this.imaginary;
	}
	
	public void setReal(double r) {
		this.real = r;
	}
	
	public void setImaginary(double i) {
		this.imaginary = i;
	}
	
	public String toString() {
		String str = String.format("(%.1f + %.1fi)", this.real, this.imaginary);
		return str;
	}
	
	public boolean equals(MyComplex another) {
		if((another.getReal() == this.real) && (another.getImaginary() == this.imaginary)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	

	public static void main(String[] args) {
		MyComplex a = new MyComplex(9.5, 7.7);
		MyComplex b = new MyComplex(1.2, 3.1);
		MyComplex c = new MyComplex(b);
		MyComplex d = new MyComplex();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(b == c);
		System.out.println(b.equals(c));
		System.out.println(a.getReal());
		System.out.println(a.getImaginary());
		b.setReal(10.4);
		b.setImaginary(34);
		System.out.println(b);
		System.out.println(c);
		
		
//		MyComplex a = new MyComplex(9.5, 7.7);
//		MyComplex b = new MyComplex(1.2, 3.1);
//		System.out.println(a.equals(b));

	}

}
