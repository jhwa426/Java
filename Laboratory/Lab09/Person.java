import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import javax.swing.table.*;
import java.io.*;

class Person {
   private String name;
   private int age;
   public Person(String n, int a) {
      this.name = n;
      this.age = a;
   }
   public String getName() {return name; }
   public int getAge() {return age; }
   public String toString() { return String.format("%s(%d)", name, age);}
}

// insert PersonTableModel here

class PersonTableDemo extends JFrame  {
  JTable table;
  PersonTableModel tableModel;
  JButton addButton, removeButton;
  JTextField nameTextField, ageTextField;

  public PersonTableDemo() {
    tableModel = new PersonTableModel();
    Person[] array = new Person[]{new Person("Alan", 12), new Person("Emma", 19), new Person("Michael", 35)};
    for (Person p: array) tableModel.addRow(p);
    table = new JTable(tableModel);
    nameTextField = new JTextField("Name");
	ageTextField = new JTextField("21");
	addButton = new JButton("Add");
	removeButton = new JButton("Remove");
	addButton.addActionListener(new AddListener());
    removeButton.addActionListener(new RemoveListener());

    JScrollPane scrollPane = new JScrollPane(table);
    getContentPane().add(scrollPane, BorderLayout.CENTER);
    JPanel input_panel = new JPanel();
    input_panel.add(new JLabel("Enter:"));
    input_panel.add(nameTextField);
    input_panel.add(ageTextField);
    input_panel.add(addButton);
    input_panel.add(removeButton);
    getContentPane().add(input_panel, BorderLayout.SOUTH);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setVisible(true);
  }

  //inner member class
  //Q09
  class PersonTableModel extends AbstractTableModel {
	private String[] columnNames = {"Name", "Age"};
	private ArrayList<Person> list = new ArrayList<Person>(); 
	
	@Override
	public int getColumnCount() {
		return this.columnNames.length;
	}
	  
	@Override
	public int getRowCount() {
		return this.list.size();
	}

	public String getColumnName(int column) {
		return this.columnNames[column];
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		if(columnIndex == 0) {
			return this.list.get(rowIndex).getName();
		}
		else if (columnIndex == 1) {
			return this.list.get(rowIndex).getAge();
		}
		return null;
	}
	
	public void addRow(Person p) {
		Person p1 = new Person(p.getName(), p.getAge());
		this.list.add(p1);
	}
	
	public void removeRow(int index) {
		this.list.remove(index);
	}

  }
  
  
  //Q10
  class AddListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = nameTextField.getText();
		String age = ageTextField.getText();
		
		Person p = new Person(name, Integer.parseInt(age));
		tableModel.addRow(p);
	}
  }
  
  class RemoveListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		int index = table.getSelectedRow();
		if (index > -1) {
			tableModel.removeRow(index);
		}
	}
  }

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {new PersonTableDemo();}
    });
  }
}
