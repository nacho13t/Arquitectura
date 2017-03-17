package loginStuff;

import java.sql.*;

public class Validate
 {
     public static boolean checkUser(String user,String pass) 
     {
      boolean st =false;
      try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");
 	 //creating connection with the database 
         Connection con=DriverManager.getConnection
                        ("jdbc:derby://localhost:1527/usuarios","nacho","1234");
         PreparedStatement ps = con.prepareStatement
                             ("select * from login where username=? and password=?");
         ps.setString(1, user);
         ps.setString(2, pass);
         ResultSet rs = ps.executeQuery();
         st = rs.next();
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;                 
  }   
}