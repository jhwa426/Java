// Q6
public class Lec05quiz2 {
	public static void main(String[] args) {
		show(3, 4);
		show("3", 4);
		
	}
	
	public static void show(String value, int repeat) {
		for (int i = 0; i < repeat; i++) {
			System.out.print(value);
		}
	}
	
	public static void show(int value, int value2) {
		System.out.println(value + value2);
	}
	
	
}
