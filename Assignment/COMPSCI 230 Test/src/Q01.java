import java.util.Scanner;

class Q01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your firstname:");
		String firstname = input.next();
		System.out.println("Enter your surname:");
		String surname = input.next();
		
		String result = String.format("Hello %s %s, how are you?", firstname, surname.toUpperCase());
		
		System.out.println(result);
		
	}
}
