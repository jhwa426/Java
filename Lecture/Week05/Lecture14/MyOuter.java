//Q2
class MyOuter {
	private int number = 0; //instance variable
	
	public MyOuter(int n) { 
		number = n; 
	}
	
	public void setNumber(int n) { 
		number = n; // here is that we can use this. to call instance variable in class.
		//this.number = n;
	}
	// non static 
	class Inner {
		public void printMessage() {
			System.out.printf("number is %d\n", number); //but we can not use this. because the number is instance variable.
		}
	}
}
