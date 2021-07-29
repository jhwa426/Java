
public class Lec05quiz {

	public static void main(String[] args) {
		System.out.println(calculateMax(3, 4));
		System.out.println(calculateMax(3, 4, 6));
	}
	// Q5
	public static int calculateMax(int number1, int number2) {
		return Math.max(number1, number2);
	}
	
	public static int calculateMax(int number1, int number2, int number3) {
		return Math.max(Math.max(number1, number2), Math.max(number2, number3));
	}

}
