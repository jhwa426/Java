//Q03
abstract class OrderProcessTemplate {
	private boolean isGift;
	
	public final void processOrder(boolean isGift) {
		selectProduct();
		makePayment();
		if(isGift == true) {
			giftWrap();
		}
		doDelivery();
	}
	
	abstract void selectProduct();
	abstract void makePayment();
	abstract void doDelivery();
	
	private void giftWrap() {
		System.out.println("Gift wrap.");
	}
}
