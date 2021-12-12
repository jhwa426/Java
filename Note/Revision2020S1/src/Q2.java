import java.util.Scanner;

class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		int count = 0;
		String vowel = "aeiou";
		
		for (int i = 0; i<sentence.length(); i++) {
			if (vowel.indexOf(sentence.charAt(i)) != -1) {
				count += 1;
			}
		}
		
		System.out.printf("The number of vowel letters is %d.", count);
	}
}
