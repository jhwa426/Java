//DrawingPanel
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import java.util.ArrayList;

import javax.swing.JPanel; //painting panel
import javax.swing.Timer; //timer
import java.awt.event.ActionListener; //event from timer going off
public class DrawingPanel extends JPanel implements ActionListener {

	Timer timer;
	private ArrayList<StickFigure> figures;
	
	// Constructor sets up timer and reference to the array of figures
	public DrawingPanel(ArrayList<StickFigure> figures){
		timer = new Timer(5, this); // 10 ms delay
		timer.start();
		this.figures = figures;
	}
	
	// This method paints everything in the graphics object g
	// and then moves the figures ready for the next paint
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(StickFigure f: figures){
			f.paint(g);
			f.move();
			f.walk();
		}
	}
	// This method gets executed when the timer goes off - every 10msec
	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();  // calls paintComponent() 
		            // (default behaviour for JPanel)
	}
}
