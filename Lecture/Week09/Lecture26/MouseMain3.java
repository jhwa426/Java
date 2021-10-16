import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//follows design 3

public class MouseMain3 extends Frame {
	
    public MouseMain3() {
        super("MouseListener 3");
		
        Panel mousePanel = new MousePositionPanel( );
        add( mousePanel );

        setBounds( 100, 100, 200, 200 );
        setVisible( true );
    }
	
	
    public static void main( String[ ] args ) {
        MouseMain3 mouseMain = new MouseMain3( );
    }
}

class MousePositionPanel extends Panel {
    private int mouseX, mouseY;

    public MousePositionPanel( ) {
        mouseX = 100;
        mouseY = 100;

        addMouseListener(new MouseListener() {
            public void mousePressed( MouseEvent e ) {
                mouseX = e.getX( );
                mouseY = e.getY( );
                repaint( );
            } 
         });
    }

    public void paint( Graphics g ) {
        g.drawString( "(" + mouseX + ", " + mouseY + ")", mouseX, mouseY );
    }
}

