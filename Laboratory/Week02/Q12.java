import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row = input.nextInt();
		

		for (int i = 1; i <= row; i++) {
			if (i == 1 || i == row) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			}
			else {
				for (int j = 1; j <= i; j++) {
					if (j == 1 || j == i) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

	}

}
