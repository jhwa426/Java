import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = input.nextInt();
		
		System.out.println("Enter number of columns: ");
		int column = input.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= column; j++) {
                if(i == 1 || i == rows || j == 1 || j == column)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
	}

}
