import java.applet.Applet;
import java.awt.*;;


/**
 * intro
 */
public class intro extends Applet {
    int a;
      public void init() {
        a = Integer.parseInt(getParameter("xvalue"));
        resize(200, 200);
    }
    //variable and class always public
    public void paint(Graphics g) {
        g.drawString("hello it is me", 150, 150);//hello world appletviewer
        //init start stop paint destroy this are method touse some more are
        g.drawRect(a, a, a, a);//for rectangle drawing
    }

  
    // public static void main(String[] args) {
        
    // }
}