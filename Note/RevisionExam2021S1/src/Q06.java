
public class Q06 {

	public static void main(String[] args) {
//		int[][] source = {{2, 4, 16, 80, 27}, {1, 4, 120, 18, 77}, {20, 14, 70, 8, 130}};
//		System.out.println(sum_over(source , 50));
		
		
		int[][] source  = {{2, 4}, {1, 4, 8, 7}, {20, 14, 70, 8, 130}};
		System.out.println(sum_over(source , 15));

	}

	public static int sum_over(int[][] numbers, int target) {
		int result = 0;
		
		for (int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				if(numbers[i][j] > target) {
//					System.out.println(numbers[i][j]);
					result += numbers[i][j];
				}
			}
		}
		return result;
	}
}
