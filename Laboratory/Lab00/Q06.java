import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many people in the group? ");
		int people = input.nextInt();
		input.nextLine();
		
		System.out.println("How much was the Pizzas in total? ");
		double pizza = input.nextDouble();
		
		double result = pizza / people;
		
		System.out.printf("Each person pays $%.0f.", result);
		
		input.close();

		
	}
}