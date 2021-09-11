//Q6
enum Frequency {
	DAILY, WEEKLY, MONTHLY, QUARTERLY, YEARLY, UNDEFINED; 
	}

class SerialPublication {

	protected Frequency frequency = Frequency.UNDEFINED;

	//A default constructor that creates a publication with default values.
	public SerialPublication() {
		this.frequency = Frequency.UNDEFINED;
	}
	
	//An overloaded constructor
	public SerialPublication(String str) {
//		Frequency.valueOf(str.toUpperCase());
		this.frequency = Frequency.valueOf(str.toUpperCase());
	}
	
	public void setFrequency(String f) {
		Frequency value = Frequency.valueOf(f.toUpperCase());
		this.frequency = value;
	}
	
	public String getFrequency() {
		return this.frequency.toString().toLowerCase();
	}
	
	public String toString() {
		String str = String.format("SerialPublication(%s)", this.getFrequency().toUpperCase());
		return str;
	}
	
	public static void main(String[] args) {
		SerialPublication n = new SerialPublication();
		System.out.println(n.getFrequency());
		n.setFrequency("daily");
		System.out.println(n.getFrequency());
		System.out.println(n);
		SerialPublication n2 = new SerialPublication("monthly");
		System.out.println(n2);

	}

}
