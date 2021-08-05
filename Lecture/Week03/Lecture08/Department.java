import java.util.ArrayList;

class Department {
	private String name = "UNKNOWN";
	private ArrayList<Student> students = new ArrayList<Student>();
	private int count = 0;
	
	public Department() {
		
	}
	
	public Department(String name) {
		this.name = name;
		
	}
	
	public Department(String name, ArrayList<Student> studentList) {
		this.name = name;
		this.students = studentList;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addStudent(Student s) {
		students.add(s);
		count += 1;
	}
	
	public String toString() {
		String str = String.format("%s(number of students=%d)", this.name, this.count);
		return str;
	}
	
	
	
	public static void main(String[] args) {
//		Student p1 = new Student("Mia", 123);
//		Student p2 = new Student("Michael", 456);
//		Department cs = new Department("Computer Science");
//		cs.addStudent(p1); cs.addStudent(p2);
//		System.out.println(cs);
		
		Student p1 = new Student("Mia", 123);
		Department cs = new Department();
		System.out.println(cs);
		cs.addStudent(p1);
		cs.setName("Computer Science");
		System.out.println(cs);

	}

}
