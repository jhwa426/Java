import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		System.out.println(getLongestWordFromFile("data.txt"));

	}
	
	public static String getLongestWordFromFile(String filename)  {
	    String str = "";
	    String[] line;
		Scanner fileInput = null;
		
		try {
			fileInput = new Scanner(new File(filename));
			
			while (fileInput.hasNextLine()) {
				line = fileInput.nextLine().split(" ");
				for (int i=0; i<line.length; i++) {
					if(line[i].length() > str.length()) {
						str = line[i];
					}
				}
			}
		} catch (IOException ie) {
			System.out.printf("ERROR: The file '%s' does not exist.",filename);
		} catch (Exception e) {
			
		}
		 finally {
			if (fileInput!= null)
			fileInput.close();
			return str;
		}
		

	}

}

