

<%@page import="java.sql.DriverManager"%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        
    </head>
    <body>
        <div style="background-image: url(image/bg1.jpg);background-repeat:no-repeat;backround-size:cover;background-attachment:fixed;">
	
				<div >
         <h1 class="text-center light text-primary">Hotel management system</h1>
				</div>
				
				
<nav class="navbar navbar-expand-lg navbar-light bg-light w-100">
  
  

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto mx-auto">
    
     <li class="nav-item">
        <a class="nav-link active" href="index.html">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="foods.html">Resturent<span class="sr-only">(current)</span></a>
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
        <div style=" margin-left: 1000px;">
            
            <a href="logout.jsp">Logout</a>
        </div>
        <div>
            <%
try{

String n =(String)session.getAttribute("uname");
//out.println(n);
          
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","919924");
         Statement stmt = con.createStatement();
         
        ResultSet rs = stmt.executeQuery("select * from sregister where sid = '"+n+"'");
        
  rs.next();
  String name = rs.getString("name");
  String email = rs.getString("email");
  String mobile= rs.getString("mobile");
  String address = rs.getString("address");
  
  out.println("Welcome  :  "+name);
  out.println("<br></br>");
  out.println("<br></br>");
  out.println("<br></br>");
  out.println("name  : "+name);
  out.println("<br></br>");
  out.println("email  : "+email);
  out.println("<br></br>");
  
  out.println("mobile  :"+mobile);
  out.println("<br></br>");
  out.println("address  :"+address);
  
   
    
    
}catch(Exception e){}
    
     %>
     
            
               <div style=" margin-left: 550px;">
            
            <a href="invoice.jsp">Check Your amount</a>
        </div>
            
            
        </div>
                                                 		<div id="footer">
			<div>
				<ul class="navigation">
					<li>
						<a href="index.html">Home</a>
					</li>
					<li>
						<a href="about.html">About</a>
					</li>
					<li>
						<a href="rooms.html">Rooms</a>
					</li>
				
					<li>
						<a href="foods.html">Food</a>
					</li>
				
					<li>
						<a href="contact.html">Contact</a>
					</li>
				</ul>
				
			
			
		<div class="container">	<p>   FOLLOW US ON  
				<a href="https://www.facebook.com/SapphireinnHSI/"><img alt="instagram" src="images/sfb.png" height="20"> </a>
				<a href="https://www.instagram.com/sapphireinn_hsi/"><img alt="facebook" src="images/sins.png" height="20"> </a>
				
			</p>
			<h5 class="text-primary text-center">Reach Us</h5>
			<p>Hotel Sapphire Inn Bihar,India</p></div>
			
			<p>
				© 2024 SIWAN BIHARR BEACH RESORT. All Rights Reserved
			</p>
			<p><i class="fa fa-user"></i>Devoloped by Gyasuddin Ali</p>
		</div>
		
</div>
    </body>
</html>
