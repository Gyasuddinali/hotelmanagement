
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <title>allot</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  
    </head>
    <body>
       <div id="header">
       <div >
                   <h1>Hotel management system</h1>
				</div>
				
				
<nav class="navbar navbar-expand-lg navbar-light bg-light w-100">
  
  

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto mx-auto">
    
     <li class="nav-item">
        <a class="nav-link" href="home.html">Home</a>
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
        <div  style="margin-left: 400px;">
            <form action="Allot1" method="post">
                
                <pre>


                  <h1>enter new room entry</h1>

                    <input type="text" name="rno" placeholder="enter room no"/>

                    <input type="text" name="mess" placeholder="enter resturent food name"/>

                    <input type="submit" value="insert"/>


                </pre>

                
            </form>
                
                
           
            
            
            
        </div>


<p><i class="fa fa-user"></i>Devoloped by Gyasuddin Ali</p>
    </body>
</html>
