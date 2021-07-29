import java.util.Random;
import java.util.Scanner;

// 28.07.2021
public class Lec05 {

	public static void main(String[] args) {
		// Q1
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a name: ");
//		String sentence = input.nextLine();
//		
//		int length = sentence.length()+5;
//		
//		
//		for (int i = 0; i <= length; i++) {
//			System.out.print("*");
//		}
//		
//		System.out.println();
//		System.out.println("   "+sentence+ "   ");
//		
//		for (int i = 0; i <= length; i++) {
//			System.out.print("*");
//		}
		
		// Q2
//        Scanner input = new Scanner(System.in);
//        Random rand = new Random(30);
//        
//        System.out.println("Enter a name: ");
//        String name = input.nextLine();
//        int position = rand.nextInt(name.length());
//        
//        String result = name.replace(name.charAt(position), "");
//        System.out.println(result);
		
		
		// Q5
		System.out.println(calculateMax(3, 4));
		System.out.println(calculateMax(3, 4, 6));
	}
	// Q5
	public static int calculateMax(int number1, int number2) {
		return Math.max(number1, number2);
	}
	
	public static int calculateMax(int number1, int number2, int number3) {
		return Math.max(Math.max(number1, number2), Math.max(number2, number3));
	}

}


