//Q7
import java.util.*;

interface Iterator<E> {
  public boolean hasNext();
  public E next();
  public void remove(); 
}

class NumberSequence implements Iterable<Integer> {
  private int maxValue;
  
  public NumberSequence(int n) { 
	  maxValue = n; 
  }
  
  public Iterator<Integer> iterator() { 
    return new OddIterator(); 
  }
  
  //complete the inner member class here.
  class OddIterator implements Iterator<Integer>{
  private int nextIndex = 1; //starting point
  
  public boolean hasNext() {
	  if (this.nextIndex < maxValue) {
		  return true;
	  }
	  else {
		  return false;
	  }
  }
  
  public Integer next() {
      Integer value = new Integer(nextIndex);
      nextIndex += 2; //implement 2
      return value;
  }
  
  public void remove() { 
	  throw new UnsupportedOperationException();
	  }
  }
}