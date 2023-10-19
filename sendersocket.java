import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;

public class sendersocket {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        String s = " it is a packet of co samaj gae na";
        InetAddress ip = Inet4Address.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(s.getBytes(),s.length(),ip,3000);
        ds.send(dp);
        ds.close();
        
    }
}
