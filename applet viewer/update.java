import java.applet.Applet;
import java.awt.Color;

public class update extends Applet implements Runnable {
    String s = "it is simple float screen";
Thread t=null;
boolean flag;

public void init() {
    setBackground(Color.RED);

}

    
    public void start() {
        t = new Thread(this);

    }
}
