
public class Q01 {

	public static void main(String[] args) {
//		double result = getMax(new String[]{"123", "abc", "124", "2", "def"});
//		System.out.printf("The result is %.2f", result );
		
		double result = getMax(new String[]{"1", "2", "3.5", "4", "-1", "2"});
		System.out.printf("The result is %.2f", result );
		
//		double result = getMax(new String[]{"a", "b", "6", "7", "-6", "100"});
//		System.out.printf("The result is %.2f", result );

	}
	
	public static double getMax(String[] array) {
		double result = 0;
		
		for (int i=0; i<array.length; i++) {
			try {
				if (Double.parseDouble(array[i]) > result) {
					result =  Double.parseDouble(array[i]);
				}
				
			} catch (Exception ex) {
				System.out.println("ERROR: Invalid number!");
				break;
			}
		}
		
		if(result == 0) {
			result = -999;
		}
		
		
		return result;
	}

}