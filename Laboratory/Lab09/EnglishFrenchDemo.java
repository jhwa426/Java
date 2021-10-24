//Q07
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import javax.swing.table.*;
public class EnglishFrenchDemo extends JFrame  {
  JTable table;
  public EnglishFrenchDemo() {
    //complete the table model here  
	DefaultTableModel tableModel = new DefaultTableModel();
	table = new JTable(tableModel);
	tableModel.addColumn("English");
	tableModel.addColumn("French");
	
	tableModel.addRow(new Object[] {"house", "maison"});
	tableModel.addRow(new Object[] {"apple", "pomme"});
	tableModel.addRow(new Object[] {"tree", "arbre"});
	tableModel.addRow(new Object[] {"horse", "cheval"});
	tableModel.addRow(new Object[] {"yellow", "jaune"});
	tableModel.addRow(new Object[] {"tooth", "dent"});


    JScrollPane scrollPane = new JScrollPane(table);
    getContentPane().add(scrollPane, BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 200);
    setVisible(true);
  }

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() { new EnglishFrenchDemo(); }
    });
  }
}