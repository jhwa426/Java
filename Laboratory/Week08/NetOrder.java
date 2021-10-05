//Q04
class NetOrder extends OrderProcessTemplate{

	@Override
	public void selectProduct() {
		System.out.println("Item added to online shopping cart");
		System.out.println("Get gift wrap preference");
		System.out.println("Get delivery address.");
	}

	@Override
	public void makePayment() {
		System.out.println("Online Payment through Netbanking or card");
		
	}

	@Override
	public void doDelivery() {
		System.out.println("Ship the item through post to delivery address");
		
	}

}
