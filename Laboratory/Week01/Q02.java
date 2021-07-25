import java.util.Scanner;

public class Q02 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number in pounds: ");
			
		double pound = input.nextDouble();
		double kilogram = pound * 0.454;

		System.out.printf("%.2f pounds is %.2f kilograms.\n", pound, kilogram);

		input.close();


	}
}
