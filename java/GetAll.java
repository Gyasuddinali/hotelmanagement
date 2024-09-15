

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

import com.mysql.cj.xdevapi.Statement;

/**
 * Servlet implementation class GetAll
 */
@WebServlet("/GetAll")
public class GetAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAll() {
        super();
        // TODO Auto-generated constructor stub
        
        
               
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	
		
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		 try {
			 //response.setContentType("text/html"); 
	        	PrintWriter out=response.getWriter();
	        	
	        	Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","919924");
	          
	            PreparedStatement pst=con.prepareStatement("select * from sregister");
	           ResultSet rs = pst.executeQuery();
	           out.println("<html><body>");
	           
	           out.println("<h1><style>h1{text-align:center;font-size-100px;background-color:red;color:white}</style>Customer Details</h1>"); 
           out.println("<table border=1><style>tr{color:red;text-align:center;font-size:50px}</style>");			
			  out.println("<tr>");  out.println("<th>Name</th>"); 
			  out.println("<th>Mobile</th>");  out.println("<th>Address</th>"); 
			  out.println("<th>Email</th>");  out.println("<th>Password</th>");
				  out.println("</tr>");
              
	  
				            
	    while(rs.next()) {
	       
	     String name = rs.getString("name");
	     String mobile = rs.getString("mobile");
	     String address= rs.getString("address");
	     String email = rs.getString("email");
	     String password = rs.getString("password");
	     
	     
	    // out.println("<h1><style>h1{color:white;text-align:center;background-color:green}</style>Customer Details <style='color:blue'></style> </h1>: "); 
		 
	           
	    out.println("<tr>" + "<td>" + name + "</td>" + "<td>" + mobile + "</td>" + "<td>" + address + "</td>"
                + "<td>" + email + "</td>" + "<td>" + password + "</td>" + "<td>" 
                + "</td></tr>"); 

    } 
    out.println("</table></body></html>"); 
		 }
	        catch(Exception e) {
	        	e.printStackTrace();
	        }

		
		
	}

}
