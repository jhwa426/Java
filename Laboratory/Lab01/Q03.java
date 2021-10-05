import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 International Standard Book Number: ");
		int isbnNumber = input.nextInt();
		int d1, d2, d3, d4, d5, d6, d7, d8, d9;
		
		d1 = isbnNumber / 100000000;
		d2 = isbnNumber / 10000000 % 10;
		d3 = isbnNumber / 1000000 % 10;
		d4 = isbnNumber / 100000 % 10;
		d5 = isbnNumber / 10000 % 10;
		d6 = isbnNumber / 1000 % 10;
		d7 = isbnNumber / 100 % 10;
		d8 = isbnNumber / 10 % 10;
		d9 = isbnNumber % 10;
		
		int total = (d1 * 10 + d2 * 9 + d3 * 8 + d4 * 7 + d5 * 6 + d6 * 5 + d7 * 4 + d8 * 3 + d9 * 2) % 11;
		int checkSum = (11 - total % 11) % 11;
 
		
		if(checkSum == 10) {
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5+ d6+ d7+ d8 + d9 + "X");
		}
			
		else {
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5+ d6+ d7+ d8 + d9 + checkSum);
		}
			
		input.close();
	}

}
