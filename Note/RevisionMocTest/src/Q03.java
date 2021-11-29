enum Size { STANDARD, MEDIUM, LARGE, EXTRALARGE; }
class Q03 {
	public static int getCost(Size pizzaSize, int numberOfPeople, int numberOfPizzas) {
		int price = 0;
		
		if (pizzaSize.equals(pizzaSize.STANDARD)) {
			price = (int) ((7 * numberOfPizzas) / (double) numberOfPeople);

		}
		else if (pizzaSize.equals(pizzaSize.MEDIUM)) {
			price = (int) ((10 * numberOfPizzas) / (double) numberOfPeople);

		}
		else if (pizzaSize.equals(pizzaSize.LARGE)) {
			price = (int) ((13 * numberOfPizzas) / (double) numberOfPeople);

		}
		else if (pizzaSize.equals(pizzaSize.EXTRALARGE)){
			price = (int) ((16 * numberOfPizzas) / (double) numberOfPeople);
			
		}
		return price;
	}

	public static void main(String[] args) {
		System.out.println(getCost(Size.STANDARD, 3, 3));
		System.out.println(getCost(Size.EXTRALARGE, 8, 4)); 
	}

}
