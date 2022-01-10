//Q1
enum SuitType { 
	CLUB, DIAMOND, HEART, SPADE; 
}
enum RankType { 
	TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
} 

class Card {
	private RankType rank = RankType.TWO;
	private SuitType suit = SuitType.CLUB;
	
	//A default constructor which creates a card using default values.
	public Card() {
		this.rank = RankType.TWO;
		this.suit = SuitType.CLUB;
	}
	
	//An overloaded constructor which creates a card by the given suit type and rank type.
	public Card(SuitType suit, RankType rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public String toString() {
		String str = String.format("%s-%s", this.suit, this.rank);
		return str;
	}

}
