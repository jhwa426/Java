import java.util.*;
public class Lec04quiz{
	public static void main(String[] args) {
		//Q1
//		for (int i = 3; i <= 12; i++){
//			   System.out.print(i + " ");
//			}
		
		//Q2
//		int x = 10;
//		while (x < 100); { //note: there is a ';'
//		  x += 10;
//		}
//		System.out.println(x);
		
		//Q3
//		int p = 0;
//		while (p < 6) {
//		  p++;
//		  System.out.print("#");
//		}
		
		//Q4
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int number = input.nextInt();
//		
//		int result=0, i=1;
//		
//		while (i<=number) {
//			result += i;
//			i++;
//		}
//		System.out.println("Sum = " + result);
		
//		//Q5
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int number = input.nextInt();
//		int result=0;
//		for (int i = 1; i <= number; i++){
//		    result += i;
//		}
//		System.out.println("Sum = " + result);
		
		//Q6
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter number of rows: ");
//		int row = input.nextInt();
//		
//		for (int i = row; i >= 1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.printf("%d", row-i+1);
//			}
//			System.out.println();
//		}
		
		//Q7
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter number of rows: ");
//		int row = input.nextInt();
//		
//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.printf("%d", i);
//			}
//			System.out.println();
//		}
		
		// Q8
//       Scanner input = new Scanner(System.in);
//       int guessNum, randNum;
//       Random rand = new Random(30);
//       randNum = rand.nextInt(10);
//       
//       System.out.println("Enter your guess number (0-9):");
//       guessNum = input.nextInt();
//
//       if (guessNum <= randNum) {
//    	   System.out.println("You won.");
//       }
//       else {
//    	   System.out.printf("You lost. My number is %d but your guess is %d.\n",randNum, guessNum);
//       }
       
       // Q9
	    Scanner input = new Scanner(System.in);
	    int firstNum = input.nextInt();
	    input.nextLine();
	    int secondNum = input.nextInt();
	    
	    if (firstNum % 2 == 0){
	    	int total1 = ((firstNum+secondNum) / 2);
	    	System.out.printf("Average is %d.00", total1);
	    } else {
		    double total = ((firstNum+secondNum) / 2.00);
		    total = Math.round(total);

		    System.out.printf("Average is %.2f", total);
	    }
	    

	    
       
        
		

		
	}
}
