/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection_pool;


import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author dell
 */
public class MyConnection {
   
    
    public static Connection getConnection()
    {
        Connection cn=null;
        try
        {
     Class.forName("com.mysql.cj.jdbc.Driver");
       
      cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Login","root","2424");
        }
        catch(Exception e)
        {
            
        }
        return cn;
    }
    
}
