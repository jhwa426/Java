

public class Q4 {

	public static void main(String[] args) {
		printMirrorRightAngle(5);

	}
	
	public static void printMirrorRightAngle(int numberOfRows) {
		  
		for(int i=1; i<=numberOfRows; i++) {
			for(int k=numberOfRows-1; k>=i; k --) {
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
