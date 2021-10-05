import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row = input.nextInt();

		for (int i = 1; i <= row; i++) {
			for(int j=row; j>i; j--) {
				System.out.print("  ");
			}
			for (int k=i; k >=1; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
