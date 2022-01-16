//Q06
enum RelationshipType { FAMILY, RELATIVE, FRIEND, COLLEAGUE; }
class Person {
	  protected String name, phoneNumber;
	  public Person(String n, String p) {  name = n; phoneNumber = p; }
	  public String getName() {return name;}
	  public String getPhoneNumber() { return phoneNumber; }
	  public String toString() { return String.format("%s (%s)", name, phoneNumber);}
	}
	

class Contact extends Person implements Comparable<Contact> {
	private RelationshipType relationship = RelationshipType.FRIEND; //greeting for the gift voucher
	
	public Contact(String n, String p) {
		super(n, p);

	}

	public Contact(String n, String p, RelationshipType rt) {
		super(n, p);
		this.relationship = rt;

	}
	
	public String toString() {
		return String.format("%s (%s), %s (%s)", super.name, super.phoneNumber, super.phoneNumber,this.relationship.toString());
	}
	
	public int compareTo(Contact other) {
//		return this.name.compareTo(other.name);// positive
//		return other.name.compareTo(this.name); // negative
		
		if (Integer.parseInt(phoneNumber) != Integer.parseInt(other.phoneNumber)) {
			if (Integer.parseInt(phoneNumber) < Integer.parseInt(other.phoneNumber)) {
				return other.name.compareTo(this.name); // negative
			}
			else {
				return this.name.compareTo(other.name);// positive
			}
		}
		else {
			return 0;
		}
	}
}



