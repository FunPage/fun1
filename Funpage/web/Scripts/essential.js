/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 */
function DisplayTime()
{
    var date=new Date();
    var times=date.toLocaleTimeString();
    document.getElementById("time").innerHTML=times;
}
function timedisplay()
{
	
}
function displaydashboard()
{
    var width=window.innerWidth;
    var panelwidth=document.getElementById("space").offsetWidth;
    document.getElementById("space").offsetWidth=width;
    var date=new Date();
    var times=date.toLocaleTimeString();
    document.getElementById("time").innerHTML=times;
    //alert(panelwidth);
    t=setTimeout(function(){displaydashboard()},500);
}
