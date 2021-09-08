// Q10
abstract class Animal {
	public abstract void canDo();
	
	public static void main(String[] args) {
		Human david = new Human();
		david.canDo();
		if (!(david instanceof Animal)) System.out.println("The Human class must extends Animal");

	}

}

class Human extends Animal{
	public void canDo() {
		System.out.println("I can walk and run");
	}
}

class Snake extends Animal{
	public void canDo() {
		System.out.println("I can crawl");
	}
}

class Dog extends Animal {
	public void canDo() {
		System.out.println("I can bark");
	}
}

class Lion extends Animal {
	public void canDo() {
		System.out.println("I can roar");
	}
}