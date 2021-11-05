import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

class SimpleTableDemo extends JFrame {
  JButton addButton, removeButton;
  JTextField nameTextField;
  JTree tree;
  DefaultTreeModel defaultTreeModel;
  DefaultMutableTreeNode root;

  public SimpleTableDemo() {
	root = new DefaultMutableTreeNode("Bob");
	root.add(new DefaultMutableTreeNode("Alan"));
	DefaultMutableTreeNode a_node = new DefaultMutableTreeNode("Paul");
    a_node.add(new DefaultMutableTreeNode("Emma"));
    a_node.add(new DefaultMutableTreeNode("Peter"));
    root.add(a_node);
	defaultTreeModel = new DefaultTreeModel(root);
	tree = new JTree(defaultTreeModel);

  	nameTextField = new JTextField("Name");
  	addButton = new JButton("Add");
  	removeButton = new JButton("Remove");
  	addButton.addActionListener(new AddListener());
  	removeButton.addActionListener(new RemoveListener());
  	JPanel buttonsPanel = new JPanel();
  	buttonsPanel.add(new JLabel("Enter:"));
    buttonsPanel.add(nameTextField);
    buttonsPanel.add(addButton);
    buttonsPanel.add(removeButton);
    getContentPane().add(buttonsPanel, BorderLayout.NORTH);
    getContentPane().add(new JScrollPane(tree), BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 200);
    setVisible(true);
  }

 //complete both inner member classes here
 //Q05
  class AddListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(tree.getSelectionPath() != null) {
			DefaultMutableTreeNode child = new DefaultMutableTreeNode(nameTextField.getText());
			
			Object selectNodes = tree.getSelectionPath().getLastPathComponent();
			int index = ((MutableTreeNode) selectNodes).getChildCount();
			
			defaultTreeModel.insertNodeInto(child, (MutableTreeNode) selectNodes, index);
		}
	}
  }
  
  //Q06
  class RemoveListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if(tree.getSelectionPath() != null) {
			Object selectNodes = tree.getSelectionPath().getLastPathComponent();
			defaultTreeModel.removeNodeFromParent((MutableTreeNode) selectNodes);
		}
	}
  }


  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() { new SimpleTableDemo();}
	});
  }
}