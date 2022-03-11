
public class Test {

	public static void main(String[] args) {
		OverlapSquare squareOne = new OverlapSquare();
		OverlapSquare squareTwo = new OverlapSquare(110,10);
		System.out.println(squareOne);
		System.out.println(squareTwo);
		System.out.println();
		OverlapSquare squareO = new OverlapSquare(10,10);
		OverlapSquare squareT = new OverlapSquare(20,10);
		squareO.overlaps(squareT);
		System.out.println(squareO);System.out.println(squareT);

	}

}
