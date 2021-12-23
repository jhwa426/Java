import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number1:");
		int num1 = input.nextInt();
		System.out.println("Enter a number2:");
		int num2 = input.nextInt();
		System.out.println("Enter a number3:");
		int num3 = input.nextInt();
		int i;
		int greatest = 1;
		
	    int limit = Math.min(num1, num2);
	    limit = Math.min(limit, num3);
	    
		for(i=limit; i>=1; i--) {
		    if((num1%limit==0) && (num2%i==0) && (num3%i==0)) {
		    	break;
		    }   
		}
		greatest = i;


	    System.out.printf("The greatest common divisor is %d.", greatest);

	}

}
