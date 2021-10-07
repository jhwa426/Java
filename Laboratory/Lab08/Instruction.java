//Q06
abstract class Instruction {
	protected int id;
	protected String description;
	
	
	public Instruction(int id, String description) {
		this.id = id;
		this.description = description;
	}
	
	public String toString() {
		return String.format("%d:%s" , this.id, this.description);
	}
	
	abstract void display(String indent);
	
	
}
