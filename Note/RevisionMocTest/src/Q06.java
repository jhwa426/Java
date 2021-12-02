class Q06 {
	public static int countEvenInTwoD(int[][] numbers) {
		int count = 0;
		
		for (int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				if (numbers[i][j] % 2 == 0) {
					count += 1;
				}
			}
		}		
		return count;
	}

	public static void main(String[] args) {
		int[][] nums = {{0, 1, 2, 3}, {2, 4, 6, 8}, {3, 6, 9, 12}};
		System.out.println(countEvenInTwoD(nums));
		
		int[][] nums2 = {{3}, {2, 4, 6}, {3, 6}, {3, 6, 9, 12}};
		System.out.println(countEvenInTwoD(nums2));

	}

}
