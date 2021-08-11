class Animal {
	protected String name;
	protected double weight;
	
	public Animal(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setWeight(double weight) {
		if(weight > 0) {
			this.weight = weight;
		}
		
	}
	
	public String toString() {
		String str = String.format("Name=%s, weight=%.2f, type=Animal", name, weight);
		return str;
	}

	public static void main(String[] args) {
		Dog fluffy = new Dog("Fluffy", 5.2);
		System.out.println(fluffy.getName());
		Bird tweety = new Bird("Tweety", 1.2);
		System.out.println(tweety.getWeight());
		if (!(fluffy instanceof Animal)) System.out.println("Dog must be a subclass of Animal.");
		if (!(tweety instanceof Animal)) System.out.println("Bird must be a subclass of Animal");

	}

}

class Bird extends Animal {
	public Bird(String name, double weight) {
		super(name, weight);
	}
}

class Dog extends Animal {
	public Dog(String name, double weight) {
		super(name, weight);
	}
	
}









