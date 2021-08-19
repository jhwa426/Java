// Q2
interface Area {
  void printArea(double a, double b);
}

class Rectangle implements Area {
	public void printArea(double a, double b) {
		double area = a * b;
		System.out.printf("The area of a Rectangle is %.2f\n", area);
	}
}

class Circle implements Area {
	public void printArea(double a, double b) {
		double area = a * b * Math.PI;
		System.out.printf("The area of a Circle is %.2f\n", area);
	}
}



