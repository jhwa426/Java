import java.util.ArrayList;
import java.util.Arrays;

public class Q07 {

	public static void main(String[] args) {
		String[] names1 = {"John", "Juan", "Jane"};
		ArrayList<String> names2 = new ArrayList<String>(Arrays.asList(names1));
		String p = getLastEntry(names2);
		System.out.println(p);
		
		

	}
	
	public static <T> T getLastEntry(ArrayList<T> list) {
		return list.get(list.size()-1);
	}

}
