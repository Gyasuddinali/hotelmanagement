

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
        <title>payment</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
         <!-- <link rel="stylesheet" href="css/style.css" type="text/css">-->
    </head>
    <body>
    <div style="background-image: url(image/bg1.jpg);background-repeat:no-repeat;backround-size:cover;background-attachment:fixed;">
     
				<div >
           <h1 class=" text-primary text-center">Hotel management system</h1>
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
				
				
			
        <div style=" margin-left: 1000px;">
            
            <a href="logout.jsp">Logout</a>
        </div>
        
        
            
             <h1 class="text-center">your payment successful</h1>
        <%
           String id =(String)session.getAttribute("uname");
            
            
            out.println("Your transection id is :  "+id);
        
            
             
            
        %>
            
            
       
        
        
       

        <form action="room.jsp" method="post" style="margin-left: 400px;">
            
            
            <input type="text" placeholder="enater tr id"/>
            
            <input type="submit" value="book room & food"/>
        </form>

        
       <p><i class="fa fa-user"></i>Devoloped by Gyasuddin Ali</p>
    </body>
</html>
