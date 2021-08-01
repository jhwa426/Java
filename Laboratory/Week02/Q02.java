import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		
		System.out.println("Enter b: ");
		int b = input.nextInt();
		
		System.out.println("Enter c: ");
		int c = input.nextInt();
		
		double determinant = Math.pow(b, 2) - 4 * a * c;
		
		double r1 = (-b + Math.sqrt(determinant)) / (2 * a);
		double r2 = (-b - Math.sqrt(determinant)) / (2 * a);
		
		if (determinant > 0) {
			double maxNum = Math.max(r1, r2);
			double minNum = Math.min(r1, r2);
			System.out.printf("The roots are %.2f and %.2f.", minNum, maxNum);
		}
		else if (determinant == 0) {
//			r1 = r2 = -b / (2 * a);
			System.out.printf("The root is %.2f.", r1);
		}
		else {
			System.out.println("The equation has no real roots.");
		}
		input.close();
		
	}

}
