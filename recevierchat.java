import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class recevierchat  {
    public static void main (String[] args)throws Exception {
        DatagramSocket ds = new DatagramSocket(3000);
        byte[] b = new byte[233441];
        DatagramPacket dp;
        while (true) {
            dp = new DatagramPacket(b, 233441);
            ds.receive(dp);
            String s = new String(dp.getData(), 0, dp.getLength());
            System.out.println(s);
            if (s.equalsIgnoreCase("bye")) {
                break;
            }

        }
        ds.close();
    }
}
