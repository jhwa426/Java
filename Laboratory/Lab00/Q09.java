import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);
	      System.out.println("Enter the first integer: ");
	      int first = input.nextInt();
	      System.out.println("Enter the second integer: ");
	      int second = input.nextInt();
	      System.out.println("Enter the third integer: ");
	      int third = input.nextInt();
	      
	      int totalNumber = first + second + third;
	      int maxNumber = Math.max(Math.max(first, second), Math.max(second, third));
	      int minNumber = Math.min(Math.min(first, second), Math.min(second, third));
	      int middleValue = totalNumber - (maxNumber + minNumber);
	      

	      System.out.printf("The numbers in sorted order are: %d, %d, %d.", minNumber, middleValue, maxNumber);
	      
	      input.close();
	      
	}

}
