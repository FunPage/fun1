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
    public void setCredentials(String emailid,String password)
    {
    this.emailid=emailid;
    this.password=password;
    }
    public void setname(String firstname,String lastname)
    {
    this.firstname=firstname;
    this.lastname=lastname;
    }
    public void setDob(String dob)
    {this.DOB=dob;}
    public void setprofilename(String profilename)
    {this.profilename=profilename;}
    public String getName()
    {return this.firstname+" "+this.lastname;}
    public String getProfileinfo()
    {return this.profilename;}
}
