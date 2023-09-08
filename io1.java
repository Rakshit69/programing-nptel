import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;

public class io1 {
    public static void main(String[] args) {
        DataInputStream ds = new DataInputStream(System.in);// it will read in form of byte not char
       try  {
        float f = Float.valueOf("00.0");
        FileOutputStream fout = new FileOutputStream("text.txt");
        fout.write(90);//write z
        byte[] b = { '1', 'b', 'c', 'd' };
        String s = "it is the string";
        byte[] st = s.getBytes();
        fout.write(b);
        fout.write(st);
            

        fout.close();
        FileInputStream fin = new FileInputStream("text.txt");
        int i = fin.read();//read one char as int value
        System.out.println((char) i);
        BufferedInputStream bf = new BufferedInputStream(fin);
        while ((i = fin.read()) != -1) {
            System.out.println((char) i);
        }
        while ((i=bf.read())!=-1) {//both are same 
                    System.out.println((char) i);
        }
        fin.close();
        //know for rendom access 
        RandomAccessFile rn = new RandomAccessFile("text.txt", "rw");
        rn.writeInt(4);
        char c=rn.readChar();
    } catch (Exception e) {
        // TODO: handle exception
    }
       
        
        
    }
}
