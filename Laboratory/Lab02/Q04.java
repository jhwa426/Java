import java.util.Arrays;

public class Q04 {

	public static void main(String[] args) {
//		int[] array = new int[]{1,2,3};
//		shiftByOne(array);
//		System.out.println(Arrays.toString(array));
		
		int[] array = new int[]{7, 6, 5, 3, 4};
		shiftByOne(array);
		System.out.println(Arrays.toString(array));

	}
	
	public static void shiftByOne(int[] numbers) {
		int temp = 0;
		
		temp = numbers[0];
		
		for (int i = 0; i < numbers.length-1; i++) {
			numbers[i] = numbers[i+1];
		}
		
		numbers[numbers.length-1] = temp;
	}

}
