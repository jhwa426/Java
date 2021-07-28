import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		
		int reverse = 0;
		
		while(number != 0)
	    {
	      reverse = reverse * 10;
	      reverse = reverse + number%10;
	      number = number/10;
//	      System.out.println(reverse);
	    }
		
		input.close();
		
		System.out.println(reverse);

	}

}
