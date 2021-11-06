
public class test {
	public static void main(String[] args) {
		Folder a1 = new Folder("Folder 1");
		File b1 = new File("File1");
		File b2= new File("File2");
		File b3= new File("File3");
		File b4= new File("File4");
		Folder a2 = new Folder("Folder 2");
		Folder a3 = new Folder("Folder 3");
		Folder a4 = new Folder("Folder 4");
		a1.add(a2);
		a1.add(b2);
		a2.add(a3);
		a2.add(b3);
		a3.add(a4);
		a3.add(b4);
		FileComponentTreeModel tm = new FileComponentTreeModel(a1);
		TreeModelVisualiser f = new TreeModelVisualiser(tm, a1);
		f.show();
		File c1 = new File("File a");
		File c2 = new File("File b");
		tm.insertNodeInto(c1, a4, 0);
		tm.insertNodeInto(c2, a4, 1);
		tm.removeNodeFromParent(b3);
		f.show();
	}
}
