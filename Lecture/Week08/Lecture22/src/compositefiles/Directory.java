package compositefiles;


import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemItem{
	private String name;
    private List<FileSystemItem> fileNodes = new ArrayList<FileSystemItem>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemItem generalFile) {
        fileNodes.add(generalFile);        
    }

    public void printFileHierarchy() {
        System.out.println(FileClient.indentRight + name);
        FileClient.indentRight.append("   ");
        for (FileSystemItem file : fileNodes) {
            file.printFileHierarchy();
        }
        FileClient.indentRight.setLength(FileClient.indentRight.length() - 3);
    }
}
