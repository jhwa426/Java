import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 8. Summary note
public class Tutorial8 {

	public static void main(String[] args) {
//		System.out.println("Hello \"World\"!");
//		System.out.println("\\" + " //" + " -=-" + " \\\\" + " /");
//		System.out.println("//"); // "//"
//		System.out.println("\\"); // "\"
//		System.out.println("Alive is \"awesome\"!!");

		/*
		Scanner inputNum = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int num1 = inputNum.nextInt();
		System.out.println("Your number is " + num1 + ".");
		inputNum.close();
		*/
		
		
		File inputFile = new File("input.txt");
		try {
			Scanner input = new Scanner(inputFile);
			while(input.hasNextInt())
			{
				System.out.println(input.nextInt() * 100);
			}
		} catch (FileNotFoundException e) {
			System.out.print("The file cannot be found!");
			e.printStackTrace();
		}
		
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
