import java.util.ArrayList;

//Q08
class CompositeInstruction extends Instruction{
	private ArrayList<Instruction> instructions = new ArrayList<Instruction>();
	
	
	public CompositeInstruction(int id, String description) {
		super(id, description);
	}
	
	@Override
	public void display(String indent) {
		System.out.println(indent+super.toString());

		for(Instruction in : instructions) {
			in.display(" "+indent);

		}
	}
	
	public void add(Instruction inst) {
		this.instructions.add(inst);
	}
	
	public void remove(Instruction inst) {
		this.instructions.remove(inst);
	}
	
}
