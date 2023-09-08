import java.applet.Applet;
import java.awt.*;


public class app1 extends Applet {
    String s;

    public void init(Graphics g) {
        s = "init";
        setBackground(Color.red);
        setForeground(Color.cyan);
    }

    public void start() {
        s += "start";
    }

    public void paint(Graphics g) {
        s += "paint";
        g.drawString(s, 10, 30);
    }
}
