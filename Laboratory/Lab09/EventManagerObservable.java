import java.util.ArrayList;

//Q01
class EventManagerObservable extends Observable{
	private ArrayList<String> messages = new ArrayList<String>();
	
	public void setMessage(String message) {
		this.messages.add(message);
		super.setChanged();
		super.notifyObservers(message);
	}
	
	public String toString() {
		return this.messages.toString();
	}

}
