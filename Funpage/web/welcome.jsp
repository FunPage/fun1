<%-- 
    Document   : welcome
    Created on : Jan 17, 2014, 10:18:22 PM
    Author     : sathyagriffin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import="JavaMisc.sqlop"%>
<%@page language="java" import="java.sql.*"%>
<!DOCTYPE html>
<% 
String username=request.getParameter("username");
String password=request.getParameter("password");
String profilename="";
sqlop s=new sqlop();
try{
ResultSet rs=s.Returnset(username, password);

while(rs.next())
{
    profilename=rs.getString("profilename");
}
   }
catch(Exception e){
response.sendRedirect("index.jsp");
}
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link rel="stylesheet" type="text/css" href="home.css"/>
        <title>My Space</title>
    </head>
    <body class="container">
    <center><table class="container">
            <tr id="dashboard">
                <td style="background-color: blue;">
                     <form action="welcome.jsp"><input type="submit" value="Home" class="button" style="float:left;margin-left: 10px;"/></form>
                     <form action="logout" method='post'><input type="submit" value="Signout" class="button"/></form>
                      <center><h2>FunPage</h2></center>
                     
                </td>
            </tr>
            <tr>
                <td id="sidepanel">
            <center><h2 class="button" style="margin-left: 10px;"><%=profilename%></h2></center>
                    <p> </p>
             <center><h2 class="button" style="margin-left: 50px;">Messages</h2></center>
             <p> </p>
             <center><h2>Reminders</h2></center>
             <center><input type="textarea" rows="6" style="height:150px;border:2px solid;border-radius:25px;"></textarea></center>
             <a href="#home" class="button" style="margin-left: 45px;"><center>Set Reminder</center></a>
             <center><input type="textarea" rows="6" style="height:390px;border:2px solid;border-radius:25px;" id="reminders"></textarea></center>
                </td>
                <td id="remspace">
                    <p> </p>
                    <h2 style="margin-left: 44px;">Post your Status:</h2>
                     <center><form><input type="textarea" rows="6" style="height:150px;width:800px;border:2px solid;border-radius:25px;"></textarea>
                        <input type="submit" value="post"class="button">
                        <div id="showpost" style="height:400px;width:800px;background-color: buttonface;margin-top: 100px;border:2px solid;border-radius:25px;">
                       
                        </div>
                        </center>
                </td>
            </tr>
            <tr id="footer"><td style="background-color: blue;"><center><h7> ©CopyRight to SGC Technologies.</h7></center></td></tr>
        </table></center>
    </body>
</html>
