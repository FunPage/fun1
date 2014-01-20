/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validate()
{
	//validating the signup field
var firstname;
var lastname;
var profilename;
var dob;
var emailid;
var password0;
var password1;
firstname=document.signupform.firstname.value;
lastname=document.signupform.lastname.value;
profilename=document.signupform.profilename.value;
dob=document.signupform.DOB.value;
emailid=document.signupform.emailid.value;
password0=document.signupform.password0.value;
password1=document.signupform.password1.value;
if(firstname=="")
	{
	alert("please enter the firstname");
	document.signupform.firstname.focus();
	return false;
	}
if(lastname=="")
	{
	alert("please enter the lastname");
	document.signupform.lastname.focus();
	return false;
	}
if(profilename=="")
	{
	alert("please enter your profilename");
	document.signupform.profilename.focus();
	return false;
	}
if(dob==" ")
	{
	alert("please enter your date of birth");
	document.signupform.DOB.foucs();
	return false;
	}
if(emailid="")
	{
	alert("please enter the email id");
	document.signupform.emailid.focus();
	return false;
	}
if(password0=="")
	{
	alert("please enter the password");
	document.signupform.password0.focus();
	return false;
	}
if(password1=="")
	{
	alert("please confirm the password");
	document.signupform.password1.focus();
	return false;
	}
if(password0!=password1)
	{
	alert("please prompt the passwords");
	document.signupform.password1.focus();
	return false;
	}
return (true);
}


