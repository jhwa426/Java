import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

class FileComponentTreeDemo extends JFrame {
  JButton  addButton, removeButton;
  JCheckBox isFolderCheckBox;
  JTextField nameTextField;
  JTree tree;
  FileComponentTreeModel treeModel;
  Folder root;

  public FileComponentTreeDemo() {
    root = new Folder("Folder 1");
    Folder f2 = new Folder("Folder 2");
    f2.add(new File("File 3"));
    root.add(new File("File 1"));
    root.add(f2);

    treeModel = new FileComponentTreeModel(root);
    tree = new JTree(treeModel);
    addButton = new JButton("Add");
    removeButton = new JButton("Remove");
    nameTextField = new JTextField("Name", 10);
    isFolderCheckBox = new JCheckBox("Folder", true);
    addButton.addActionListener(new AddListener());
    removeButton.addActionListener(new RemoveListener());

    JPanel buttonsPanel = new JPanel();
    buttonsPanel.add(nameTextField);
    buttonsPanel.add(isFolderCheckBox);
    buttonsPanel.add(addButton);
    buttonsPanel.add(removeButton);
    getContentPane().add(buttonsPanel, BorderLayout.NORTH);
    getContentPane().add(new JScrollPane(tree), BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 200);
    setVisible(true);
    tree.setSelectionRow(2);
    for (int i: tree.getSelectionRows())
    tree.expandRow(i);
    tree.setSelectionRow(0);
  }
  //complete this
  //Q10
  class AddListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(tree.getSelectionPath() != null) {
			
			Object selectNodes = tree.getSelectionPath().getLastPathComponent();
			int index = ((Folder)selectNodes).getSize();

			if (isFolderCheckBox.isSelected()) {
				Folder folder = new Folder(nameTextField.getText());
				treeModel.insertNodeInto(folder, (FileComponent) selectNodes, index);
			}
			else {
				File file = new File(nameTextField.getText());
				treeModel.insertNodeInto(file, (FileComponent) selectNodes, index);
			}
		}
	}
  }
  
  //Q11
  class RemoveListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if(tree.getSelectionPath() != null) {
			Object selectNodes = tree.getSelectionPath().getLastPathComponent();
			treeModel.removeNodeFromParent((FileComponent) selectNodes);

		}
	}
  }
  

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() { new FileComponentTreeDemo(); }
    });
  }
}



