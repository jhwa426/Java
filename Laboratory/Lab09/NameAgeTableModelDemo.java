
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import javax.swing.table.*;
public class NameAgeTableModelDemo extends JFrame  {
  DefaultTableModel defaultTableModel;
  JButton changeButton;

  public NameAgeTableModelDemo() {
    Object[][] data = {
  {"Mary", new Integer(5)},
  {"Alison", new Integer(13)},
  {"Kathy", new Integer(21)},
  {"Mark", new Integer(39)},
  {"Emma", new Integer(42)}
  };
    String[] columnNames = {"First Name", "Age"};
    defaultTableModel = new DefaultTableModel(data, columnNames);
    changeButton = new JButton("Change");
    changeButton.addActionListener(new MyListener());

    JTable table = new JTable(defaultTableModel);
    getContentPane().add(changeButton, BorderLayout.NORTH);
    JScrollPane scrollPane = new JScrollPane(table);

    getContentPane().add(scrollPane, BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setVisible(true);
  }
  //complete the inner member class here
  //Q08
  class MyListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		int size = defaultTableModel.getRowCount();
		
		for(int i=0; i<size; i++) {
			int age = (int) defaultTableModel.getValueAt(i, 1);
//			System.out.println(age);
            defaultTableModel.setValueAt(age+1, i, 1);
		}
	}
  }

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {new NameAgeTableModelDemo();}
    });
  }
}