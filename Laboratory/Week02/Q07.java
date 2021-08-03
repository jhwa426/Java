import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double number = input.nextDouble();
		double result;
		
		while (number != -999) {
			result = Math.pow(number,2);
			System.out.printf("The square of %.0f is %.0f.\n", number, result);
			
			System.out.println("Enter a number: ");
			number = input.nextDouble();
		}

	}

}
