import java.awt.Point;
import java.util.Scanner;

// 21.07.2021 Lecture 2
public class Lec02 {
	// LECTURE QUIZ
	enum Weekday {
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY
		}
	
	public static void main(String[] args) {
//		int value;
//		value = 5;
//		
//		double value2 = 7;
//		
//		System.out.println(value);
//		System.out.println(value2);
//		
//		String $letter = "Jeff";
//		System.out.println($letter);
//		
//		char letter = 'a';
//		System.out.println(letter);
//		
//		float number;
//		number = 23.25F; //or (float) 23.25
//		System.out.println(number);
//		
//		double number2;
//		number2 = 23.25;
//		System.out.println(number2);
//		
//		String x = "Hello";
//		System.out.println(x);
//		
//		String s1 = new String("candide");
//		String s2 = s1.replace('d', 'p');
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		
//		Point b = new Point(10, 20); // import java.awt.Point;
//		System.out.println(b);
//		
//		
//		int n1 = 5;
//		double d = 4.999;
//		System.out.println(n1);
//		System.out.println(d);
//		
//		int n2 = (int) d;
//		System.out.println(n2);
//		double d2 = (double) n1;
//		System.out.println(d2);
//		
//		
//		String input = "12";
//		int stringToNum = Integer.parseInt(input);
//		System.out.println(stringToNum);
//		
//		String guess = "3.1415";
//		double stringToDouble = Double.parseDouble(guess);
//		System.out.println(guess);
		
		
//		// lec 2 quiz 03
		Weekday a_day = Weekday.FRIDAY;
		System.out.println(a_day);
		
		System.out.println("1234567890123456789012345");
		double x = 27.5, y = 33.785;
		System.out.printf("x=%10.4f y=%10.2f%n", x, y);
//		
//		// lec 2 quiz 04
	    int value = 12;
	    String myString = "" + 12; // this is how change to string value from integer.
	    System.out.println(myString);

	    String myValue = "123"; 
	    String myInt = myValue;
	    System.out.println(myInt);
		
	    String phrase = "123";
	    int c = Integer.parseInt(phrase);
	    System.out.println(c*2);
	    
	    // lec 2 quiz 08
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a radius: ");
	    
	    double radius = sc.nextDouble();
	    
	    double perimeter = 2 * Math.PI * radius;
	    double area = Math.PI * radius * radius;
	    
	    
	    System.out.printf("Perimeter is = %.2f\n", perimeter);
	    System.out.printf("Area is = %.2f\n", area);
	    
	    sc.close();
		
//		String myValue = "123";
//		int myInt = Integer.parseInt(myValue);
//		
//		System.out.println(myInt);
//		
//		int value = 12;
//		String myString = "" + value;
		
		System.out.println(myString);
		
		// lec 2 quiz 11
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num1 = sc1.nextInt();
		sc1.nextLine();
		
		System.out.println("Enter another number: ");
		int num2 = sc1.nextInt();
		
		System.out.printf("The sum is %d.", num1 + num2);
		
		sc1.close();

		
		
	}

}
