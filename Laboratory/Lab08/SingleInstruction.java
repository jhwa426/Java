//Q07
class SingleInstruction extends Instruction{
	public SingleInstruction(int id, String des) {
		super(id, des);
	}
	
	@Override
	public void display(String indent) {
		System.out.println(indent + super.toString());
		
	}
}
