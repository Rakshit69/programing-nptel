import java.applet.Applet;
import java.awt.Color;
import java.io.IOException;

public class update extends Applet implements Runnable {
    String s = "it is simple float screen";
Thread t=null;
boolean flag;
int state;

public void init() {
    setBackground(Color.RED);
}

    
public void start() {
    t = new Thread(this);
    flag = false;
    t.start();

}

public void run() {
    char ch;
    for (;;) {
        try {
            repaint();
            Thread.sleep(250);
            ch = s.charAt(0);
            s = s.substring(1, s.length());
            s += ch;
            if (flag) {
                break;
            }

        } catch (InterruptedException e) {
         
        }
    }
}

public void stop() {
    flag = true;
    }
}
