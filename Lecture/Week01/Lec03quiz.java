import java.util.Scanner;

public class Lec03quiz {
  public static void main(String[] args) {
	 //Q1
//	 int num1=100, num2=1, num3;
//	 num3 = num2++ + ++num1;
//	 System.out.print(" num1=" + num1); //101
//	 System.out.print(" num2=" + num2); //2
//	 System.out.print(" num3=" + num3); //102
	  
	//Q2
//	 int a, b;
//	 double c;
//	 
//	 System.out.println(7 + 1 + "4 * 2" + 3 + 1);
//	 System.out.println("5" + (7 + 1) + 3 * 2 + 1);
//	 
//	 a = 5;
//	 b = a / 3 + 1;
//	 c = a / b;
//	 
//	 System.out.println(a + ", " + b + ", " + c);   
	 
	 //Q3
//	 int val1 = 50;
//	 int val2 = 53;
//	 
//	 System.out.println("1. " + (val1 != val2));
//	 System.out.println("2. " + (val1 >= val2 - 3));
//	 System.out.println("3. " + (67 % 2 == 1));
	  
	//Q4
//	 int value = 12, x = 0, y = 3;
//	 boolean result;
//	 
//	 result = value>10 || value<=5 && value!=12;
//	 System.out.println("1. " + result); //true
//
//	 result = (value>10 || value<=5) && value!=12;
//	 System.out.println("2. " + result); //false
//
//	 System.out.print("3: ");
//	 System.out.println(x == 0 || (y / x) == 3); //true
//
//	 System.out.print("4: ");
//	 System.out.println(x != 0 && (y / x) == 3); //false
	  
	  
	//Q5
//	Scanner input = new Scanner(System.in);
//	int april, may, june;
//	double average;
//	
//	System.out.println("Rainfall for April: ");
//	april = input.nextInt();
//
//	System.out.println("Rainfall for May: ");
//	may = input.nextInt();
//	
//	System.out.println("Rainfall for June: ");
//	june = input.nextInt();
//	
//	average = (april + may + june) / 3.0; //ERROR here
//	System.out.printf("Average rainfall: %.2f", average);
	  
	 //Q6
//	    Scanner input = new Scanner(System.in);
//	    System.out.println("Enter a score: ");
//	    int score = input.nextInt();
//	    
//		if (score <= 60)
//			System.out.println('D');
//		else if (score < 75)
//			System.out.println('C');
//		else if (score < 90)
//			System.out.println('B');
//		else 
//		    System.out.println('A');
	  
	  //Q7
//	 Scanner input = new Scanner(System.in);
//	 System.out.println("Enter a grade: ");
//	 String grade = input.next();
//		switch(grade) {
//			case "A" :
//			   System.out.println("Excellent!");
//			   break;
//			case "B" :
//				System.out.println("Well done!");
//				break;
//			case "C" :
//				System.out.println("You passed!");
//				break;
//			case "D" :
//			   System.out.println("Better try again");
//			   break;
//			default :
//			   System.out.println("Invalid grade!");
	  //Q8
//      Scanner input = new Scanner(System.in);
//      System.out.println("Enter a temperature: ");
//      int temperature = input.nextInt();
//      String message;
//      if (temperature>20){
//          message = "Take off your jacket!";
//      }
//      else
//        message = "Wear a coat!";
//      System.out.println(message);
	  
	  //Q9
//	  Scanner input = new Scanner(System.in);
//	  System.out.println("Enter an amount in NZ dollars: ");
//	  double dollar = input.nextDouble();
//	  double currency = 0.95;
//	  
//	  double result = dollar * currency;
//	  
//	  System.out.printf("NZ $%.1f = AUS $%.1f", dollar, result);
	  
	  //Q10
//	  Scanner input = new Scanner(System.in);
//	  System.out.println("Enter the length: ");
//	  int length = input.nextInt();
//	  input.nextLine();
//	  
//	  System.out.println("Enter the width: ");
//	  int width = input.nextInt();
//	  input.nextLine();
//	  
//	  System.out.println("Enter the height: ");
//	  int height = input.nextInt();
//	  input.nextLine();
//	  
//	  int surfaceArea = 2 * (width * length) + 2 * (length * height) + 2 * (height * width);
//	  
//	  System.out.printf("A rectangular prism with length %d width %d and height %d has a surface area of %d square units.", length, width, height, surfaceArea);
//	  
//	  input.close();
	  
	  //Q11
//	  Scanner input = new Scanner(System.in);
//	  System.out.println("Enter a year: ");
//	  int year = input.nextInt();
//	  
//	  if (year % 4 == 0 && !(year % 100 == 0) || (year % 400 == 0)) {
//		  System.out.printf("%d is a leap year.", year);
//	  }
//	  else {
//		  System.out.printf("%d is not a leap year.", year);
//	  }
	  
	  //Q12
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = input.nextInt();
	
	if (number % 5 == 0 && number % 11 == 0) {
		 System.out.printf("%d is divisible by 5 and 11.", number);
	}
	else {
		System.out.printf("%d is not divisible by 5 and 11.", number);
	}
	

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
  }
}