//Q7
enum Format {
	BROADSHEET, TABLOID, UNDEFINED
}
class Newspaper extends SerialPublication {
	// A private enum data field named
	private Format format = Format.UNDEFINED;
	private String name;
	
	//A constructor that creates a newspaper with the specified name.
	public Newspaper(String name) {
		this.name = name;
	}
	
	//An overloaded constructor that creates a newspaper with the specified name and frequency.
	public Newspaper(String name, String frequency) {
		this.name = name;
		super.frequency = Frequency.valueOf(frequency.toUpperCase());
	}
	
	//An overloaded constructor that creates a newspaper with the specified name, frequency and format.
	public Newspaper(String name, String frequency, String format) {
		this.name = name;
		super.frequency = Frequency.valueOf(frequency.toUpperCase());
		this.format = Format.valueOf(format.toUpperCase());
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setFormat(String f) {
		Format value = Format.valueOf(f.toUpperCase());
		this.format = value;
	}
	
	public String getFormat() {
		return this.format.toString().toLowerCase();
	}
	
	public String toString() {
		if (this.format.equals(format.UNDEFINED)) {
			return String.format("%s is in undefined format", this.name);
		}
		else if (super.frequency.equals(frequency.UNDEFINED)) {
			return String.format("%s is a newspaper published with undefined frequency in %s", this.name, this.format.toString().toLowerCase());
		}
		else {
			return String.format("%s is a %s newspaper in %s", this.name, super.frequency.toString().toLowerCase(), this.format.toString().toLowerCase());
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Newspaper n = new Newspaper("The Guardian");
		System.out.println(n);
		n.setFrequency("daily");
		n.setFormat("Broadsheet");
		System.out.println(n.toString());
		
		System.out.println();
		
		Newspaper n1 = new Newspaper("Daily Mail", "daily", "tabloid");
		System.out.println(n1);
		Newspaper n2 = new Newspaper("The Sunday Times");
		n2.setFormat("tabloid");
		System.out.println(n2.toString());

	}

}
