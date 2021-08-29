import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int firstNum = input.nextInt();
		System.out.println("Enter the last number:");
		int lastNum = input.nextInt();
		
		for(int i = firstNum; i<=lastNum; i++) {
			if((i % 5 == 0) && (i % 3 != 0)) {
				System.out.printf("%d ", i);
			}
		}
	}
}
