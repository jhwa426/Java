
public class Q02 {
	public static void main(String[] args) {
		String data = get_first_mid_last(new String[]{"Japan", "America"});
		System.out.println(data);
		
		System.out.println(get_first_mid_last(new String[]{"hello", "world", "nice", "weather"}));
	}
	
	public static String get_first_mid_last(String[] words_array) {
		StringBuffer str = new StringBuffer();
		
		for(int i=0; i<words_array.length; i++) {
			String word = words_array[i];
			
			char first = word.charAt(0);
			char last = word.charAt(word.length()-1);
			
			
			int size = words_array[i].length() / 2;
			char mid = word.charAt(size);

			
			str.append(first);
			str.append(mid);
			str.append(last);
			
		}
		return str.toString();
	}
}
