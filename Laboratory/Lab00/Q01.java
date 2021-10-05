import java.util.Scanner;

public class Q01 {
	
	final static int division = 12;
	
	public static void main(String[] args) {
		//Q1
		
		Scanner inputNum = new Scanner(System.in);
		System.out.println("Enter a number of inches:");
		
		int inch = inputNum.nextInt();
		int feet = inch / division;
		int leftOver = inch % division;

		if (feet == 1)
		{
			System.out.printf("That is %d foot and %d inches.\n", feet, leftOver);
		}
		else
		{
			System.out.printf("That is %d feet and %d inches.\n", feet, leftOver);
		}
		
		inputNum.close();
		
		
		
		//Q2

	}
}
