import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a radius: ");
		int radius = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter a height: ");
		int height = input.nextInt();
		
		int result = (int) (Math.PI * (radius * radius) * height);
		
	}

}
