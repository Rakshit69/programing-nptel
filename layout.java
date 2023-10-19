import java.awt.*;
public class layout {
    public static void main(String[] args) {
        Frame f = new Frame("it is a frame");

        Button b1 = new Button("it is 1");
        ;
        Button b2 = new Button("it is 1");
        Button b3 = new Button("it is 1");
        Button b4 = new Button("it is 1");
        Button b6 = new Button("it is 1");
        Button b7 = new Button("it is 1");
        Button b8 = new Button("it is 1");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b6);//f.add(b6,BorderLayout.East)
        f.add(b7);
        f.add(b8);
        f.setLayout(new FlowLayout(FlowLayout.LEFT));//no in border layout//f.setLayOut(new GridLayout(3,3//row,col,hgap,vgap))
        LayoutManager l = new CardLayout();
        f.setLayout(l);
        f.add("1", new Button("1"));
        f.add("2", new Button("2"));
        f.add("3", new Button("3"));
        f.add("4", new Button("4"));//first card no the what on card in layout

    }

    // public boolean keyDown(Event e, int key) {
    //     l.next(this);
    //     return true;// for card layout
    // }


}
