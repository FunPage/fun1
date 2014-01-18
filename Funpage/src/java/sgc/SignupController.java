package sgc;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import JavaMisc.sqlop;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sathyagriffin
 */
public class SignupController extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       try
       {
          //boolean condition;
        sqlop s=new sqlop();
        String firstname=request.getParameter("firstname");
        String lastname=request.getParameter("lastname");
        String profilename=request.getParameter("profilename");
        String emailid=request.getParameter("emailid");
        String password=request.getParameter("password0");
        String DOB=request.getParameter("DOB");
        response.setContentType("text/plain");
        PrintWriter out=response.getWriter();
       if(s.InsertTable(firstname, lastname, profilename, emailid, password, DOB))
        {response.sendRedirect("welcome.jsp");}
        else
        {response.sendRedirect("MiscWebPages/SignUpincomplete.html");}
        //condition=profilename.isEmpty() && emailid.isEmpty() && password.isEmpty() && firstname.isEmpty() && lastname.isEmpty() && DOB.isEmpty();
       // System.out.println(condition);
        /*if(condition)
        {
        response.sendRedirect("SignUpincomplete.html");
        out.println("failed signup");
        }
        else
        {
        if(s.InsertTable(firstname, lastname, profilename, emailid, password, DOB))
        {out.println("signup successfull");}
        else
        {out.println("failed signup");}
        }*/
       }
       catch(Exception e){System.out.println(e);}
    }

   
}
