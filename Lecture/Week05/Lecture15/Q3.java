import java.util.Scanner;

class Q3 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		    Scanner input = new Scanner(System.in);
		    int[] array = {1, 2, 3};
		    System.out.println("Enter an index: ");
		    int index = input.nextInt();

		    System.out.println("The value is " + array[index]);
		}

	    catch (Exception e) {
	    	System.out.println("ERROR: Invalid index!");
	    	}
	}
	
}
