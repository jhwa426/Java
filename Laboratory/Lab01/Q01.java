import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the high school grade point average: ");
		double average = input.nextDouble();

		System.out.println("Enter the admission test score: ");
		int score = input.nextInt();
		
		if ((average >= 3.0 && score > 60) || (average < 3.0 && score > 80)) {
			System.out.println("ACCEPT");
		}
		else {
			System.out.println("REJECT");
		}
		
		input.close();
	}

}
