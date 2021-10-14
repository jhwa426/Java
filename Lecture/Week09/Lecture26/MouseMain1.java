import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//follows design 1

public class MouseMain1 extends Frame {
	
    public MouseMain1() {
        super("MouseListener");
		
        Panel mousePanel = new MousePositionPanel( );
        add( mousePanel );

        setBounds( 100, 100, 200, 200 );
        setVisible( true );
    }
	
	
    public static void main( String[ ] args ) {
        MouseMain1 mouseMain = new MouseMain1( );
    }
}

class MousePositionPanel extends Panel implements MouseListener {
    private int mouseX, mouseY;

    public MousePositionPanel( ) {
        mouseX = 100;
        mouseY = 100;

        addMouseListener( this );
    }

    public void paint( Graphics g ) {
        g.drawString( "(" + mouseX + ", " + mouseY + ")", mouseX, mouseY );
    }

    public void mousePressed( MouseEvent e ) {
        mouseX = e.getX( );
        mouseY = e.getY( );
        repaint( ); 
    }

    public void mouseReleased( MouseEvent e ) { }
    public void mouseClicked( MouseEvent e ) { }
    public void mouseEntered( MouseEvent e ) { }
    public void mouseExited( MouseEvent e ) { }
}

