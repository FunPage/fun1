/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

/**
 *
 * @author sathyagriffin
 */
public class FunUser {
    private String firstname;
    private String lastname;
    private String DOB;
    private String profilename;
    private String emailid;
    private String password;
    public void setfirstname(String name)
    {this.firstname=name;}
    public void setlastname(String name)
    {this.lastname=name;}
    public void setDOB(String dob)
    {this.DOB=dob;}
    public void setemailid(String email)
    {this.emailid=email;}
    public void setpassword(String password)
    {this.password=password;}
    public void setprofilename(String name)
    {this.profilename=name;}
    public String getfirstname()
    {return this.firstname;}
    public String getlastname()
    {return this.lastname;}
    public String getDOB()
    {return this.DOB;}
    public String getprofilename()
    {return this.profilename;}
    public String getemailid()
    {return this.emailid;}
    public String getpassword()
    {return this.password;}    
    
}
