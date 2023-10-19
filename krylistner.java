import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class krylistner extends Frame implements KeyListener {
    Label l;
    StringBuilder s;
    
    krylistner() {
        l = new Label();
        s = new StringBuilder();
        addKeyListener(this);
        l.setBounds(100, 100, 100, 100);
        l.setBackground(Color.red);
        add(l);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);

}
    public static void main(String[] args) {
        new krylistner();
    }


    @Override
    public void keyPressed(KeyEvent arg0) {
        l.setText("key is pressed");
    }

    

    @Override
    public void keyReleased(KeyEvent arg0) {
      l.setText("key is released");
    }


    @Override
    public void keyTyped(KeyEvent arg0) {
        s.append(arg0.getKeyChar());
        String st = s.toString();
        l.setText(st);
    }
}
