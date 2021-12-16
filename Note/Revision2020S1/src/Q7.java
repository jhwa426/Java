import java.util.ArrayList;
import java.util.List;

class Q7 {
//	public static ArrayList createLongWordsArrayList(String[] words, int m) {
//		ArrayList<String> strList = new ArrayList <String>();
//		
//		for (int i = 0; i<words.length; i++) {
//			if(words[i].length() > m) {
//				strList.add(words[i]);
//			}
//		}
//		
//		return strList;
//	}
	
	public static ArrayList<String> createLongWordsArrayList(String[] words, int m){
		 ArrayList<String> strList = new ArrayList<String>();
		 for (String word: words) {
			 if (word.length() > m) {
				 strList.add(word);
			 }
		 }
		 return strList;
	}
		
	public static void main(String[] args) {
		String[] words = {"hello", "elephant", "goodbye", "joker", "therefore"};
		List<String> x = createLongWordsArrayList(words, 6);
		System.out.println(x);
	}

}
