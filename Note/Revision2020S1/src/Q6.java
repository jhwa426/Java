import java.util.Arrays;

public class Q6 {
	
	public static int[] getZip(int[] array1, int[] array2) {
		int[] result = new int [array1.length + array2.length];
		
		int size = 0;
		
		
		if (array1.length > array2.length) {
			size = array1.length;
		}
		else {
			size = array2.length;
		}
		
		for(int i=0, j=0; i < size; i++) {
			if(i<array1.length && i < array2.length) {
				result[j++] = array1[i];
				result[j++] = array2[i];
			}
			else if (i<array1.length) {
				result[j++] = array1[i];
			}
			else {
				result[j++] = array2[i];
			}

		}
	
		return result;
	}

	public static void main(String[] args) {
		int[] array1 = new int[]{1,2};
		int[] array2 = new int[]{10,20,30,40};
		System.out.println(Arrays.toString(getZip(array1 , array2 )));

	}

}
