import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.URL;
import java.net.URLConnection;

public class networking {
    public static void main(String[] args) {
        try {
            URL u = new URL("http://nptel.ac.in/courses.php");
            System.out.println(u.getProtocol());
            System.out.println(u.getPort());//getpath  getfilegetHost()
            URLConnection uc = u.openConnection();
            InputStream i = uc.getInputStream();
            int r;
            while ((r = i.read()) != -1) {
                System.out.println((char) r);
            }
            HttpURLConnection huc = (HttpURLConnection) u.openConnection();
            for (int j = 1; j <= 8; j++) {
                System.out.println(huc.getHeaderFieldKey(j));
            }
            Inet4Address in = (Inet4Address) Inet4Address.getByName("www.nptel.ac.in");
            System.out.println(in.getHostAddress() + in.getHostName());

        } catch (Exception e) {
System.out.println(e);
        }
        
      
    }
}
