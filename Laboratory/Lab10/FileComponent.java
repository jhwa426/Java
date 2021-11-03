//Q07
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import java.io.*;
import java.util.*;
import javax.swing.event.*;
abstract class FileComponent {
  protected String name;
  protected FileComponent parent = null;
  public FileComponent(String name) { this.name = name; }
  public FileComponent getParent() { return parent; }
  public void setParent(FileComponent parent) { this.parent = parent;}
  public String toString() { return name; }
  public FileComponent[] getPath() {
    return getPathToRoot(this, 0);
  }
  protected FileComponent[] getPathToRoot(FileComponent aNode, int depth) {
    FileComponent[] retNodes;
      if(aNode == null) {
         if(depth == 0) return null;
         else retNodes = new FileComponent[depth];
      } else {
         depth++;
         retNodes = getPathToRoot(aNode.getParent(), depth);
         retNodes[retNodes.length - depth] = aNode;
      }
      return retNodes;
    }
}
class File extends FileComponent {
    public File(String name){
        super(name);
    }
}


class Folder extends FileComponent {
  private ArrayList<FileComponent> elements = new ArrayList<FileComponent>();
  public Folder(String name){
    super(name);
  }
  public void add(FileComponent fc){
    fc.setParent(this);
    elements.add(fc);
  }
  public void remove(FileComponent fc){
    fc.setParent(null);
    elements.remove(fc);
  }
  public int getSize() { return elements.size(); }
  public FileComponent getFileComponentAt(int index) { return elements.get(index); }
  public int indexOf(FileComponent p) { return elements.indexOf(p); }
  
}


class FileComponentTreeModel implements TreeModel {
   //Q07
  //complete this
	private Folder root;
	private ArrayList<TreeModelListener> treeModelListeners = new ArrayList<TreeModelListener>();
	
	public FileComponentTreeModel(FileComponent f) {
		
	}
	
	public Object getRoot() {
		return root;
	}
	
	public Object getChild(Object parent, int index) {
        if (!(isLeaf(parent)) && ((Folder)(parent)).getSize() >= index && index>=0 ){
            return ((Folder)(parent)).getFileComponentAt(index);
         }
         return null;
	}

	public int getChildCount(Object parent) {
        if (!(isLeaf(parent))){
            return ((Folder)(parent)).getSize();
        }
        return 0;
	}

	public boolean isLeaf(Object node) {
		return !(node instanceof Folder);
	}
	
	public int getIndexOfChild(Object parent, Object child) {
        if (!(isLeaf(parent))){
            return ((Folder)parent).indexOf((Folder)child);
             }
         return -1;
	}


  public void addTreeModelListener(TreeModelListener listener) {treeModelListeners.add(listener);}
  public void removeTreeModelListener(TreeModelListener listener) {treeModelListeners.remove(listener);}
  public void valueForPathChanged(TreePath path, Object newValue) {  }
  protected void fireTreeNodesRemoved(Object source, Object[] path,int[] childIndices,Object[] children) {
    final TreeModelEvent event = new TreeModelEvent(source, path, childIndices, children);
    for (final TreeModelListener tml : treeModelListeners)
      tml.treeNodesRemoved(event);
  }
  protected void fireTreeNodesInserted(Object source, Object[] path,int[] childIndices,Object[] children) {
    final TreeModelEvent event = new TreeModelEvent(source, path, childIndices, children);
    for (final TreeModelListener tml : treeModelListeners)
      tml.treeNodesInserted(event);
  }
  
//Q08
 public void insertNodeInto(FileComponent newChild, FileComponent parent, int index) {
     if (!(isLeaf(parent))){
    	 ((Folder) parent).add(newChild);
    	 
    	 int[] childIndices = new int[] {((Folder) parent).getSize()}; //index of the new node in the parent node. The type is an int array.

    	 Object[] children = new Object[]{newChild}; //the new node (i.e. newChild). The type is an Object array.
    	 
    	 fireTreeNodesInserted(this, parent.getPath(), childIndices, children);
     }
 }
 
 //Q09
 public void removeNodeFromParent(FileComponent selectedNode) {
	 Folder node = (Folder) selectedNode.getParent();
	 int index = node.indexOf(selectedNode);
	 node.remove(selectedNode);

	 int[] childIndices = new int[] {index};
	 Object[] children = new Object[]{selectedNode};
	 
	 fireTreeNodesRemoved(this, selectedNode.getPath(), childIndices, children);
 }

}



class TreeModelVisualiser {
  private TreeModel tm;
  private Object root;
  public TreeModelVisualiser(TreeModel t, Object root) {
      this.tm = t;
    this.root = root;
  }
  private void showAllChildren(TreeModel tm, Object node, String tab){
    if(node == null) node = root;
    System.out.println(tab + node); // calls toString to print node
    for(int i = 0 ; i <  tm.getChildCount(node); i++)
      showAllChildren(tm, tm.getChild(node, i), tab + "  ");
  }
  public void show(){
    showAllChildren(tm, root, "");// String of spaces represents tab
    System.out.println();
  }
}

//public class TestFileComponentTreeModel {
//  public static void main(String[] args) {
//    Folder a1 = new Folder("Folder 1");
//    File b1 = new File("File1");
//    File b2= new File("File2");
//    a1.add(b1);
//    a1.add(b2);
//    FileComponentTreeModel tm = new FileComponentTreeModel(a1);
//    TreeModelVisualiser f = new TreeModelVisualiser(tm, a1);
//    f.show();
//  }
//}