import java.util.Arrays;

public class Q05 {

	public static void main(String[] args) {
		
//		String a = "aaa bbb ccc";
//		String[] b = a.split(" ");
//		System.out.println(Arrays.toString(b));
//		
//		String c = b[0];
//		System.out.println(c.charAt(0));
		
		System.out.println(getFirstLetter("java is fun"));
		System.out.println(getFirstLetter("The heavy rain is expected to ease tonight however further showers are expected tomorrow"));
		System.out.println(getFirstLetter("this is a very short sentence but it is also a very useful example"));

	}
	
	public static String getFirstLetter(String sentence) {
		String result = "", letter = "";
		String[] temp = sentence.split(" ");

		for (int i = 0; i<temp.length; i++) {
			
			letter = temp[i];
			result += letter.charAt(0);
			
		}
		return result;
	}
	
}
