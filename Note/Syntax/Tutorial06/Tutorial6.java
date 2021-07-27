//6. IF statement and for statement 2
public class Tutorial6 {

	final static int N = 30;
	
	public static void main(String[] args) {
		

//		int score = 50;
//		
//		if(score >= 90) {
//			System.out.println("A+");
//		} 
//		else if (score >= 80) {
//			System.out.println("B+");
//		}
//		else if (score >= 70) {
//			System.out.println("C+");
//		}
//		else if (score >= 60) {
//			System.out.println("D+");
//		}
//		else {
//			System.out.println("FALE");
//		}
		
//		String a = "Men";
//		int b = 0;
//		
//		if(a.equals("Man")) {
//			System.out.println("Men");
//		}
//		else {
//			System.out.println("Women");
//		}
//		
//		if (b == 3) {
//			System.out.println("3");
//		}
//		else {
//			System.out.println("WRONG");
//		}
//		
//		if (a.equalsIgnoreCase("men") && b == 0) {
//			System.out.println("All good");
//		}
//		else {
//			System.out.println("Not good");
//		}
//		

		// While statement
		
//		int i = 1, sum = 0;
//		while (i <= 1000) {
//			sum += i++;
//		}
//		System.out.println(sum);
		
		// For statement
		for (int i = N; i > 0; i--) {
			for (int j = i; j > 0; j --) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		 for (int i = -N; i <= N; i++) 
		 {
			 for(int j = -N; j <= N; j++) 
			 {
				 if(i * i + j * j <= N * N) 
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
		
		
	}

}
