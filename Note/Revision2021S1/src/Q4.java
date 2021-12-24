import java.util.ArrayList;

public class Q4 {
	
//	public static int indexOfMostdistant(int[] array, int number) {
//		if ((number < 0 ) || (number >= array.length)) {
//			number = 0;
//		}
//		
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		
//		for (int i = 0; i<array.length; i++) {
//			if (array[i] < 0) {
//				numbers.add(Math.abs(array[i]));
//			}
//			else {
//				numbers.add(array[i]);
//			}
//		}
//
//		int result = 0;
//		for (int i = 0; i<numbers.size(); i++) {
//			if(numbers.get(i) > result) {
//				result = numbers.get(i);
//			}
//		}
//		
//		int getIndex = numbers.indexOf(result);
//
//		return getIndex;
//	}
	
	public static int indexOfMostdistant(int[] array, int number) {
		if ((number < 0 ) || (number >= array.length)) {
			number = 0;
		}
		int numIndex = 0;
		int[] numArr = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {

		}
		
		//Comparison
		int compare = 0;
		
		for (int i = 0; i < numArr.length; i++) {
			if(numArr[i] > compare) {
				compare = numArr[i];
				numIndex = i;
			}

		}
		
		return numIndex;		
	}
	
	
	

	public static void main(String[] args) {
		int[] array1 = {20, -3, 6, 9, 6, -5};
		int index = indexOfMostdistant(array1, 7);
		System.out.printf("The index is: %d and the value is: %d\n", index, array1[index]);
		
		int[] array2 = {10, -30, 62, 91, -10};
		int index2 = indexOfMostdistant(array2, -5);
		System.out.printf("The index is: %d and the value is: %d", index2, array2[index2]);

	}

}
