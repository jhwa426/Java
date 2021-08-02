import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int count = input.nextInt();
		int i;
		double j;
		double sum = 0;
		
		for (i = 1; i <= count; i++) {
			j = i;
			sum += 1/3 + 2/5 + 3/7 + 4/9 + j/(2*j + 1);

		}

		System.out.printf("The sum of this series is %.2f.", sum);
	}

}
