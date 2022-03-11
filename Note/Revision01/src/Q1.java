class Q1 {
	
	public static String getSignature(String word) {
		StringBuffer result = new StringBuffer(word);

		return result.toString();
	}

	public static void main(String[] args) {
		// Q1
		System.out.println(getSignature("potato")); //3
		System.out.println(getSignature("COMPUTER")); //4
		System.out.println(getSignature("Hello"));

	}
	

}
