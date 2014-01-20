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
    //this is for context initialisation
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
    //this is for login
    public ResultSet Returnset(String email,String password)
    {  ResultSet rs = null;
        try
        {
        String sql="select * from Users where email=? and password=?";
        Class.forName("com.mysql.jdbc.Driver");
        String Url="jdbc:mysql://localhost:3306/SGC";
        Connection con=DriverManager.getConnection(Url,"root","root");
        PreparedStatement stmt=con.prepareStatement(sql);
        stmt.setString(1,email);
        stmt.setString(2,password);
        rs=stmt.executeQuery();
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
        return rs;
    }
    
    //this is for sign up.
    public boolean InsertTable(String firstname,String lastname,String profilename,String email,String password,String DOB)
    {
        int condition = 0;
    try
    {   String sql="Insert into Users values(?,?,?,?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
        String Url="jdbc:mysql://localhost:3306/SGC";
        Connection con=DriverManager.getConnection(Url,"root","root");
        PreparedStatement stmt=con.prepareStatement(sql);
        stmt.setString(1,firstname);
        stmt.setString(2, lastname);
        stmt.setString(3, profilename);
        stmt.setString(4, email);
        stmt.setString(5, password);
        stmt.setString(6, DOB);
       condition=stmt.executeUpdate();
        
    }
    catch(Exception e)
    {System.out.println(e);}
    if(condition>0)
    {return true;}
    else
    {return false;}
    }
    
}
