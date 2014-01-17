/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMisc;
import java.sql.*;
import javax.servlet.*;
/**
 *
 * @author sathyagriffin
 */
public class sqlop {
    
    public void CreateTable(String tablename)
    {
   try
    {
        Class.forName("com.mysql.jdbc.Driver");
        String Url="jdbc:mysql://localhost:3306/SGC";
        Connection con=DriverManager.getConnection(Url,"root","root");
        Statement stmt=con.createStatement();
        stmt.executeUpdate("Create Table Users (firstname varchar(255),lastname varchar(255),profilename varchar(255),email varchar(45),password varchar(255),DOB varchar(10))");
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
    
}
