<%-- 
    Document   : welcome
    Created on : Jan 17, 2014, 10:18:22 PM
    Author     : sathyagriffin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link rel="stylesheet" type="text/css" href="home.css"/>
        <title>My Space</title>
    </head>
    <body>
    <center><table id="container" width="1366" border="0">
            <tr id="dashboard">
                <td>
                     <form action="welcome.jsp"><input type="submit" value="Home" class="button" style="float:left;margin-left: 10px;"/></form>
                     <form action="logout" method='post'><input type="submit" value="Signout" class="button"/></form>
                      <center><h2>FunPage</h2></center>
                     
                </td>
            </tr>
            <tr>
                <td id="sidepanel">
            <center><h2>UserName</h2></center>
                    <p> </p>
             <center><h2>Messages</h2></center>
             <p> </p>
             <center><h2>Reminders</h2></center>
             <center><input type="textarea" rows="6" style="height:150px"></textarea></center>
             <a href="#home" class="button" style="margin-left: 45px;"><center>Set Reminder</center></a>
             <center><input type="textarea" rows="6" style="height:390px" id="reminders"></textarea></center>
                </td>
                <td id="remspace">
                    <p> </p>
                    <h2 style="margin-left: 44px;">Post your Status:</h2>
                     <center><form><input type="textarea" rows="6" style="height:150px;width:1000px;"></textarea>
                        <input type="submit" value="post"class="button">
                        <div id="showpost" style="height:400px;width:1000px;background-color: buttonface;margin-top: 100px;">
                        //this is done;
                        </div>
                        </center>
                </td>
            </tr>
            <tr id="footer"><td><center><h7>CopyRight to SGC Technologies.</h7></center></td></tr>
        </table></center>
    </body>
</html>
