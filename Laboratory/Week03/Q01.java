
public class Q01 {

	public static void main(String[] args) {
		//Q1
//		int[] myArray = new int[]{0, 3, -3, 10, 2, 10};
//		System.out.printf("The count is: %d\n", countSmaller(myArray, 2));
		
		int[] myArray = new int[]{8, 1, -8, 7, 4, 8, -3, 8, 8};
		System.out.printf("The count is: %d\n", countSmaller(myArray, -8));

	}
	
	// Q1
	public static int countSmaller(int[] numbers, int n) {
		
	int count = 0;
	
	for (int i = 0; i < numbers.length; i++) {
		if (numbers[i] < n) {
			count += 1;
			}
		}
        
   	return count;
	}

}
