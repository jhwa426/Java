class Student {
	private String name = "";
	private int studentId = 1;
	
	public Student() {
		
	}
	
	public Student(String name, int StudentId) {
		this.name = name;
		this.studentId = StudentId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		String str = String.format("%s(%d)",this.name,this.studentId);
		return str;
	}

	public static void main(String[] args) {
		Student p1 = new Student("Mia", 123);
		System.out.println(p1);
		Student p2 = new Student("Michael", 456);
		System.out.println(p2);
		System.out.println(p1 == p2);
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		
		Student p3 = new Student();
		System.out.println(p3);
	}

}
