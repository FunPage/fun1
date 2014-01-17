/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sgc;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;
/**
 *
 * @author sathyagriffin
 */
public class dbinit implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            String url="jdbc:mysql://localhost:3306/";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,"root","root");
            Statement stmt=con.createStatement();
            stmt.execute("Create Database SGC");
            stmt.executeUpdate("Create Table Users (firstname varchar(255),lastname varchar(255),profilename varchar(255),email varchar(45),password varchar(255),DOB DATE())");
            } catch (Exception ex) {}
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
            try{ String url="jdbc:mysql://localhost:3306/";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,"root","root");
            Statement stmt=con.createStatement();
            stmt.execute("Drop Database SGC");}
            catch(Exception e){}
    }
    
}
