import java.util.ArrayList;
import java.util.Arrays;

class Q10 {
	public static void to_uppercase(ArrayList<String> words){
		for(int i=0; i<words.size(); i++) {
			words.set(i, words.get(i).toUpperCase());
		}
		
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("allan");
		words.add("peter");
		words.add("paul");
		to_uppercase(words);
		System.out.println(words);

	}

}
