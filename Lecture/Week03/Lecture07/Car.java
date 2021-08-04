class Car {

	// Default Constructor - if a class definition does't include constructor method, the java compiler insert a default constructor with no parameters.
	
	private String make;
	private String model;
	private int year;
	private int speed;
	private int doors;
	private boolean openBonnet;

	public Car(String newMake, String newModel, int newYear, int newDoors) {
        make = newMake;
        model = newModel;
        year = newYear;
        doors = newDoors;
        speed = 0;
        openBonnet = false;
	}
	
    public void accelerate(int howMuch) {
        speed += howMuch;
    }
	
	public String toString() {
		String result = String.format("%s %s %s %s %d", make,model,year, doors, speed);
		return result;
//		return make + " " + model + " " + year + " " + doors + speed;
	}

	public static void main(String[] args) {
		Car c1 = new Car("Nissan", "Leaf", 2010, 4);
		System.out.println(c1);
		Car c2 = new Car("Bentley", "Hunaudieres", 1999, 2);
		System.out.println(c2);
		
		Car c3 = new Car("Ford", "Mustang", 2008, 2);
		System.out.println(c3);
		System.out.println();
		
		c3.accelerate(10);
		System.out.println(c3);


		
	}
	
}