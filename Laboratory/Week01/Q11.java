import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		
		String sentence = input.nextLine();
		char c1 = sentence.charAt(0);
		String c2 = sentence.substring(sentence.length()-1);
		
		System.out.print(c1);
		System.out.print(c2);
		
		
		input.close();
	}

}
