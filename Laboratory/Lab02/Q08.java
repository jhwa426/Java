import java.util.ArrayList;

public class Q08 {

	public static void main(String[] args) {
//		ArrayList<Integer> result = getMultipleOf3ButNot5(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2});
//		System.out.println(result);
		ArrayList<Integer> result = getMultipleOf3ButNot5(new int[]{-5, -1, 1, 5});
		System.out.println(result);

	}
	
	public static ArrayList <Integer> getMultipleOf3ButNot5(int[] numbers) {
		ArrayList<Integer> result = new ArrayList<Integer> ();
		
		
		for (int i = 0; i < numbers.length; i++) {
			if ((numbers[i] % 3 == 0) && (numbers[i] % 5 != 0)) {
				result.add(numbers[i]);
			}
		}
		
		
		
		
		return result;
	}
}
