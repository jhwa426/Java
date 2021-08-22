import java.util.*;
public class L14_2 {
  public static void main(String args[]){
	DataStructure ds = new DataStructure();
	Iterator<Integer> iterator  = ds.iterator();
	while (iterator.hasNext())
      System.out.print(iterator.next() + " ");
    System.out.println();
  }
}

class DataStructure implements Iterable<Integer>{
  private final static int SIZE = 15;
  private int[] arrayOfInts = new int[SIZE];
  public DataStructure() {
    for (int i = 0; i < SIZE; i++)
      arrayOfInts[i] = i;
  }
  public Iterator<Integer> iterator() {
    return new Iterator() {
   	  private int nextIndex = 0;
      public boolean hasNext() {
        return (nextIndex <= SIZE - 1);
      }
      public Integer next() {
        Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
        nextIndex += 2;
        return retValue;
      }
   };
  }
}