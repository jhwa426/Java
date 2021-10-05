import java.util.Scanner;

public class Q07 {
	final static int acre = 43560;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the field in feet: ");
		int length = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the width of the field in feet: ");
		int width = input.nextInt();
		
		double result = length * width;
		
		
		System.out.printf("The area of the farmer's field is %.3f acres.", (result/acre));
		
		
		input.close();

	}

}
