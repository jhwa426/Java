class Q4 {
	public static int getSum(String[] values) {
	    int result = 0;
	    
	    try {
		    for (String s: values)
		        result += Integer.parseInt(s);
	    } catch (Exception ex) {
	    	System.out.println("Error: Invalid value!");
	    	System.out.println(ex.toString());
	    }
	    return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array = new String[]{ "1", "2", "A", "B", "4"};
		System.out.println("The result is: " + getSum(array));
	}
}
