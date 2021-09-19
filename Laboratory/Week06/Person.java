//Q10
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
	protected String name;
	protected int age;
}


class PersonAgeComparator implements Comparator<Person>{
  public int compare(Person h1, Person h2){
    return h1.age - h2.age;
}
  
  public static void sortingByAge(ArrayList<Person> myList) {
	  //Create an instance of the anonymous class. The name of the object is "obj".
	    Comparator<Person> obj = new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.age - p2.age;
			}
	    };
	  
	  Collections.sort(myList, obj);
	  System.out.println(myList);
	}

}