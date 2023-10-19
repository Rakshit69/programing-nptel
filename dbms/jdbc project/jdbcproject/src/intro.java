
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;



public class intro {

    public static void main(String[] args) throws Exception {
        //driver load 
        // stablish connection
        // statement 
        //excute query
        //
        Connection conn=null;
        try {
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "rakshit%@#08#51";
            //.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, user, password);
            Statement std = conn.createStatement();
            boolean b=std.execute("create database one");
            System.out.println("connection is stablized");

            System.out.println("data base created sucessfully "+ b);
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
