import java.io.File;
//import java.io.IOException; //throws IOException   or try and catch method
import java.util.Scanner;

class Q6 {
	public static String getString(String filename) {
	    Scanner fileInput = null;
	    String line = null;
	    StringBuffer sb = new StringBuffer();
	    
	    try {
	    	// open a file
	    	// read /write information
	    	fileInput = new Scanner(new File(filename));
	    	while (fileInput.hasNextLine()) {
	    		line = fileInput.nextLine();
	    		sb.append(line.charAt(0));
	    	}
	    	
	    } catch (Exception e) {
	    	
	    } 
	    finally {
	        fileInput.close();
	        return sb.toString();
	    }
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getString("words.txt"));

	}

}
