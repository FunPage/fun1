<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fun Login</title>
        <link rel="stylesheet" type="text/css" href="login.css.css">
        <script src="Scripts/essential.js"></script>
    </head>
    <body onload="displaydashboard()">
        <div id="space">
         <div id="panel">
             <div id="dashboard"><div><form action="signup.html"><input type="submit" value="Sign Up" class="button"/></form></div><div><center><h1 id="time"></h1></center></div></div>
         </div>
         </div>
            
        <div align="center">    
    <form id="contactform" class="rounded" method="get" action="welcome.jsp">
 
    <div class="field">
    <label for="username">Username:</label>
    <input type="text" class="input" name="username" id="name" value="your email id" />
    <p class="hint">Enter your Email.</p>
    </div>
        <p>                </p>
    <div class="field">
    <label for="password">password:</label>
    <input type="password" class="input" name="password" id="email" value="password"/>
    <p class="hint">Enter your password.</p>
    </div>
        <p> </p>
        <h7><a href="#forget" class="rellink"><center>forgotten password ?</center></a></h7>
    <input type="submit" name="Submit"  class="button" value="Login" />
        </div>
    </form>
            <div id="footer" style="float: down;color: whitesmoke;">
                <center>copyright to SGC technologies</center>
            </div>
    </body>
</html>