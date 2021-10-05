import java.util.ArrayList;
import java.util.Arrays;

public class Q07 {

	public static void main(String[] args) {
		Integer[] array = new Integer[]{ 29, 28, 27, 16, 15, 14, 3, 2, 2};
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(array));
		System.out.println(getSumPositiveEvens(arrayList));

	}
	
	public static int getSumPositiveEvens(ArrayList<Integer> numbers) {
		int total = 0;
		
		for (int i = 0; i < numbers.size(); i++) {
			if ((numbers.get(i) % 2 == 0) && numbers.get(i) > 0) {
				total += numbers.get(i);
			}
		}
		return total;
	}

}
