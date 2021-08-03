import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence: ");

		while (input.hasNext()) {
			String sentence = input.nextLine();
			System.out.println(sentence.toUpperCase());
			
			System.out.println("Enter a sentence: ");

		}
		
	}

}
