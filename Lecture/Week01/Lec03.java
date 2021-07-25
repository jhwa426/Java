import java.util.Scanner;

// 23.07.2021 Lecture 03
public class Lec03 {

	public static void main(String[] args) {
		int number1 = 10 / 4; // 2
		double number2 = 10 / 4; // 2.0
		System.out.println(number1);
		System.out.println(number2);
		
		System.out.println();
		
		int i = 0, j = -1;
		j = i++;
		System.out.println(j);
		System.out.println(i);
		
		System.out.println();
		
		int p = 0, q = -1;
		q = ++p;
		System.out.println(q);
		System.out.println(p);
		
		System.out.println();
		
		String phrase = "123";
		int strToInt = Integer.parseInt(phrase);
		System.out.println(strToInt * 2);
		
		System.out.println();
		
		int num1 = 100, num2 = 1, num3;
		num3 = num2++ + ++num1;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		System.out.println();
		
		int s = 1, t = 2;
		s = 5 + (t = 4);
		System.out.println(s);
		
		System.out.println();
		
//	    Scanner sc = new Scanner(System.in);
//	    System.out.println("Enter a radius: ");
//	    
//	    double radius = sc.nextDouble();
//	    
//	    double perimeter = 2 * Math.PI * radius;
//	    double area = Math.PI * Math.pow(radius, radius);
//	    
//	    System.out.printf("Perimeter is = %.2f\n", perimeter);
//	    System.out.printf("Area is = %.2f\n", area);
//	    sc.close();
		
		int a = 10;
		int  value = 5;
//		System.out.println(a < 0 || value > a/0); // error
//		System.out.println(a > 0 || value > a/0); // first statement is true.
		
		
		

	}

}
