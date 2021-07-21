import java.awt.Point;

// 21.07.2021 Lecture 2
public class Lec02 {

	public static void main(String[] args) {
		int value;
		value = 5;
		
		double value2 = 7;
		
		System.out.println(value);
		System.out.println(value2);
		
		String $letter = "Jeff";
		System.out.println($letter);
		
		char letter = 'a';
		System.out.println(letter);
		
		float number;
		number = 23.25F; //or (float) 23.25
		System.out.println(number);
		
		double number2;
		number2 = 23.25;
		System.out.println(number2);
		
		String x = "Hello";
		System.out.println(x);
		
		String s1 = new String("candide");
		String s2 = s1.replace('d', 'p');
		
		System.out.println(s1);
		System.out.println(s2);
		
		Point b = new Point(10, 20); // import java.awt.Point;
		System.out.println(b);
		
		
		int n1 = 5;
		double d = 4.999;
		System.out.println(n1);
		System.out.println(d);
		
		int n2 = (int) d;
		System.out.println(n2);
		double d2 = (double) n1;
		System.out.println(d2);
		
		
		String input = "12";
		int stringToNum = Integer.parseInt(input);
		System.out.println(stringToNum);
		
		String guess = "3.1415";
		double stringToDouble = Double.parseDouble(guess);
		System.out.println(guess);
		
		
	}

}
