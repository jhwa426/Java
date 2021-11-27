import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year");
		
		int inputNum = input.nextInt();
		
		if (inputNum % 400 == 0) {
			System.out.printf("%d is a leap year.", inputNum);
		}
		else {
			if (((inputNum % 4 == 0)) && !(inputNum % 100 == 0)) {
				System.out.printf("%d is a leap year.", inputNum);
			}
			else {
				System.out.printf("%d is not a leap year.", inputNum);
			
			}
		}
		
	}
}
