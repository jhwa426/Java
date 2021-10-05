import java.util.ArrayList;
import java.util.Collections;

public class Q10 {

	public static void main(String[] args) {
//		ArrayList<Integer> arrayList = new ArrayList<Integer>();
//		Collections.addAll(arrayList, -4, 9, 6, -3, 2, 1);
//		removeNegativeAndOdds(arrayList);
//		System.out.println(arrayList);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Collections.addAll(arrayList, -5, 6, 9, 6, 7, -5, 1, -4, 7, 5);
		removeNegativeAndOdds(arrayList);
		System.out.println(arrayList);
		

	}
	
	public static void removeNegativeAndOdds(ArrayList<Integer> numbers) {
		for(int i = 0; i < numbers.size(); i++) {
			if((numbers.get(i) < 0) && !(numbers.get(i) % 2 == 0)) {
				numbers.remove(i);
				i -= 1;
			}
		}
	}
}
