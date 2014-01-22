<%-- 
    Document   : welcome
    Created on : Jan 17, 2014, 10:18:22 PM
    Author     : sathyagriffin
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="JavaMisc.sqlop"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link rel="stylesheet" type="text/css" href="login.css.css"/>
        <title>My Space</title>
    </head>
    <body>
        <%
        String name=request.getParameter("username");
        String password=request.getParameter("password");
        String dbname="SGC";
        String dbuser="root";
        String dbpass="root";
        String firstname,lastname,profilename;
        String connectionUrl = "jdbc:mysql://localhost:3306/"+dbname;
        Connection con=DriverManager.getConnection(connectionUrl,dbuser,dbpass);
        String query="Select * from Users where emailid="+name+"and password="+password;
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(query);
        while(rs.next())
        {
         
        }
        %>
    </body>
</html>
