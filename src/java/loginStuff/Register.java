package loginStuff;

import java.sql.*;

public class Register
 {
     public static void registerUser(String user,String pass) 
     {

      try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");
 	 //creating connection with the database 
         Connection con=DriverManager.getConnection
                        ("jdbc:derby://localhost:1527/usuarios","nacho","1234");
         PreparedStatement ps = con.prepareStatement
                             ("insert into login (username, password) values (?,?)");
         ps.setString(1, user);
         ps.setString(2, pass);
         ps.executeUpdate();

        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
               
  }   
}