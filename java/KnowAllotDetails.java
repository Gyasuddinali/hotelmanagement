

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
 * Servlet implementation class KnowAllotDetails
 */
@WebServlet("/KnowAllotDetails")
public class KnowAllotDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KnowAllotDetails() {
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
          
            PreparedStatement pst=con.prepareStatement("select * from allot");
           ResultSet rs = pst.executeQuery();
 out.println("<html><body>");
           
           out.println("<h1><style>h1{text-align:center;font-size-100px;background-color:red;color:white}</style>Allotment Details</h1>"); 
       out.println("<table border=1><style>tr{color:red;text-align:center;font-size:50px}</style>");			
		  out.println("<tr>");  out.println("<th>Transaction-Id</th>"); 
		  out.println("<th>Room-No</th>");
		  out.println("<th>Resturant_Name</th>");  
			  out.println("</tr>");
    while(rs.next()) {
     String trid = rs.getString("trid");
     String rno = rs.getString("rno");
     String mname= rs.getString("mname");
 
     //out.println("<h1><style>h1{color:white;text-align:center;background-color:green}</style>Customer Details <style='color:blue'></style> </h1>: "); 
//     out.println("Transaction-Id:" +trid);
//     out.println("<br></br>");
//     out.println("Room No : " +""+rno +"");
//     out.println("<br></br>");
//     
//     out.println("mName :"+mname);
//     out.println("<br></br>");
    
         out.println("<tr>" + "<td>" + trid + "</td>" + "<td>" + rno + "</td>" + "<td>" + mname + "</td>"
     
    + "</tr>"); 

} 
out.println("</table></body></html>");

	 }
    
        catch(Exception e) {
        	e.printStackTrace();
        }
		
	}

}
