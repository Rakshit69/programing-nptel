import javax.swing.*;

class dialog
{
    public static void main(String []args)
    {
        String s=JOptionPane.showInputDialog("what is its name");
        JOptionPane.showMessageDialog(null,"your name is "+s);

        int t=Integer.parseInt( JOptionPane.showInputDialog("what is your age"));
        JOptionPane.showMessageDialog(null,"your age is "+t);

    }



}

