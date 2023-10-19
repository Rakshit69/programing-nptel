import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class myserver {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(4000);
        Socket s = ss.accept();
        DataInputStream ds = new DataInputStream(s.getInputStream());
        String st = ds.readUTF().toString();
System.out.println("message is :- "+ st);
ss.close();
        
    }
}
