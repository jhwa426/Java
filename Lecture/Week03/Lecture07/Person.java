class Person {
	private String name = "";
	private int age = 1;
	
	public Person() {
	}
	
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	public String toString() {
		String result = String.format("%s(%d)", name, age);
		return result;
	}
	
	public static void main(String[] args) {
		
//		Person p1 = new Person();
//		System.out.println(p1);
		
		Person p1 = new Person("Michael", 21);
		System.out.println(p1);
		Person p2 = new Person("Jason", 15);
		System.out.println(p2);
		Person p3 = new Person();
		System.out.println(p3);

	}

}
