import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;
class Person {
   private String name;
   public Person(String n) {
      this.name = n;
   }
   public String getName() {return name;}
   public String toString() { return name;}
}

//PersonListModel

public class PersonListDemo extends JFrame  {
  JList<Person> people;
  PersonListModel<Person> listModel;
  JButton addButton, removeButton;
  JTextField nameTextField;

  public PersonListDemo() {
    listModel = new PersonListModel<Person>();
    Person[] array = new Person[]{new Person("Mary"), new Person("John"), new Person("Alan"), new Person("Michael")};
    for (Person p: array) listModel.addElement(p);
    people = new JList<Person>(listModel);
    nameTextField = new JTextField("Name");
    addButton = new JButton("Add");
    removeButton = new JButton("Remove");
    addButton.addActionListener(new AddListener());
    removeButton.addActionListener(new RemoveListener());

    JPanel input_panel = new JPanel();
    input_panel.add(new JLabel("Enter:"));
    input_panel.add(nameTextField);
    input_panel.add(addButton);
    input_panel.add(removeButton);
    getContentPane().add(input_panel, BorderLayout.SOUTH);
    getContentPane().add(new JScrollPane(people), BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 400);
    setVisible(true);
  }
  
  //complete inner member classes here
  //Q06
  class AddListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = nameTextField.getText();
		Person p = new Person(str);
		listModel.addElement(p);
	}
  }
  
  class RemoveListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		int index = people.getSelectedIndex();
		if (index > -1) {
			listModel.removeElementAt(index);
		}
	}
  }

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() { new PersonListDemo(); }
  });
  }
}