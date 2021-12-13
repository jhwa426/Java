import java.util.Scanner;
class Q3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input_num = input.nextInt();
		
		double num = (double) 0.00;
		
		for(double i = 0; i<=input_num; i++) {
			double current = (i) / (i+1);
			num += current;
		}
		
		System.out.printf("The sum of this series is %.2f.", num);

	}

}
