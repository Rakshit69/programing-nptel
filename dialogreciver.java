import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class dialogreciver {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("127.0.0.1", 4000);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String ssend="";
        String sre = "";
       
while (!sre.equals("bye"))
{
    ssend = bf.readLine();
            dos.writeUTF(ssend);
            sre = dis.readUTF();
            System.out.println("server says :-" + sre);
            
            dos.flush();
}
        dis.close();
        s.close();
        

    }
}
