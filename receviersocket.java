import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class receviersocket {
    public static void main(String[] args)  throws Exception{
        DatagramSocket gs = new DatagramSocket(3000);
        byte[] bs = new byte[1024];
        
        DatagramPacket dp = new DatagramPacket(bs, 1024);
        gs.receive(dp);
        
        String s = new String(dp.getData(), 0, dp.getLength());
        System.out.println( s);
    }
}
