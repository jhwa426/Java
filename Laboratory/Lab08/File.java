//Q10
class File extends FileComponent{
	private String contents;
	
	public File(String name, String contents) {
		super(name);
		this.contents = contents;
	}

	public String toString() {
		return String.format("%s(%s)", super.name, this.contents);
	}
	
	public void display(String indent) {
		System.out.println(indent + super.toString() + '(' + this.contents + ')');
	}
}
