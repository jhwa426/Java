import java.util.ArrayList;
import java.util.Arrays;

public class Q1 {

	public static ArrayList<Integer> merge2DintoList(int[][] numbers){
		ArrayList<Integer> result = new ArrayList<Integer> ();
		
		for(int i = 0; i<numbers.length; i++) {
			for(int j = 0; j<numbers[i].length; j++) {
				result.add(numbers[i][j]);
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		int[][] array = new int[][] { {1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
		System.out.println(merge2DintoList(array));
		for (int[] row: array) System.out.println(Arrays.toString(row));

	}

}
