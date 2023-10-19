import java.awt.*;

public class frameintro {
    public static void main(String[] args) {
        Frame f = new Frame("it is a frame");
        Panel p = new Panel();
        Button b = new Button("click me");
        b.setBounds(20, 20, 200, 200);
        
        Checkbox c = new Checkbox("java", true);//bydefault it is true

        CheckboxGroup cg = new CheckboxGroup();
        Checkbox cb = new Checkbox("in group", cg, false);
        f.add(c);
        f.add(cb);
        //no cg
        //same setbounds x,y,length ,brith
        // same lable textfield text area
        List l = new List(4);//set bound
        l.add("iteam 1");
        l.add("iteam 2");        
        l.add("iteam 4");
        Choice c = new Choice();//same as list
        f.add(l);
        f.setSize(300, 300);//resizee depricated
        p.setSize(0, 0);
        f.add(p);
        f.setBackground(Color.RED);
        f.setLayout(null);
        
        f.setVisible(true);
    }
}
