public class Q4 {
	public static String getLastTwoChars(String[] words) {
		String str = "";
		
		for (int i = 0; i<words.length; i++) {
			if (words[i].length() >= 2) {
				str += words[i].charAt(words[i].length()-2);
				str += words[i].charAt(words[i].length()-1);		
			}
		}
		return str;
	}
	
	
	public static void main(String[] args) {
		String[] words = {"started", "Python", "is", "fun", "a", "game"};
		System.out.println(getLastTwoChars(words));

	}

}
