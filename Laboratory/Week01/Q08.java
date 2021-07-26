import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your weight in kgs: ");
		double weight = input.nextDouble();
		
		System.out.println("Enter your height in metres: ");
		double height = input.nextDouble();
		
		double bmi = weight / (Math.pow(height, 2));

		
		System.out.printf("Your BMI is: %.2f", bmi);
		
		input.close();

	}

}
