import java.util.ArrayList;

public class Q5 {

	public static void main(String[] args) {
//		ArrayList<String> words = new ArrayList<String>();
//		words.add("apple");
//		words.add("hello");
//		words.add("onetwothree");
//		removeEndWithA(words);
//		System.out.println(words);
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("one");
		words.add("extra");
		words.add("two");
		words.add("hint");
		removeEndWithA(words);
		System.out.println(words);

	}
	
	public static void removeEndWithA(ArrayList<String> words) {
		for (int i=0; i<words.size(); i++) {
			String word = words.get(i);
			char temp = word.charAt(word.length()-1);
			String str = Character.toString(temp);
			if(str.contains("a")){
				words.remove(words.get(i));
				i -= 1;
			}
		}
		
	}

}
