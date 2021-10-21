import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class PetListDemo extends JFrame {
  JButton addButton, removeButton;
  JTextField petTextField;
  DefaultListModel<String> listModel;
  JList<String> petList;

  public PetListDemo() {
    listModel = new DefaultListModel<String>();
    listModel.addElement("cat");
    listModel.addElement("dog");
    petList = new JList<String>(listModel);
    addButton = new JButton("Add");
    removeButton = new JButton("Remove");
    petTextField = new JTextField("Frog");
    addButton.addActionListener(new AddListener());
    removeButton.addActionListener(new RemoveListener());

    JPanel buttonsPanel = new JPanel();
    buttonsPanel.add(petTextField);
    buttonsPanel.add(addButton);
    buttonsPanel.add(removeButton);
    getContentPane().add(buttonsPanel, BorderLayout.NORTH);
    getContentPane().add(petList, BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 200);
    setVisible(true);
  }
  //Q04
  //Add inner class here
  class AddListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String str = petTextField.getText();
			listModel.addElement(str);
		}
	}
  
  class RemoveListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		int index = petList.getSelectedIndex();
		if (index > -1) {
			listModel.removeElementAt(index);
		}
	}
  }

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() { new PetListDemo();}
    });
  }
}