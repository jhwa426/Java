import java.util.ArrayList;
import java.util.Arrays;

class Q11 {
	public static void removePositives(ArrayList<Integer> numbers) {
	    for (int i=0; i<numbers.size(); i++) {
	    	if(numbers.get(i) >= 0) {
	    		numbers.remove(i);
	    		i -= 1;
	    	}
	    }
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> a_list = new ArrayList<>(Arrays.asList(9, 21, 6, -34, 29, 1, -4));
		removePositives(a_list);
		System.out.println(a_list);

	}

}
