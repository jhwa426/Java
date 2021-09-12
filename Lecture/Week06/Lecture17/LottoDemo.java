// Q3
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class LottoDemo extends JFrame  {
  JTextField textField1;
  JButton pressButton;
  Random rand = new Random(30);
  public LottoDemo() {
    textField1 = new JTextField(10);
    pressButton = new JButton("RANDOM LOTTO NUMBERS");
    pressButton.addActionListener( new MyListener());
    JPanel p = new JPanel();
    p.add(textField1);
    p.add(pressButton);
    getContentPane().add(p);
    setSize(400, 200);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
//complete this
// 6 random number to generate  
  public class MyListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		StringBuffer str = new StringBuffer();
		
		for(int i=0; i<6; i++) {
			int randNum = rand.nextInt(40)+1;
			str.append(randNum + " ");
		}
		textField1.setText(str.toString());
	}
	  
  }
  
  
  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() { new LottoDemo(); }
    });
  }
}