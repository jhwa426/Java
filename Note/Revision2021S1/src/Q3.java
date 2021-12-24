enum RankType { 
	TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE; 
} 
class Q3 {
	
	public static void shuffledCards (int[] array, int n) {
		int index = 0;
		
		for (int i = 0; i < n; i++) {
			int value = array[i];
			 System.out.print(RankType.values()[value]+ " ");
			
		}
	}
	
	
	public static void main(String[] args) {
		int[] shuffled = new int[]{ 9, 2, 1, 10, 7, 5, 3, 12, 11, 0, 4, 6, 8 };
		shuffledCards(shuffled, 4);

	}

}
