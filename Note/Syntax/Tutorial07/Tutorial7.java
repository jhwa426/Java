import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 7. Input & Output
public class Tutorial7 {

	public static void main(String[] args) {
//		// infinite looping for(;;)
//		int count = 0;
//		
//		for (;;) 
//		{
//			System.out.println("Hello World");
//			count++;
//			
//			if (count == 10)
//			{
//				break;
//			}
//		}

//		Scanner sc = new Scanner(System.in); // input function in Python
//		System.out.print("Put your score : ");
//		int i = sc.nextInt();
//		System.out.println("Your score is " + i + ".");

		File file = new File("input.txt");
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt())
			{
				System.out.println(sc.nextInt() * 100);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.print("The file cannot be found!");
		}
		
		
		
	}

}
