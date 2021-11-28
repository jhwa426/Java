
public class Q02 {
	public static String getPigLatinify(String word) {
		String str = word.toLowerCase();
		String consonants = "bcdfghjklmnpqrstvwxyz";
		
		if (consonants.indexOf(str.charAt(0)) >= 0) {
			return str.substring(1) + str.charAt(0) + "ay";
		}
		else {
			return str.charAt(0) + str.substring(1) + "yay"; 
		}
	}
	
	
	

	public static void main(String[] args) {
		System.out.println(getPigLatinify("turtle"));
		System.out.println(getPigLatinify("Egg"));
		System.out.println(getPigLatinify("121word"));
		System.out.println(getPigLatinify("programming"));

	}

}
