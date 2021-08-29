class Q5 {
	public static int getSum(String[] values) {
		int result = 0;
		for (int i = 0; i < values.length; i++) {
			try {
				result += Integer.parseInt(values[i]);
			} catch (Exception ex) {
				
			}
		}	
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = new String[]{ "1", "2", "A", "B", "4"};
		System.out.println("The result is: " + getSum(array));
	}

}
