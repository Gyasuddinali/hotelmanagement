

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <title>JSP Page</title>
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
   
   
    </head>
    <body>
        <div id="header">
				<div>                    <h1 class="text-white bg-success text-center">Hotel management system</h1>
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
				
				
	  <div class="container-fluid bg-white text-center"> 
        <h1 class="bg-success text-white">Registered Customer Details</h1>
        
            <form action="GetAll" method="post">
                
                <input class="bg-primary text-lg" type="submit" value="Click"/>
     </form>
        </div>
			
			<div class="container-fluid bg-white text-center"> 
        <h1 class="bg-success text-white">Know Staff Details</h1>
        
            <form action="KnowStaff" method="post">
                
                <input class="bg-primary text-lg" type="submit" value="Click"/>
     </form>
        </div>
			
				<div class="container-fluid bg-white text-center"> 
        <h1 class="bg-success text-white">know Allotment Details</h1>
        
            <form action="KnowAllotDetails" method="post">
                
                <input class="bg-primary text-lg" type="submit" value="Click"/>
     </form>
        </div>                
                                      
                                      <div class="container-fluid bg-white text-center"> 
        <h1 class="bg-success text-white">Room Booked Customer Details</h1>
        
            <form action="RoomBookedDetail" method="post">
                
                <input class="bg-primary text-lg" type="submit" value="Click"/>
     </form>
        </div>
			
			</div>
        
        <div class="container-fluid text-center">
  <h1>
  <a href="allot.jsp" class="text-danger">Insert Data in Allot</a>
  </h1>
     </div>

 <div class="container-fluid text-center">
  <h1>
   <a href="admininvoice.jsp" class="text-danger">Insert Data in Invoice</a>
   </h1>
   </div>
    <br>
 
  <br>
  
  

<div class="container-fluid bg-white">        
        <h1 >Delete Customer</h1>
       
            
            <form action="delete.jsp" method="post">
                
                <input type="text" name="name" placeholder="enter customer name">
                
                <input type="submit" value="delete customer"/>
                
            </form>
        
                     </div>       
        
        
        <div class="container-fluid bg-white">       
        <h1 class="mt-20">Insert Staff</h1>
              
            <form action="staff.jsp" method="post">
                
                <input type="text" name="name" placeholder="enter  name">
                
                <input type="email" name="email" placeholder="email">
                
                <input type="text" name="mob" placeholder="mobile">
                
                <input type="submit" value="insert staff"/>
                
            </form>       
        </div>
        
         <div class="container-fluid bg-white"> 
        <h1>Delete Staff</h1>
        
            <form action="deletestaff.jsp" method="post">
                
                <input type="text" name="name" placeholder="enter name">
                
                <input type="submit" value="delete staff"/>
     
        </div>
        
       
    </body>
</html>
