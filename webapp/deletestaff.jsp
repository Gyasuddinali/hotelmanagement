

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <title>delete</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        
        
    </head>
    <body>
        <div id="header">
				<div >
           <h1 class="bg-success text-white">Hotel management system</h1>
				</div>
				
				
<nav class="navbar navbar-expand-lg navbar-light bg-light w-100">
  
  

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto mx-auto">
    
     <li class="nav-item">
        <a class="nav-link" href="index.html">Home</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="foods.html">Food <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="about.html">About</a>
      </li>
 
 <li class="nav-item">
        <a class="nav-link" href="rooms.html">Rooms</a>
      </li>
    
    <li class="nav-item">
        <a class="nav-link" href="registration.jsp">Join Us</a>
      </li>
 
 <li class="nav-item">
        <a class="nav-link" href="contact.html">Contact</a>
      </li>
    
    </ul>
    
  </div>
</nav>
				
				
				
			
			</div>
        
    <%
try{

String name = request.getParameter("name");
//out.println(n);
          
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","919924");
         Statement stmt = con.createStatement();
         out.println("recored delete");
        stmt.execute("DELETE FROM staff WHERE name='"+name+"'");
        
        out.println("recored delete");
        
  
  
 
  
 
    
    
}catch(Exception e){}
    
     %>



    </body>
</html>

