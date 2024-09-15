

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RoomBooking
 */
@WebServlet("/RoomBooking")
public class RoomBooking extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoomBooking() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		try {
    		
			 
    		Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","919924");  
			
			PrintWriter pw=response.getWriter();
           
           String email = request.getParameter("email");
           String password = request.getParameter("password");
           String checkin = request.getParameter("checkin");
           String outroom = request.getParameter("outroom");
           
           
           Statement stmt = con.createStatement();
         
           
        int c=stmt.executeUpdate("insert into r_book(email,password,checkinroom,outroom)values('"+email+"','"+password+"','"+checkin+"','"+outroom+"') ");
           
           pw.println("room booked sucessfull");
       
//           PreparedStatement ps=con.prepareStatement("insert into r_book(email,password,checkinroom,outroom) values(?,?,?,?)");  
//			  ps.setString(1,email);
//			
//			  ps.setString(2, password);
//			  ps.setString(3, checkin1);
//			  ps.setString(4, outroom);
//			int c=ps.executeUpdate();     
          if(c>0)
           System.out.println("successfully insert");
          /*  String redirectedPage = "/parentPage";
          response.sendRedirect("registrationsuccess.jsp");*/
        } catch (Exception ex) {
        	 System.out.println("error something");
           Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
    
		
		
	}

}
