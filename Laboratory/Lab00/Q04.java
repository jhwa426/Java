import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int first = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the second integer: ");
		int second = input.nextInt();
		
		System.out.println(first == second*2);
		
	}

}
