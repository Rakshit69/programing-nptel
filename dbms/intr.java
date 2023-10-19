import java.sql.Connection;
import java.sql.DriverManager;

/**
 * intro
 */
public class intr{
// 
    public static void main(String[] args) throws Exception {
        Connection conn=null;
        try {
            String url = "jdbc:sql://localhost:3306/test";
            String user = "root";
            String password = "rakshit%@#08#51";
            //.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("connection is stablized");

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (conn != null) {
                conn.close();
                System.out.println("connection is closed");

            }
        }
    }
}