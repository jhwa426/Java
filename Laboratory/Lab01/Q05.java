import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int firstNum = input.nextInt();
		
		System.out.println("Enter the last number: ");
		int lastNum = input.nextInt();
		
//		int total = 0;
		
		for (int num = firstNum; num <= lastNum; num++) {
			if (num % 5 == 0 && num % 3 != 0) {
//				total += num;
				System.out.print(num + " ");
			}
		}
		input.close();
	}

}
