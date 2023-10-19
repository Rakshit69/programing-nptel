package thepacket;


import java.sql.Connection;
import java.sql.DriverManager;

public class dbconn {
    static String url = "jdbc:mysql://localhost:3306/test";
  static  String user = "root";
  static  String password = "rakshit%@#08#51";

    static  Connection connect() {
        try {
                return  DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            return null;
        }
    }
}
