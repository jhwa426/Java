import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter side1 of a triangle: ");
	    double side1 = input.nextDouble();
	    System.out.println("Enter side2 of a triangle: ");
	    double side2 = input.nextDouble();
	    System.out.println("Enter side3 of a triangle: ");
	    double side3 = input.nextDouble();
	    
	    double triangle = (side1 + side2 + side3) / 2;
	    
	    double area = Math.sqrt(triangle * (triangle - side1) * (triangle - side2) * (triangle - side3));
	    
	    System.out.printf("Area of a triangle is %.2f", area);

	    		
	    input.close();
	}

}
