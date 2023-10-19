import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class line extends Applet implements MouseListener, MouseMotionListener {
    private int last_x, last_y;

    public void init() {
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
    }

    public void mousePressed(MouseEvent e) {
        last_x = e.getX();
        last_y = e.getY();
    }

    public void mouseDragged(MouseEvent e) {
        Graphics g = this.getGraphics();
        int x = e.getX();
        int y = e.getY();
        g.drawLine(last_x, last_y, x, y);
        last_x = x;
        last_y = y;
    }

    public void mouseExited() {

    }

    public void mouseClicked(MouseEvent e) {
        showStatus("Mouse Clicked");
    }

    public void mouseMoved() {

    }

    public void mouseEntered() {

    }

    public void mouseReleased() {

    }

}



