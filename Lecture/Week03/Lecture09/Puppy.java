class Puppy {
	private int puppyAge=1;
	private String puppyName;
	
	public Puppy(String name){
	   puppyName=name;
	}
	
	public Puppy(String name, int puppyAge) {
		this.puppyName = name;
		this.puppyAge = puppyAge;
	}
	
	public void setAge( int age ){
	   puppyAge = age;
	}
	
	public int getAge(){
	   return puppyAge;
	}	

	public String toString() {
		String str = String.format("%s(%d)", puppyName, puppyAge);
		return str;
	}
	
	public boolean equals(Object obj) {
		return (obj instanceof Puppy) && ((Puppy)obj).puppyAge == this.puppyAge && ((Puppy)obj).puppyName == this.puppyName;
	}
	
	
	
	
	public static void main(String[] args) {
		Puppy p = new Puppy("Bubble", 5);
		System.out.println(p);
		Puppy p2 = new Puppy("Sunny", 5);
		System.out.println(p2);
		Puppy p3 = new Puppy("Bubble", 5);
		System.out.println(p3);
		System.out.println(p.equals(p2));
		System.out.println(p.equals(p3));

	}

}
