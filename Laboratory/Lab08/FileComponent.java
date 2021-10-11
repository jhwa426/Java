//Q09
abstract class FileComponent {
	protected String name;
	protected FileComponent parent = null;
	
	public FileComponent(String name) {
		this.name = name;
	}
	
	public FileComponent getParent() {
		return this.parent;
	}
	
	public void setParent(FileComponent parent) {
		this.parent = parent;
	}
	
	public String toString() {
		return String.format("%s(%s)", this.name, this.parent);
	}
	
	public String getPath() {
		String str = "->";
		if(this.parent != null) {
			return this.parent.getPath().toString() + str + this.name;
		}
		return name;
	}
	
	abstract void display(String indent);
}
