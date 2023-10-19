import java.applet.*;
import java.awt.*;

public class withclear extends Applet{
    private int lastx, lasty;
    private Color c = Color.black;
    private Button clearButton;
    private Choice choice;

    public void init() {
        this.setBackground(Color.WHITE);
        clearButton = new Button("clear");
        clearButton.setForeground(c);
        clearButton.setBackground(Color.lightGray);
        this.add(clearButton);
        choice = new Choice();
        choice.addItem("black");
        choice.addItem("grey");
        choice.addItem("red");
        choice.addItem("blue");

        choice.setForeground(c);

        choice.setBackground(Color.lightGray);
        this.add(new Label("color :"));
        this.add(choice);
    }

    public boolean mauseDown(Event e, int x, int y) {
        lastx = x;
        lasty = y;
        return true;

    }

    public boolean mousedrag(Event e, int x, int y) {
        Graphics g = this.getGraphics();
        g.setColor(c);
        g.drawLine(lastx, lasty, x, y);
        lastx = x;
        lasty = y;
        return true;
    }

    public boolean action(Event e, Object arg) {
        if (e.target == clearButton) {
            Graphics g = this.getGraphics();
            Rectangle r = this.getBounds();
            g.setColor(this.getBackground());
            g.fillRect(r.x, r.y, r.width, r.height);
            return true;
        }
        else if (e.target == choice) {
            if (arg.equals("black"))
                c = Color.BLACK;
            else if (arg.equals("red"))
                c = Color.red;

        }
        else {
            return super.action(e, arg);
        }
    }
    

}
