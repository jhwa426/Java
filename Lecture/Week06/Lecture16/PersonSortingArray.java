import java.util.Arrays;
class Person implements Comparable<Person> {
  protected String firstname;
  protected String surname;
  protected String irdNumber;
  public Person(String firstname, String surname) {
    this.firstname = firstname;
    this.surname = surname;
  }
  public Person(String firstname, String surname, String irdNumber) {
    this(firstname, surname);
    this.irdNumber = irdNumber;
  }
  public String getIRD() {return irdNumber;}
  public String toString() {
    return firstname + ", " + surname + ", IRD=" + irdNumber;
   }
  public String getFirstname() {return firstname;}
  public String getSurname() {return surname;}
  public int compareTo(Person p) {
    return irdNumber.compareTo(p.getIRD());
  }
}
public class PersonSortingArray{
  public static void main(String[] args) {
    Person[] p = new Person[3];
    p[0] = new Person("Stanley", "Smith", "123-456-789");
    p[1] = new Person("David" , "Clark", "999-222-111");
    p[2] = new Person("Jane", "Graff", "245-123-345");

    Arrays.sort(p);
    System.out.println();

    for (int i=0; i<p.length; i++) {
      System.out.println(p[i]);
    }
  }
}