import java.io.File;
import java.util.*;

public class FileReadExample {
  public static void main(String[] args) {
    Scanner input = null;
    try {
      input = new Scanner(new File("life.txt"));
      while (input.hasNextLine()) {
        System.out.println(input.nextLine());
      }

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
     input.close();
	}
  }
}