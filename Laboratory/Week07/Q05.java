import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		System.out.println(getLetterFreqFromFile("error.txt", 'p'));

	}
	
	public static int getLetterFreqFromFile(String filename, char target){
	    Scanner fileInput = null;
	    String line= null;
	    int count=0;
	    try {
	    	fileInput = new Scanner(new File(filename));
	        
	    	while (fileInput.hasNextLine()) {
	    		line = fileInput.nextLine();
	    		for (int i=0; i<line.length(); i++) {
	    			if(line.charAt(i) == target) {
	    				count += 1;
	    			}
	    		}
	    	}
	    } catch (IOException ie) {
			System.out.printf("ERROR: The file '%s' does not exist.\n",filename);
		} finally {
	        if (fileInput!= null)
		        fileInput.close();
		    return count;
	    }
	}

}
