
public class Q5 {
	public static int getMaxMultiple(int[] numbers, int m) {
		int result = 0;
		
		for(int i=0; i<numbers.length; i++) {
			int current = numbers[i];
			if(current % m == 0) {
				if(current > result) {
					result = current;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] values = {1, 4, 5, 9, 11};
		System.out.println(getMaxMultiple(values, 3));

	}

}
