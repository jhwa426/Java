import java.util.*;
public class L14 {
  public static void main(String args[]){
    ArrayList<Integer> list;
    list = new ArrayList<Integer>();
    list.add(3);
    list.add(3);
    list.add(5);
    Iterator<Integer> it = list.iterator();
    while (it.hasNext())
      System.out.print(it.next() + " ");
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
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
    public Iterator<Integer> iterator() {
    	return new DataStructureIterator();
    }
    public class DataStructureIterator implements Iterator<Integer>  {
    	private int nextIndex = 0;
    	public boolean hasNext() {
        	return (nextIndex <= SIZE - 1);
        }
        public Integer next() {
         Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
         nextIndex += 2;
         return retValue;
         }
     }

}