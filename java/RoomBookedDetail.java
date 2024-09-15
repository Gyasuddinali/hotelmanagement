

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RoomBookedDetail
 */
@WebServlet("/RoomBookedDetail")
public class RoomBookedDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoomBookedDetail() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		try {
			 //response.setContentType("text/html"); 
	        	PrintWriter out=response.getWriter();
	        	
	        	Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","919924");
	          
	            PreparedStatement pst=con.prepareStatement("select * from r_book");
	           ResultSet rs = pst.executeQuery();
	           out.println("<html><body>");
	           
	           out.println("<h1><style>h1{text-align:center;font-size-100px;background-color:red;color:white}</style>Customer Details</h1>"); 
          out.println("<table border=1><style>tr{color:red;text-align:center;font-size:50px}</style>");			
			  out.println("<tr>"); // out.println("<th>Name</th>"); 
			  out.println("<th>Email</th>");  out.println("<th>Password</th>"); 
			  out.println("<th>Check-in</th>");  out.println("<th>Check-out</th>");
				  out.println("</tr>");
             
	  
				            
	    while(rs.next()) {
	       
	    	String email = rs.getString("email");
		     String password = rs.getString("password");
		     String checkin= rs.getString("checkinroom");
		     String checkout = rs.getString("outroom");
		    
	    // out.println("<h1><style>h1{color:white;text-align:center;background-color:green}</style>Customer Details <style='color:blue'></style> </h1>: "); 
		 
	           
	    out.println("<tr>" + "<td>" + email + "</td>" + "<td>" + password + "</td>" + "<td>" + checkin + "</td>"
               + "<td>" + checkout + "</td>" + "<td>" 
               + "</td></tr>"); 

   } 
   out.println("</table></body></html>"); 
		 }
	        catch(Exception e) {
	        	e.printStackTrace();
	        }

	}

}
