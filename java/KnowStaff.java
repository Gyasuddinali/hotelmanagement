

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
 * Servlet implementation class KnowStaff
 */
@WebServlet("/KnowStaff")
public class KnowStaff extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public KnowStaff() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		try {
        	PrintWriter out=response.getWriter();
        	
        	Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","919924");
          
            PreparedStatement pst=con.prepareStatement("select * from staff");
           ResultSet rs = pst.executeQuery();
           out.println("<html><body>");
           
           out.println("<h1><style>h1{text-align:center;font-size-100px;background-color:red;color:white}</style>Staff Details</h1>"); 
       out.println("<table border=1><style>tr{color:red;text-align:center;font-size:50px}</style>");			
		  out.println("<tr>");  out.println("<th>Name</th>"); 
		  out.println("<th>Mobile</th>");
		  out.println("<th>Email</th>");  
			  out.println("</tr>");
    while(rs.next()) {
     String name = rs.getString("name");
     String mobile = rs.getString("mobile");
     String email = rs.getString("email");    
     out.println("<tr>" + "<td>" + name + "</td>" + "<td>" + mobile + "</td>" + "<td>" + email + "</td>"
              
             + "</tr>"); 
 } 
 out.println("</table></body></html>");
	 }
        catch(Exception e) {
        	e.printStackTrace();
        }
	}

}
