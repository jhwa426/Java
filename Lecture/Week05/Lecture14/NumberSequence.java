//import java.util.*;
//
//class NumberSequence implements Iterable<Integer> {
//  private int maxValue;
//  public NumberSequence(int n) { maxValue = n; }
//  public Iterator<Integer> iterator() { return new NumberIterator(); }
//
//  public class NumberIterator implements Iterator<Integer> {
//   private int nextIndex = 1; //starts at 1
//         public boolean hasNext() {return (nextIndex<maxValue);} //non-inclusive
//         public Integer next() {
//           return new Integer(nextIndex++);
//         }
//       public void remove() { throw new UnsupportedOperationException();}
//  }
//
//  public static void main(String[] args) {
//NumberSequence ds = new NumberSequence(10);
//Iterator<Integer> iterator  = ds.iterator();
//while (iterator.hasNext())
//  System.out.print(iterator.next() + " ");
//
//for (int num : ds)
//System.out.printf("%d ", num);
//
//  }
//}
//
