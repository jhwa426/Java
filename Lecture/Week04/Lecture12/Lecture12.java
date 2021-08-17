class Lecture12 {

	public static void printEatMessages(Person[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%s, ",array[i].name);
			array[i].eat();
		}
		
	}

}
