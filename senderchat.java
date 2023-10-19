import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class senderchat {
   
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        DatagramPacket dp;
        Scanner scn = new Scanner(System.in);
        InetAddress ip = InetAddress.getLocalHost();
        while (true) {
            String s = scn.nextLine();
            dp = new DatagramPacket(s.getBytes(), s.length(), ip, 3000);
            ds.send(dp);
            if (s.equalsIgnoreCase("bye")) {
                break;
            }

        }
        ds.close();

        
    }
    
}
