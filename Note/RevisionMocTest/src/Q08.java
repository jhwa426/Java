import java.util.ArrayList;
import java.util.Arrays;

class Q8 {
	public static ArrayList<Integer[]> create_arraylist(int size){
		ArrayList<Integer[]> result = new ArrayList<Integer[]>();
		
		for (int i=1; i<size+1; i++) {
			Integer[] data = new Integer[i];
			for (int j = 0; j<i; j++) {
				data[j] = j;
			}
			result.add(data);
		}
		return result;
	}

	public static void main(String[] args) {
		ArrayList<Integer[]> data = create_arraylist(3);
		for (Integer[] row: data)
		  System.out.println(Arrays.toString(row));

	}
}
