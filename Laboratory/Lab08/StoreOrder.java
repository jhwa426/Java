//Q05
class StoreOrder extends OrderProcessTemplate{

	@Override
	public void selectProduct() {
		System.out.println("Customer chooses the item from shelf.");
		
	}

	@Override
	public void makePayment() {
		System.out.println("Pays at counter through cash/POS");
		
	}

	@Override
	public void doDelivery() {
		System.out.println("Item delivered to in delivery counter.");
		
	}

}
