import java.util.Arrays;

public class test {
	
	public static int[][] generate2DArray(int i) {
		int[][] dimArray = new int[i][];

		for (int row = 0; row < i; row++) {
			dimArray[row] = new int[row+1];
			for (int column = 0; column < row+1; column++) {
				dimArray[row][column] = column+1;
			}
		}
		
		
		return dimArray;
	}

	public static void main(String[] args) {
		int[][] result = generate2DArray(6);
		for (int[] array: result) System.out.println(Arrays.toString(array));

	}

}
