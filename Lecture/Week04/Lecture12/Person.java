import java.util.ArrayList;

abstract class Person {
	protected String name = "UNKNOWN";
	
	public Person() {
		
	}
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//An abstract method named eat() which prints a message.
	public abstract void eat();
	
	public String toString() {
		String str = String.format("%s(%s)", getClass().getName(), this.name);
		return str;
	}
	
	// Q10
	public static void printEatMessages(Person[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%s, ",array[i].name);
			array[i].eat();
		}
		
	}


}
// Q6
class Student extends Person{
	public Student(String name) {
		super(name);
	}
	
	//An overridden method named eat() which prints "eating fried rice!"
	public void eat() { 
		System.out.println("eating fried rice!"); 
	}
}

// Q7
class CollegeStudent extends Student{
	public CollegeStudent(String name) {
		super(name);
	}

	public void eat() {
		System.out.println("eating Subway Sub of the Day!");
	}
}

// Q8
class TertiaryStudent extends Student{
	public TertiaryStudent(String name) {
		super(name);
	}
	public void eat() {
		System.out.println("eating roast chicken!");
	}
	
}

// Q9
class Employee extends Person{
	public Employee(String name) {
		super(name);
	}

	public void eat() {
		System.out.println("eating buffet!");
	}
}

// Q10



















