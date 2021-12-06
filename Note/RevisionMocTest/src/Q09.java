import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q09 {
	public static void double_reverse(String[] words) {
		
		for(int i=0; i<words.length; i++) {
			words[i] = new StringBuilder(words[i]).reverse().toString();
		}
		
		Collections.reverse(Arrays.asList(words));
	}
	
	public static void main(String[] args) {
		String[] source = {"main", "repeat", "static", "final", "private", "protected"};
		double_reverse(source);
		System.out.println(Arrays.toString(source));

	}

}
