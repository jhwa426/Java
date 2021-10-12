import java.util.ArrayList;

// Q11
class Folder extends FileComponent{
	private ArrayList<FileComponent> elements = new ArrayList<FileComponent> ();

	public Folder(String name) {
		super(name);
	}
	
	public void add(FileComponent fc) {
		fc.parent = this;
		this.elements.add(fc);
	}
	
	public void remove(FileComponent fc) {
		fc.parent = this;
		this.elements.remove(fc);
	}

	public String toString() {
		return String.format("%s(%s)", super.name, this.elements.size());
	}
	
	public void display(String indent) {
		System.out.println(indent + super.toString() + '(' +this.elements.size() + ')');
		
		for(FileComponent file : elements) {
			file.display(" " + indent);
		}
	}
}
