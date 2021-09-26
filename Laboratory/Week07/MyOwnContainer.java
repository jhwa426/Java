// Q6
class MyOwnContainer <E> {
	private E content;
	
	//A constructor which takes a parameter and creates an object.
	public MyOwnContainer (E obj) {
		this.content = obj;
		
	}
	
	public E getContent() {
		return this.content;
	}
	
	public void setContent(E other) {
		this.content = other;
	}
	
	public String toString() {
		return String.format("%s (%s)", this.content, this.content.getClass().getSimpleName());
	}
}
