package noncompositefiles;

import java.util.ArrayList;
import java.util.List;

class Directory {
    private String name;
    private ArrayList fileNodes = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Object obj) {
        fileNodes.add(obj);
    }

    public void printFileHierarchy() {
        System.out.println(FileClient.indentRight + name);
        FileClient.indentRight.append("   ");
        for (Object file : fileNodes) {            
            String name = file.getClass().getSimpleName();
            if (name.equals("Directory")) {
                ((Directory)file).printFileHierarchy();
            } else {
                ((File)file).printFileHierarchy();
            }
        }
        FileClient.indentRight.setLength(FileClient.indentRight.length() - 3);
    }
}