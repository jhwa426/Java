
public class Q02 {

	public static void main(String[] args) {
		System.out.println(getSumSecondAndSecondLast(new int[]{1,2,3,4,5,6,7}));
		System.out.println(getSumSecondAndSecondLast(new int[]{1, 2, 3}));

	}
	
	public static int getSumSecondAndSecondLast(int[] numbers) {
		int result = 0, second = 0, secondToLast = 0;
		

		if (numbers.length > 3) {
			second = numbers[1];
			secondToLast = numbers[numbers.length-2];
			result = second + secondToLast;
			}
		else {
			second = numbers[1];
			result = second * 2;
			
		}
		
		
		return result;
	}

}
