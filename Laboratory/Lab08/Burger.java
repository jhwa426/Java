//Q01
abstract class Burger {
	public final void make() {
	    layBread();
	    spreadSauce();
	    addLettuce();
	    addToppings();
	}
	
	private void layBread() { System.out.println("lay bread"); }
	private void spreadSauce() { System.out.println("spread Sauce"); }
	private void addLettuce(){ System.out.println("add lettuce"); }
	
	abstract void addToppings();

}


