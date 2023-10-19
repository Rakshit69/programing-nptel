import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouselistnerex extends Frame implements MouseListener {
    Label l;

    mouselistnerex() {
        addMouseListener(this);
        l = new Label();
        l.setBounds(20, 50, 200, 200);
        l.setBackground(Color.red);
        add(l);
        setSize(300, 300);
        setBackground(Color.blue);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
       l.setText("this is mouse clicked");
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        
        l.setText("this is mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        
        l.setText("this is mouse exited");
    }

    @Override
    public void mousePressed(MouseEvent arg0) {

l.setText("this is mouse pressed");    }

    @Override
    public void mouseReleased(MouseEvent arg0) {

l.setText("this is mouse released");    }
    
    public static void main(String[] args) {
        new mouselistnerex();
    }
}
