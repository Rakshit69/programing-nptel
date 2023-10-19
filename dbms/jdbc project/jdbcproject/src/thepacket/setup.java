package thepacket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class setup {
    public void createdatabase() throws Exception  {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "rakshit%@#08#51";
            //.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, user, password);
            Statement std = conn.createStatement();
            boolean b = std.execute("create database one");
            System.out.println("connection is stablized");

            System.out.println("data base created sucessfully " + b);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
               conn.close();
                System.out.println("connection is closed");

            }
        }
    }

    public void createtable() throws Exception {
     Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "rakshit%@#08#51";
            //.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, user, password);
            Statement std = conn.createStatement();
            String s = "create table student(sid int(3) primary key,sname Varchar(20),email Varchar(70),marks int(4))";
            boolean b = std.execute(s);
           

            System.out.println("table created sucessfully " + b);
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
   }

 
   public void createdata() {
       Connection conn = null;
       try {
           String url = "jdbc:mysql://localhost:3306/test";
           String user = "root";
           String password = "rakshit%@#08#51";
           //.forName("com.mysql.cj.jdbc.Driver").newInstance();
           conn = DriverManager.getConnection(url, user, password);
           String s = "INSERT into student (sid,sname,email,marks) VALUES (?,?,?,?);";
           PreparedStatement std = conn.prepareStatement(s);

           std.setInt(1, 2);
           std.setString(2, "riju");
           std.setString(3, "rakshitbossheg");
           std.setInt(4, 60);

           std.execute();// also be done by update execute

           System.out.println("data insertion sucessfully ");
           conn.close();

       } catch (Exception e) {
           e.printStackTrace();
       }
   }

   public void readdata() {
     Connection conn = null;
       try {
           String url = "jdbc:mysql://localhost:3306/test";
           String user = "root";
           String password = "rakshit%@#08#51";
           //.forName("com.mysql.cj.jdbc.Driver").newInstance();
           conn = DriverManager.getConnection(url, user, password);
           String s = "select * from student";
          Statement std = conn.createStatement();

           

          ResultSet rs= std.executeQuery(s);// also be done by update execute
          while (rs.next()) {
              System.out.println("id" + rs.getString(1));
               System.out.println("id" + rs.getString(2));
              System.out.println("id" + rs.getString(3));
              System.out.println("id" + rs.getInt(4));

    
}
           System.out.println("data insertion sucessfully ");
           conn.close();

       } catch (Exception e) {
           e.printStackTrace();
       }
    
}

public void updatedata() {

    Connection conn = null;
    try {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "rakshit%@#08#51";
        //.forName("com.mysql.cj.jdbc.Driver").newInstance();
        conn = DriverManager.getConnection(url, user, password);
        String s = "update student set sid=? where sid=?";
        PreparedStatement std = conn.prepareStatement(s);
        std.setInt(1, 4);
        std.setInt(2, 2);
        std.executeUpdate();

        // also be done by update execute

        System.out.println("data updated sucessfully ok ");
        conn.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}

public void deletedata() {
     Connection conn = null;
       try {
           String url = "jdbc:mysql://localhost:3306/test";
           String user = "root";
           String password = "rakshit%@#08#51";
           //.forName("com.mysql.cj.jdbc.Driver").newInstance();
           conn = DriverManager.getConnection(url, user, password);
           String s = "delete from student  where sid=4";
          Statement std = conn.createStatement();
          std.execute(s);
           

          // also be done by update execute
         

    

           System.out.println("data updated sucessfully ok ");
           conn.close();

       } catch (Exception e) {
           e.printStackTrace();
       }
}
}
