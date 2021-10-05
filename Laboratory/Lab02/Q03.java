import java.util.Arrays;

public class Q03 {

	public static void main(String[] args) {
//		int[] array = new int[]{3, 7, 1};
//		addToArray(array, 2);
//		System.out.println(Arrays.toString(array));
		
		int[] array = new int[]{-5, 6, 9, 6, 7, -5, 1, -4, 7, 5};
		addToArray(array, 2);
		System.out.println(Arrays.toString(array));

	}
	
	public static void addToArray(int[] numbers, int value) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] += value;
		}
		
	}

}
