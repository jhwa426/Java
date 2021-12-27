import java.util.ArrayList;

public class Q3 {

	public static void main(String[] args) {
		int[][] data = new int[][]{ new int[]{1, 2}, new int[]{4}, new int[]{5, 6}};
		ArrayList<Integer> result = collapse_values(data);
		System.out.println(result);
		
//		int[][] data = new int[][]{ new int[]{11,3, -4, 2}, new int[]{4, -2}, new int[]{5, 3}, new int[]{5, 16, -3, 87, 12, 9}};
//		ArrayList<Integer> result = collapse_values(data);
//		System.out.println(result);

	}
	
	public static ArrayList<Integer> collapse_values(int[][] data){
		 ArrayList<Integer> num = new ArrayList<Integer> ();
		 
		 for (int i=0; i<data.length; i++) {
			 int result = 0;
			 for(int j=0; j<data[i].length; j++) {
				 result += data[i][j];
			 }
			 num.add(result);
		 }
		 
		 return num;
	}

}
