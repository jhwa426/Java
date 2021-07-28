import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String first = input.nextLine();
		
		System.out.println("Enter the second string:");
		String second = input.nextLine();
		
		

		System.out.println(first.equalsIgnoreCase(second));
		
		input.close();

	}

}
