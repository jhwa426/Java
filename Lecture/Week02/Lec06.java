import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;

public class Lec06 {
	// 30.07.2021
	public static void main(String[] args) {
		//Ex 01
//		int[] ages = new int[10];
//		System.out.println(ages.length);
//		
//		for (int i = 0; i<ages.length; i++) {
//			System.out.println(i);
//		}

		// Ex02
//		int[] courseMark = new int[10];
//		courseMark[2] = 95;
//		System.out.println(courseMark[2]); //95
//		System.out.println(courseMark.length); //10
		
		// creating array
//		String[] name;
//		int[] ages = new int[10];
//		
//		for (int i = 0; i<10; i++) {
//			ages[i] = i;
//			System.out.println(ages[i]);
//		}
		
		// creating array2
//		int[] array = new int[] {2, 4, 6, 8, 10};
////		int[] array = {2, 4, 6, 8, 10};		
//		for(int value: array) {
//			System.out.printf("%5d\n", value);
//		}
		
		// Ex 03
//		int[] a = new int[] {0, 1, 2};
//		int[] b = new int[] {0, 1, 2};
//		if (b == a)
//			   System.out.println("Equal");
//		else
//			 System.out.println("Not Equal");
		
		// Ex 04
//		int[] src =  {1,2,3};
//		int[] copy = new int[3];
//		System.arraycopy(src,0, copy, 0, 2); // (Object src, int srcPos, Object dest, int destPos, int length)
//		for (int i=0; i<copy.length; i++)
//		  System.out.println(copy[i]);
//		
//		if (copy == src) //checking reference
//			  System.out.println("Equal");
//			else
//			  System.out.println("Not Equal");
		
		
		// Ex 05
//		int[] array = {0, 2, 4};
//		for (int value: array)
//			value += 2; 
//		System.out.println(Arrays.toString(array));
		
//		int[] array = {0, 2, 4};
//		for (int counter=0; counter<array.length; counter++)
//			array[counter] += 2; 
//		System.out.println(Arrays.toString(array));
		
//		int[] array = {0, 2, 4};
//		for (int value: array) {
//			value += 2;
//			System.out.printf("%d ", value);
//		}
//		 
//		System.out.println(Arrays.toString(array));
		
		
		// Ex 06
//		int myNumber = 12345;
//		String myString = "testing"; System.out.
//		println("myNumber before call = "+myNumber); 
//		changeMyNumber(myNumber);
//		System.out.println("myNumber after call = "+myNumber);
		
		// Ex 07
//		double d1 = 10.0, d2 = 20.0, d3 = 30.0;
//		System.out.printf("Average %.1f%n", average(d1, d2)); 
//		System.out.printf("Average %.1f%n", average(d1, d2, d3));
		
		// Ex 08
//		int[][] y = { {1,2,3}, {4,5,6}};
//		int[][] x = new int [4][];
//		int[][] twoD = new int [5][7]; // five rows and seven columns
//		int[][][] threeD = new int [2][3][4];
//		int[][][][] fourD = new int [2][3][768][1024];
//		
//		int[] a1 = {10,12,14};
//		int[] a2 = {20,22,24};
//		int[][] a3 = {a1, a2}; // two rows and three columns
//		
//		System.out.println(twoD.length);
//		System.out.println(twoD[0].length);
		
		int[][] y = { {1,2,3}, {4,5,6} };
		for (int row = 0; row < y.length; row++) {
			for (int col = 0; col < y[row].length; col++)
			  System.out.print(y[row][col] + " ");
				System.out.println();
		}
		
		Point[] p = new Point[3];
		p[0] = new Point(10, 20);
		p[1] = new Point(20, 30);
		p[2] = new Point(30, 40);
		
		for (int i=0; i<p.length; i++)
			System.out.println(p[i].toString());
		
		Point[] copy = p;
		
		copy[0].x = 100;
		for (int i=0; i<copy.length; i++)
		System.out.println(p[i].toString());
		
		System.out.println();
		System.out.println();
		
		ArrayList<String> list = new ArrayList<String>();
//		list.add("One");
//		list.add("Two");
//		list.add( 1, "Fred" );
		
		System.out.println(list);
//		list.clear();
//		System.out.println(list);
		
		for (int i = 0; i<=10; i++) {
			String s = "" + i;
			list.add(i, s);
		}
		
		System.out.println(list);
		
//		list.remove(0);		
//		for (int i = 0; i<=5; i++) // odd
		for (int i = 1; i<=5; i++) { //even
			list.remove(i);
		}
		System.out.println(list);
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		

	}
		
	// Ex 06
	public static void changeMyNumber(int justACopy){ 
		justACopy = 10;
		System.out.println("justACopy = "+justACopy);
	}
	// Ex 07
	public static double average(double... numbers) { //(only ... three)
		double total = 0;
		for (double d: numbers)
		  total += d;
		return total/numbers.length;
	}
	
}
