class Person {
	private String name = "";
	private int age = 1;
	private double weight;
	private double height;
	
	public Person() {}
	
	public Person(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if ((age >= 0) && (age <= 120)) {
			this.age = age;
		}
	}
	
	public void growOlder() {
		this.age += 1;
	}
	
	public boolean isOfLegalAge() {
		if(this.age >= 18) {
			return true;
		}else {
			return false;
		}
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getBodyMassIndex() {
		double bmi = ((this.weight)/(this.height*this.height));
		return bmi;
	}
	
	
	public String toString() {
		String result = String.format("%s(%d),BMI=%.2f", name, age, getBodyMassIndex());
		return result;
	}
	
	public static void main(String[] args) {

		// Q08
		Person p1 = new Person("Michael", 17, 78, 1.7);
		Person p2 = new Person("Jason", 15, 52.5, 1.54);
		System.out.println(p1);
		System.out.println(p2);
	}

}
