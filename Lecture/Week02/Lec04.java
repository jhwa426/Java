import java.security.SecureRandom;
import java.util.Scanner;

// 27.07.2021
public class Lec04 {

	public static void main(String[] args) {
		//Ex 1
//		int numberOfCoins = 4;
//		while (numberOfCoins > 0) {
//			numberOfCoins--;
//			System.out.println("Insert a coin");
//		}
		
		// Ex 2
//		double total = 0, gradeCounter = 0;
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter grade or -1 to quit: ");
//		int grade = input.nextInt();
//		
//		while (grade != -1) {
//			total += grade;
//			gradeCounter += 1;
//			System.out.println("Enter grade or -1 to quit: ");
//			grade = input.nextInt();
//		}
//		
//		System.out.printf("Total of the %.0f grades entered is %.0f\n", gradeCounter, total);
//		double average = total / gradeCounter;
//		System.out.printf("Class average is %.2f", average);
		
		// Ex 3
//		int counter = 1;
//		do {
//			System.out.printf("%d ", counter);
//			  ++counter;
//		} while (counter <= 10);
//		System.out.printf("END-" + counter);
		
		// Ex 4 (once)
//		int counter = 100;
//		do {
//			System.out.printf("%d ", counter);
//			  ++counter;
//		} while (counter <= 10);
//		System.out.printf("END-" + counter);
		
		// Ex5
//		int counter = 100;
//		while (counter <=10) {
//			System.out.printf("%d ", counter);
//			++counter; 
//			}
//			System.out.println("END-"+counter);
			
		// Ex 6
//		int count;
//		for (count = 1; count <= 10; count++) {
//			if (count == 5) {
//				break;
//			}
//			System.out.printf("%d", count);
//		}
//		System.out.printf("%nBroke out of loop at count=%d%n", count);
		
		// Ex 7
//		int count;
//		for (count = 1; count <= 10; count++) {
//			if (count == 5) {
//				continue;
//			}
//			System.out.printf("%d", count);
//		}
//		System.out.printf("%nUsed continue to skip printing 5%n");
		
		// Ex 8
//		SecureRandom randomNumbers = new SecureRandom();
//		for (int counter = 0; counter <= 20; counter++) {
//			System.out.printf("%d ", randomNumbers.nextInt(6));
//		}
		
		// Ex 9
		SecureRandom randomNumbers = new SecureRandom();
		for (int counter = 0; counter <= 20; counter++) {
			System.out.printf("%d ", 1+randomNumbers.nextInt(6)); //shifting
		}
		
		
		
		
		
		
			
	}

}
