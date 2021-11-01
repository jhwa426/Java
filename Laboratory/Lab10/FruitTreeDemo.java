//Q04
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

class FruitTreeDemo extends JFrame {
	JTextField nameTextField, indexTextField;
	JButton addButton, removeButton;
	JTree tree;
	DefaultTreeModel treeModel;
	DefaultMutableTreeNode root;

  public FruitTreeDemo() {
	root = new DefaultMutableTreeNode("Fruit");
	root.add(new DefaultMutableTreeNode("apple"));
	root.add(new DefaultMutableTreeNode("orange"));
	root.add(new DefaultMutableTreeNode("banana"));
	root.add(new DefaultMutableTreeNode("kiwifruit"));
	root.add(new DefaultMutableTreeNode("grapefruit"));
	treeModel = new DefaultTreeModel(root);
	tree = new JTree(treeModel);

  	nameTextField = new JTextField("watermelon", 10);
  	indexTextField = new JTextField("1", 5);
  	addButton = new JButton("Add");
  	removeButton = new JButton("Remove");
  	//addButton.addActionListener(new AddListener());
  	//removeButton.addActionListener(new RemoveListener());
  	JPanel buttonsPanel = new JPanel();
  	buttonsPanel.add(new JLabel("Enter:"));
    buttonsPanel.add(nameTextField);
    buttonsPanel.add(addButton);
    buttonsPanel.add(new JLabel("Remove by index:"));
    buttonsPanel.add(indexTextField);
    buttonsPanel.add(removeButton);
    getContentPane().add(buttonsPanel, BorderLayout.NORTH);
    getContentPane().add(new JScrollPane(tree), BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 200);
    setVisible(true);
  }

 //complete both inner member classes here
  class AddListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		DefaultMutableTreeNode child = new DefaultMutableTreeNode(nameTextField.getText());
		int count = root.getChildCount(); //5
		treeModel.insertNodeInto(child, root, count);
	}
  }
  
  class RemoveListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		int index = Integer.parseInt(indexTextField.getText());

		if((index >= 0) && (index <= root.getChildCount())){
			DefaultMutableTreeNode c = (DefaultMutableTreeNode) treeModel.getChild(root, index);
			c.removeFromParent();
		}
	}
  }
  

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() { new FruitTreeDemo();}
	});
  }
}