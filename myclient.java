import java.io.DataOutputStream;
import java.net.Socket;

public class myclient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 4000);
        DataOutputStream ds = new DataOutputStream(s.getOutputStream());
        ds.writeUTF("hello server");
        ds.flush();
        ds.close();
        s.close();
        
    }
}
