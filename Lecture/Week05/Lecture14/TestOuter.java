//Q1
class TestOuter {
	private static int number = 30;
	
	public static void setNumber(int n) { 
		number = n; 
	}
	// nested class
	public static class MyInner {
		public static void printMessage() {
			System.out.printf("number is %d\n", TestOuter.number);
		}
		
	}

}
