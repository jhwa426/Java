import java.util.ArrayList;

public class Q09 {

	public static void main(String[] args) {
		ArrayList<Integer> result = getSmallerThan(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2}, 5);
		System.out.println(result);

	}
	
	public static ArrayList <Integer> getSmallerThan(int[] numbers, int m) {
		ArrayList <Integer> list = new ArrayList<Integer> ();
		
		for (int i = 0; i<numbers.length; i++) {
			if(numbers[i] < m) {
				list.add(numbers[i]);
			}
		}
		
		
		return list;
		
	}

}
