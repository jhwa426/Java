import java.util.InputMismatchException;
import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {

		try {
			Scanner input = new Scanner(System.in);

			System.out.println("Enter your weight in kgs: ");
			double weight = input.nextDouble();

			if (weight <= 0) {
				throw new ArithmeticException ("weight");
			}

			System.out.println("Enter your height in metres: ");
			double height = input.nextDouble();
			
			if (height <= 0) {
				throw new ArithmeticException ("height");
			}
			
			double bmi = weight / (Math.pow(height, 2));
			System.out.printf("Your BMI is: %.2f", bmi);
			
		} catch (InputMismatchException ie) {
			System.out.println("ERROR: Invalid input!");
		} catch (ArithmeticException e) {
			System.out.printf("ERROR: %s must be > 0.",e.getMessage());
		}
		
		
	}
}
