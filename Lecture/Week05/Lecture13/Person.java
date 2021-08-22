//Q5
class Person implements Comparable<Person> {
	private String name;
	private int age=1;
	
	public Person(String n) {
		name = n;
	}
	
	public Person(String n, int a) {
		name = n; 
		age = a;
	}
	
	public String toString() {
		return String.format("%s(%d)",name,age);
	}
	
	public int compareTo(Person other) {
		return this.name.compareTo(other.name);
//		return this.age - other.age; // age
//		return this.name == other.name ? this.name.compareTo(other.name) : this.age - other.age;
		// if first name is equal
	}

	  
	  
	public static void main(String[] args) {
		Person p1 = new Person("Dick Smith", 21);
		Person p2 = new Person("Anna Wong", 29);
		System.out.println(p1.compareTo(p2));

	}

}
