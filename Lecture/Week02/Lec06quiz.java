import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.print.attribute.standard.NumberUpSupported;

// 30.07.2021
public class Lec06quiz {

	public static void main(String[] args) {
		// Q1
//		System.out.println(countEvens(new int[] {2, 4, 16, 80}));
//		System.out.println(countEvens(new int[] {1, 4, 120, 18}));
		
		// Q2
//		System.out.println(getNumberOfDays(12));
//		System.out.println(getNumberOfDays(2));
		
		// Q3
//		int[] numbers = {0, 1, 2};
//		incrementByOne(numbers);
//		System.out.println(Arrays.toString(numbers));

//		int[] numbers = {9, 8, 7, 6, 5};
//		incrementByOne(numbers);
//		System.out.println(Arrays.toString(numbers));
		
		// Q4
//		int[] array = new int[]{1, 2, 3};
//		System.out.println(Arrays.toString(getArrayOfSquares(array)));
		
//		int[] array = new int[]{10, 21, 23};
//		System.out.println(Arrays.toString(getArrayOfSquares(array)));
		
		// Q5
//		int[] array = {0,2,4,6,8};
//		changeArray(array, array[1]);
//		System.out.println(Arrays.toString(array));
		
		// Q6
//		int[][] numbers = {{2, 4, 16, 80, 27}, {1, 4, 120, 18, 7}, {20, 14, 70, 8, 130}};
//		System.out.println(sumOver(numbers, 50));
		
		// Q7
//		String[] array = new String[]{"mobody", "goes", "to", "that", "restaurant", "because", "it", "is", "too", "crowded"};
//		System.out.println(startWithVowelCount(array));
		
		// Q8
//		ArrayList<Point> list = new ArrayList<Point>();
//		Point pt1 = new Point(3, 4); //java.awt.Point[x=3,y=4]
//		list.add( pt1 ); // [java.awt.Point[x=3,y=4]]
//		Point pt2 = (Point) list.get( 0 ); // java.awt.Point[x=3,y=4]
//		pt2.x = 23;
//		System.out.println(pt1); 
//		System.out.println(pt2);
//		
//		System.out.println( pt1 == pt2 );
		
		// Q9
//		ArrayList<Integer> list1 = new ArrayList<Integer>();
//		list1.add(3);
//		list1.add(5);
//		list1.add(8);
//		list1.add(9); // list1 = [3, 5, 8, 9]
//		
//		ArrayList<Integer> list2 = new ArrayList<Integer>();
//		list2.add(6);
//		list2.add(7);
//		list2.add(1);
//		list2.add(2); // list2 = [6, 7, 1, 2]
//		
//		for (int i=0; i<list1.size(); i++) {
//		  list1.set(i,list2.get(i));
//		  list2.set(i,list1.get(i));
//		}
//		System.out.println(list1);
//		System.out.println(list2);
		
		// Q10
		ArrayList<Integer> a_list = new ArrayList<>(Arrays.asList(9, 21, 6, -34, 29, 1, -4));
		removePositives(a_list);
		System.out.println(a_list);
		
		int[ ] x = {55, 33, 88, 22, 99, 11, 44, 66, 77};
		int a = 10;
		if(x[2] > x[5])
		  a = 5;
		else
		  a = 8;
		
		System.out.println(a);
		
		
	}
	
	// Q1
	public static int countEvens(int[] numbers) {
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				count += 1;
			}
		}
		return count;
	}
	// Q2
	public static int getNumberOfDays(int month) {
	    int[] numberOfDays = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	    
	    return numberOfDays[month-1];
	}
	// Q3
	public static void incrementByOne(int[] numbers) {
	    for (int index = 0; index < numbers.length; index++) {
	    	numbers[index] += 1;
	    }
	}
	// Q4
	public static int[] getArrayOfSquares(int[] numbers) {
		int[] numArray = new int [numbers.length];
		for (int i = 0; i<numbers.length; i++) {
//			System.out.println(numbers[i]);
			numArray[i] = numbers[i] * numbers[i];

		}
		return numArray;
	}
	
	// Q5
	public static void changeArray(int[] passedArray, int value){
		  passedArray[value] = 12;
		  value = 5;
	}
	
	// Q6
	public static int sumOver(int[][] values, int target) {
		int total = 0;
		
		for(int row = 0; row < values.length; row++) {
			for(int column = 0; column < values[row].length; column++) {
				if (values[row][column] > target) {
					total += values[row][column];
				}
			}
		}
		return total;
	}
	
	// Q7
	public static int startWithVowelCount(String[] words) {
		int count = 0;
		
		for (int i = 0; i<words.length; i++) {
			if (words[i].startsWith("a") || words[i].startsWith("e") || words[i].startsWith("i") || words[i].startsWith("o") || words[i].startsWith("u")) {
				count += 1;
			}
		}
		return count;
	}
	
	// Q10
	public static void removePositives(ArrayList<Integer> numbers) {
		for (int i=0; i<numbers.size(); i++) {
			if (numbers.get(i) > 0) {
				numbers.remove(i);
				i -= 1;
			}

		}
		
	}
	
}
