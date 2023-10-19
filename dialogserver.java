import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class dialogserver {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(4000);//port no
Socket s=ss.accept();
DataInputStream dis=new DataInputStream(s.getInputStream());
DataOutputStream dos=new DataOutputStream(s.getOutputStream());
BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

String srec = "";
String ssend="";

while (!srec.equals("bye")){
srec=dis.readUTF();
System.out.println("client-: " + srec);
ssend=bf.readLine();
dos.writeUTF(ssend);
dos.flush();
}
dis.close();
ss.close();
s.close();

    }
}
