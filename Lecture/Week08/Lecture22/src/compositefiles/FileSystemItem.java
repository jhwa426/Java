package compositefiles;

public abstract class FileSystemItem {
	protected Directory parent;	
	protected abstract void printFileHierarchy();
}
