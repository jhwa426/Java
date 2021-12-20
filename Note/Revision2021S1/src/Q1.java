import java.util.Scanner;

class Q1 {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter an integer:");
//		int inputNum = input.nextInt();
//		int digit = inputNum;
//		int most = 0;
//		int least = 0;
//		
//		String size = "" + inputNum;
//		int strSize = size.length();
//		
//		int count = size.length();
//		
//		int[] numbers = new int [count];
//		
//		
//		while (0 < count) {
//			numbers[size.length() - count] = inputNum % 10;
//		    inputNum = inputNum / 10;
//		    count -= 1;
//		}
//		
//		Arrays.sort(numbers);
//		least = numbers[numbers.length-1];
//		most = numbers[0];
//		
//		if (strSize == 1) {
//			System.out.printf("The least significant digit of %d is %d.\n", digit, least);
//			System.out.printf("The most significant digit of %d is 0\n", digit);
//
//		}
//		else {
//			System.out.printf("The least significant digit of %d is %d.\n", digit, least);
//			System.out.printf("The most significant digit of %d is %d.\n", digit, most);
//		}


		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer:");
		String inputNum = input.nextLine();
		
		char least = inputNum.charAt(inputNum.length()-1);
		char most = inputNum.charAt(0);
		
		
		System.out.printf("The least significant digit of %s is %c.\n", inputNum, least);
		System.out.printf("The most significant digit of %s is %c.\n", inputNum, most);

		
		
	}

}
