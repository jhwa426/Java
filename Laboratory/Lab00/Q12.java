import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String first = input.nextLine();
		
		System.out.println("Enter the second string:");
		String second = input.nextLine();
		
		
		String firstEnd = first.substring(first.length()-2);
//		System.out.println(firstEnd);
//		String secondEnd = second.substring(second.length()-2);
//		System.out.println(secondEnd);
		
		System.out.println(second.contains(firstEnd));
		
		input.close();
		
	}

}
