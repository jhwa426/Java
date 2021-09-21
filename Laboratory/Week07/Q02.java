
public class Q02 {

	public static void main(String[] args) {
//		double result = getSumEvens(new String[]{"1", "2", "3", "4", "two", "2"});
//		System.out.printf("The result is %.2f", result );

		
		double result = getSumEvens(new String[]{"a", "b"});
		System.out.printf("The result is %.2f", result );
	}
	
	public static double getSumEvens(String[] array) {
		double result = 0;
		
		for(int i=0; i<array.length; i++) {
			try {
				if (Double.parseDouble(array[i]) % 2 == 0) {
					result += Double.parseDouble(array[i]);
				}
				
			} catch (Exception ex) {
				
			}
		}
		return result;
	}

}
