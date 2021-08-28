import java.io.File;
import java.util.*;

public class FileReadNames {
  public static void main(String[] args) {
	Scanner input = null;
	try {
	  input = new Scanner(new File("names.txt"));
	  input.useDelimiter(",");
	  while (input.hasNext()) {
		System.out.println(input.next());
	  }

	} catch (Exception e) {
	  e.printStackTrace();
	} finally {
	 input.close();
	}
  }
}