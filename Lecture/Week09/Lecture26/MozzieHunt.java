import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.Image;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MozzieHunt extends JFrame {

	private JPanel panel;
	private JLabel mozzie;
	private JLabel splat;
	private boolean mouseOffMozzie;
	
	public MozzieHunt() {
    	super("Mozzie Hunt");
    	setLayout(null);
    	setSize(500,500);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	panel = new JPanel();
    	panel.setLayout(null);
    	panel.setOpaque(true);
    	panel.setBackground(Color.WHITE);
    	setContentPane(panel);
    	createMozzie();
    	createSplat();
		mouseOffMozzie = true;
		ImageIcon swat = new ImageIcon(getClass().getResource("flyswat.png"));
		Image sw = swat.getImage();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension cursorSize = toolkit.getBestCursorSize(300, 300);
		Cursor c = toolkit.createCustomCursor(sw, 
				new Point(cursorSize.width/2, cursorSize.height/4), "flyswat");
		panel.setCursor(c);
		setVisible(true);		
	}
	
	private void createMozzie() {
		mozzie = new JLabel("", JLabel.CENTER);
		ImageIcon moz = new ImageIcon(getClass().getResource("mozzie.png"));
		Image img = moz.getImage();
		img = img.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		moz.setImage(img);
		mozzie.setIcon(moz);
		mozzie.setSize(50,50);
		int width = this.getWidth();
		int height = this.getHeight();
		int x = (int) (Math.random() * width * 0.6 + width * 0.2);
		int y = (int) (Math.random() * height * 0.6 + height * 0.2);
		mozzie.setLocation(x, y);
		mozzie.addMouseListener(
			new MouseAdapter() {
			    public void mouseClicked(MouseEvent e) {
		    		// We've clicked on the mozzie!
			    	int x = mozzie.getX();
			    	int y = mozzie.getY();
		    		splat.setLocation(x, y);
		    		splat.setVisible(true);
		    		splat.repaint();
		    		// new game
		    		mozzie.removeMouseListener(mozzie.getMouseListeners()[0]);
		    		mozzie.removeMouseMotionListener(mozzie.getMouseMotionListeners()[0]);
		    		createMozzie();
		    		mozzie.repaint();
		    		createSplat();
		    		mouseOffMozzie = true;
			    }
			    
			    public void mouseExited(MouseEvent e) {
			    	mouseOffMozzie = true;
			    }
		    }
		);
		mozzie.addMouseMotionListener(
			new MouseMotionAdapter() {
			    public void mouseMoved(MouseEvent e) {
			    	// Determine whether to move the label away
			    	if (Math.random() > 0.2 && mouseOffMozzie) {
			    		// Yes, move in 80% of cases
			    		int width = MozzieHunt.this.getWidth();
			    		int height = MozzieHunt.this.getHeight();
				    	int x = mozzie.getX();
				    	int y = mozzie.getY();
			    		int newx, newy;
			    		// Try new coordinates
			    		do {
			    			newx = (int) (Math.random() * (width - 50));
			    			newy = (int) (Math.random() * (height - 50));
			    		} while (newx + 50 >= x && newx <= x + 50 
			    			    && newy + 50 >= y && newy <= y + 50);
			    		mozzie.setLocation(newx, newy);
			    		mozzie.repaint();
			    	}
			    	else
			    	{
			    		mouseOffMozzie = false;
			    	}
			    }
			}
		);
		panel.add(mozzie);
	}
	
	private void createSplat() {
        splat = new JLabel("", JLabel.CENTER);
		ImageIcon spl = new ImageIcon(getClass().getResource("splat.png"));
		Image s = spl.getImage();
		s = s.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		spl.setImage(s);
		splat.setIcon(spl);
		splat.setSize(50, 50);
		splat.setVisible(false);
		panel.add(splat);
	}

}
