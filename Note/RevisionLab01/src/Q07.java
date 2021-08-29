import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int inputNum = input.nextInt();
		
		while(inputNum != -999) {
			System.out.printf("The square of %d is %d.\n", inputNum, (inputNum*inputNum));
			System.out.println("Enter a number: ");
			inputNum = input.nextInt();
		}
	}
}
