

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Allot1
 */
@WebServlet("/Allot1")
public class Allot1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Allot1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","919924");  
			 
		  PrintWriter out = response.getWriter();
          /* TODO output your page here. You may use following sample code. */
        String rno = request.getParameter("rno");
        String mess = request.getParameter("mess");
        
        
         Statement stmt = con.createStatement();
         
         stmt.executeUpdate("insert into allot (rno,mname)values('"+rno+"','"+mess+"')");
         out.println("data is inserted");
      } catch (Exception ex) {
          Logger.getLogger(allot.class.getName()).log(Level.SEVERE, null, ex);
      }
		
	}

}
