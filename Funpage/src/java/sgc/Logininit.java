/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sgc;
import JavaMisc.sqlop;
import java.sql.ResultSet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author taggo
 */
public class Logininit extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
    //creating the object for querying.
        response.setContentType("text/plain");
        PrintWriter out=response.getWriter();
        String space=" ";
        ResultSet rs;
        sqlop s=new sqlop();
        String email=request.getParameter("username");
        String password=request.getParameter("password");
        rs=s.Returnset(email,password);
        try {
            while(rs.next())
            {
                String firstname=rs.getString("firstname");
                String lastname=rs.getString("lastname");
                String profilename=rs.getString("profilename");
                String DOB=rs.getString("DOB");
                out.println(firstname+space+lastname+space+profilename+space+DOB);
            }
        } catch (Exception ex) {
           System.out.println(ex);
        }
    }
    
}
