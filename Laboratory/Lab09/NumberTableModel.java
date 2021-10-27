import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import javax.swing.table.*;

class NumberTableModel extends AbstractTableModel {
  private String[] columnNames = {"Number","Squared"};
  private ArrayList<Integer> list = new ArrayList<Integer>();
  public NumberTableModel(int count) {
	for (int i=1; i<=count; i++) list.add(i);
  }
  public void reset(int start, int numOfRows) {
    list.clear();
    for (int i=start; i<=start+numOfRows; i++) list.add(i);
  }
  public int getColumnCount() { return columnNames.length;}
  public int getRowCount() { return list==null?0:list.size(); }
  public Object getValueAt(int row, int col) {
    if (col == 0)
      return list.get(row);
    else if (col == 1) {
      int x = list.get(row);
      return x * x;
    } else return null;
  }
  public String getColumnName(int col) {return columnNames[col];}
}

class NumberTableDemo extends JFrame  {
  JTable table;
  NumberTableModel tableModel;
  JButton resetButton;
  JTextField startTextField, countTextField;

  public NumberTableDemo() {
    tableModel = new NumberTableModel(4);
    table = new JTable(tableModel);
    resetButton = new JButton("Reset");
    startTextField = new JTextField("2", 5);
    countTextField = new JTextField("3", 5);
    resetButton.addActionListener(new ResetListener());

    JPanel input_panel = new JPanel();
    input_panel.add(new JLabel("Start:"));
    input_panel.add(startTextField);
    input_panel.add(new JLabel("Number of rows:"));
    input_panel.add(countTextField);
    input_panel.add(resetButton);
    getContentPane().add(input_panel, BorderLayout.SOUTH);
    JScrollPane scrollPane = new JScrollPane(table);
    getContentPane().add(scrollPane, BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 200);
    setVisible(true);
  }

  //complete the inner class here
  //Q11
  class ResetListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		int start = Integer.parseInt(startTextField.getText());
		int count = Integer.parseInt(countTextField.getText());
		
		tableModel.reset(start, count);
	}
  }
  
  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {new NumberTableDemo();}
    });
  }
}