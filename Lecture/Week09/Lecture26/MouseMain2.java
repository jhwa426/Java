
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

//Follows Design 4

public class MouseMain2 extends Frame {
	
    public MouseMain2() {
        super("MouseListener 2" );
		
        Panel mousePanel = new MousePositionPanel( );
        add( mousePanel );
        
        setBounds( 100, 100, 200, 200 );
        setVisible( true );
    }
	
	
    public static void main( String[ ] args ) {
        MouseMain2 mouseMain = new MouseMain2( );
    }
}

class MousePositionPanel extends Panel{
    private int mouseX, mouseY;

    public MousePositionPanel( ) {
        mouseX = 100;
        mouseY = 100;

        addMouseListener( new MyMouseListener2( ));
    }

    public void paint( Graphics g ) {
        g.drawString( "(" + mouseX + ", " + mouseY + ")", mouseX, mouseY );
    }   
}

class MyMouseListener2 implements MouseListener {
	private int mouseX, mouseY;
    public void mousePressed( MouseEvent e ) {
        mouseX = e.getX( );
        mouseY = e.getY( );
        Panel p = (Panel)e.getSource();
        p.repaint( );  } //must link repaint() to a component
    public void mouseReleased( MouseEvent e ) { }
    public void mouseClicked( MouseEvent e ) { }
    public void mouseEntered( MouseEvent e ) { }
    public void mouseExited( MouseEvent e ) { }
}


